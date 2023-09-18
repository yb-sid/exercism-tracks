package com.ybsid.exercism.concepts;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AnnalynsInfiltrationTest {
    @Test
    public void cannot_execute_fast_attack_if_knight_is_awake() {
        boolean knightIsAwake = true;
        assertFalse(AnnalynsInfiltration.canFastAttack(knightIsAwake));
    }

    @Test
    public void can_execute_fast_attack_if_knight_is_sleeping() {
        boolean knightIsAwake = false;
        assertTrue(AnnalynsInfiltration.canFastAttack(knightIsAwake));
    }

    @Test
    public void cannot_spy_if_everyone_is_sleeping() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void can_spy_if_everyone_but_knight_is_sleeping() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void can_spy_if_everyone_but_archer_is_sleeping() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void can_spy_if_everyone_but_prisoner_is_sleeping() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void can_spy_if_only_knight_is_sleeping() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void can_spy_if_only_archer_is_sleeping() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void can_spy_if_only_prisoner_is_sleeping() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void can_spy_if_everyone_is_awake() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void can_signal_prisoner_if_archer_is_sleeping_and_prisoner_is_awake() {
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void cannot_signal_prisoner_if_archer_is_awake_and_prisoner_is_sleeping() {
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void cannot_signal_prisoner_if_archer_and_prisoner_are_both_sleeping() {
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void cannot_signal_prisoner_if_archer_and_prisoner_are_both_awake() {
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
    }

    @Test
    public void cannot_release_prisoner_if_everyone_is_awake_and_pet_dog_is_present() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = true;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_everyone_is_awake_and_pet_dog_is_absent() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void can_release_prisoner_if_everyone_is_asleep_and_pet_dog_is_present() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;
        assertTrue(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_everyone_is_asleep_and_pet_dog_is_absent() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void can_release_prisoner_if_only_prisoner_is_awake_and_pet_dog_is_present() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = true;
        assertTrue(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void can_release_prisoner_if_only_prisoner_is_awake_and_pet_dog_is_absent() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        assertTrue(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_only_archer_is_awake_and_pet_dog_is_present() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_only_archer_is_awake_and_pet_dog_is_absent() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void can_release_prisoner_if_only_knight_is_awake_and_pet_dog_is_present() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;
        assertTrue(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_only_knight_is_awake_and_pet_dog_is_absent() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_only_knight_is_asleep_and_pet_dog_is_present() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = true;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_only_knight_is_asleep_and_pet_dog_is_absent() {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void can_release_prisoner_if_only_archer_is_asleep_and_pet_dog_is_present() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = true;
        assertTrue(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_only_archer_is_asleep_and_pet_dog_is_absent() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_only_prisoner_is_asleep_and_pet_dog_is_present() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = true;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }

    @Test
    public void cannot_release_prisoner_if_only_prisoner_is_asleep_and_pet_dog_is_absent() {
        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        assertFalse(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake,
                prisonerIsAwake, petDogIsPresent));
    }
}