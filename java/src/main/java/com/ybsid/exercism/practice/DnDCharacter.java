package com.ybsid.exercism.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    int strength;
    int charisma;
    int wisdom;
    int intelligence;
    int dexterity;
    int constitution;
    public DnDCharacter(){
        this.strength = ability(rollDice());
        this.charisma = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
    }
    int ability(List<Integer> scores) {
        int min = scores.stream().min(Integer::compare).orElse(0);
        int sum = scores.stream().reduce(Integer::sum).orElse(0);
        return sum - min;
    }
    List<Integer> rollDice() {
        Random r = new Random();
        return Arrays.asList(r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1,r.nextInt(6)+1);
    }
    int modifier(int input) {
        return (int)Math.floor((double)(input-10)/2);
    }
    int getStrength() {
        return strength;
    }
    int getDexterity() {
        return dexterity;
    }
    int getConstitution() {
        return constitution;
    }
    int getIntelligence() {
        return intelligence;
    }
    int getWisdom() {
        return wisdom;
    }
    int getCharisma() {
        return charisma;
    }
    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
