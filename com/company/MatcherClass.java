package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    Pattern p = Pattern.compile("[aiueo]");
    char index;
    StringBuffer sb = new StringBuffer();

    String vowelOnly(String input) {
        for(int i = 0; i < input.length(); i++){
            index = input.charAt(i);
            Matcher m = p.matcher(String.valueOf(index));
            if(m.matches()){
                sb.append(index);
            }
        }
        return sb.toString();
    }
}
