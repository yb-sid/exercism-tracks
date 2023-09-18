package com.ybsid.exercism.medium;

/**
 * <a href="https://exercism.org/tracks/java/exercises/phone-number">...</a>
 */
class PhoneNumber{
    private String numberToCheck;
    public PhoneNumber(String input){
        if (input.length() != input.toLowerCase().replaceAll("[a-z]+", "").length()) {
            throw new IllegalArgumentException("letters not permitted");
        }
        if (input.length() != input.replaceAll("[:!@]+", "").length()) {
            throw new IllegalArgumentException("punctuations not permitted");
        }
        this.numberToCheck = input.replaceAll("[^\\d]+", "");
        if (numberToCheck.startsWith("0")) {
            throw new IllegalArgumentException("area code cannot start with zero");
        }
        if (numberToCheck.length() < 10) {
            throw new IllegalArgumentException("incorrect number of digits");
        }
        if (numberToCheck.startsWith("1") && numberToCheck.length() == 10) {
            throw new IllegalArgumentException("area code cannot start with one");
        }
        if (numberToCheck.length() == 11 && !numberToCheck.startsWith("1")) {
            throw new IllegalArgumentException("11 digits must start with 1");
        }
        if (numberToCheck.length() == 11 && numberToCheck.charAt(1) == '0') {
            throw new IllegalArgumentException("area code cannot start with zero");
        }
        if (numberToCheck.length() == 11 && numberToCheck.charAt(1) == '1') {
            throw new IllegalArgumentException("area code cannot start with one");
        }
        if (numberToCheck.length() == 11 && numberToCheck.charAt(4) == '0') {
            throw new IllegalArgumentException("exchange code cannot start with zero");
        }
        if (numberToCheck.length() == 11 && numberToCheck.charAt(4) == '1') {
            throw new IllegalArgumentException("exchange code cannot start with one");
        }
        if (numberToCheck.length() > 11) {
            throw new IllegalArgumentException("more than 11 digits");
        }
        if (numberToCheck.charAt(3) == '0') {
            throw new IllegalArgumentException("exchange code cannot start with zero");
        }
        if (numberToCheck.charAt(3) == '1') {
            throw new IllegalArgumentException("exchange code cannot start with one");
        }
    }
    public String getNumber() {
        if (numberToCheck.startsWith("1")) {
            numberToCheck = numberToCheck.substring(1);
        }
        return numberToCheck;
    }
}