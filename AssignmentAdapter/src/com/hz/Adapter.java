package com.hz;


import java.util.Arrays;

public class Adapter {
    public boolean checkResponse() {
        ConsoleReader reader = new ConsoleReader();
        // Array with acceptable answers
        String[] responses = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        // Return true if responses array contains written text
        if(Arrays.stream(responses).anyMatch(reader.readLine()::equals)){
            return true;
        }
        else{
            return false;
        }
    }
}
