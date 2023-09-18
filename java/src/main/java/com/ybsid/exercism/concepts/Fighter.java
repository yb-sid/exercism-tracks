package com.ybsid.exercism.concepts;

/**
 * <a href="https://exercism.org/tracks/java/exercises/wizards-and-warriors">...</a>
 */
abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }
    abstract int damagePoints(Fighter fighter);
    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }
}
class Warrior extends Fighter {
    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6 ;
    }
}
class Wizard extends Fighter {
    private boolean spellPrepared = false;
    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }
    @Override
    int damagePoints(Fighter warrior) {
        return spellPrepared ? 12 : 3;
    }
    void prepareSpell() {
        this.spellPrepared = true;
    }
}
