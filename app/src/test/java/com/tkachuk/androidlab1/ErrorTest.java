package com.tkachuk.androidlab1;

import org.junit.Test;

public class ErrorTest {
    @Test
    public boolean error() {
        String string = "String";
        int i = 4;
        boolean boolVar=false;
        for (int j = 0; j < string.length()+1; j++) {
            if (string.charAt(i) == string.charAt(j))
                boolVar = true;
        }
        return boolVar;
    }
}
