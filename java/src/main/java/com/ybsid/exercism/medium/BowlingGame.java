package com.ybsid.exercism.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * <a href="https://exercism.org/tracks/java/exercises/bowling">...</a>
 */
public class BowlingGame {
	private final List<Frame> frames = new ArrayList<>();
	boolean isOver() {
		return frames.size() == 10
			&& frames.stream().allMatch(f -> f.getStatus() == Status.COMPLETE);
	}
	public void roll(int roll) {
		if (roll > 10) {
			throw new IllegalStateException("Pin count exceeds pins on the lane");
		}
		if (roll < 0) {
			throw new IllegalStateException("Negative roll is invalid");
		}
		if (isOver()) {
			throw new IllegalStateException("Cannot roll after game is over");
		}
		boolean isRollConsumed = frames.stream().anyMatch(f -> f.offer(roll));
		if (!isRollConsumed && frames.size() < 10
			|| frames.size() == 0) {
			frames.add(new Frame(frames.size(), roll));
		}
	}
	public int score() {
		if (!isOver()) {
			throw new IllegalStateException("Score cannot be taken until the end of the game");
		}
		return frames.stream()
			.map(Frame::score)
			.mapToInt(Integer::valueOf)
			.sum();
	}
}
enum Status {
	NEW,
	WAITING_TWO_BONUSES,
	WAITING_ONE_BONUS,
	COMPLETE
}
class Frame {
	private int id;
	private Status status = Status.NEW;
	private final int[] scores = {0, 0, 0, 0};
	public Frame(int id, int firstRoll) {
		this.id = id;
		scores[0] = firstRoll;
		if (firstRoll == 10) {
			status = Status.WAITING_TWO_BONUSES;
		}
	}
	public Status getStatus() {
		return status;
	}
	public boolean offer(int roll) throws IllegalStateException {
		switch (status) {
			case NEW -> {
				scores[1] = roll;
				int twoRolls = scores[0] + scores[1];
				if (twoRolls > 10) {
					throw new IllegalStateException("Pin count exceeds pins on the lane");
				} else if (twoRolls == 10) {
					status = Status.WAITING_ONE_BONUS;
				} else {
					status = Status.COMPLETE;
				}
				return true;
			}
			case WAITING_ONE_BONUS -> {
				scores[2] = roll;
				if (id == 9
					&& scores[3] != 10
					&& scores[2] + scores[3] > 10
				) {
					throw new IllegalStateException("Pin count exceeds pins on the lane");
				}
				status = Status.COMPLETE;
				return false;
			}
			case WAITING_TWO_BONUSES -> {
				scores[3] = roll;
				status = Status.WAITING_ONE_BONUS;
				return false;
			}
			default -> {
				return false;
			}
		}
	}
	public int score() {
		return Arrays.stream(scores).sum();
	}
}