package com.ybsid.exercism.concepts;

/**
 * <a href="https://exercism.org/tracks/java/exercises/squeaky-clean">...</a>
 */
class SqueakyClean {
    static String clean(String text) {
        StringBuilder st = new StringBuilder();
        char[] c = text.toCharArray();
        for (int i=0 ; i< text.length();i++){
            if (Character.isISOControl(c[i])){
                st.append("CTRL");
            } else if(Character.isWhitespace(c[i])){
                st.append('_');
            }else if (c[i]=='-'){
                int j = i+1;
                while(!Character.isLetter(c[j])){
                    j+=1;
                }
                i = j;
                st.append(Character.toUpperCase(c[i]));
            }else if(!Character.isLetter(c[i])){
                continue;
            }else if(!(c[i]>='α' && c[i]<='ω')){
                st.append(c[i]);
            }
        }

        return st.toString();
    }
}
