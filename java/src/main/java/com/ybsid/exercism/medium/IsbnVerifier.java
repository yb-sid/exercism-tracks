package com.ybsid.exercism.medium;

/**
 * <a href="https://exercism.org/tracks/java/exercises/isbn-verifier">...</a>
 */
class IsbnVerifier {
    boolean isValid(String stringToVerify) {
        String noDash = stringToVerify.replaceAll("-","");
        if(noDash.length()!=10)
            return false;
        String checkChar = noDash.charAt(9) == 'X' ? "10" : String.valueOf(noDash.charAt(9));
        try {
            int checkDig = Integer.parseInt(checkChar);
            int checkSum = 0;
            for (int i = 0; i <= 8; i++) {
                checkSum += Integer.parseInt(String.valueOf(noDash.charAt(i))) * (10 - i);
            }
            checkSum += checkDig;
            return checkSum % 11 == 0;
        }catch (NumberFormatException e){
            return false;
        }
    }
}