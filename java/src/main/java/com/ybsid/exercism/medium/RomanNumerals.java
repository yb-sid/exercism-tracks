package com.ybsid.exercism.medium;

/**
 * <a href="https://exercism.org/tracks/java/exercises/roman-numerals">...</a>
 */
class RomanNumerals{
    private String m[] = { "", "M", "MM", "MMM" };
    private String c[] = { "",  "C",  "CC",  "CCC",  "CD",
            "D", "DC", "DCC", "DCCC", "CM" };
    private String x[] = { "",  "X",  "XX",  "XXX",  "XL",
            "L", "LX", "LXX", "LXXX", "XC" };
    private String i[] = { "",  "I",  "II",  "III",  "IV",
            "V", "VI", "VII", "VIII", "IX" };
    private int decimal;
    public RomanNumerals(int decimal){
        this.decimal = decimal;
    }
    public String getRomanNumeral(){
        String thousands = m[decimal/1000];
        String hundreds = c[(decimal%1000)/100];
        String tens = x[(decimal%100)/10];
        String ones = i[decimal%10];
        return thousands+hundreds+tens+ones;
    }
}