package com.tamenserver.standard.setinterpreter;

import java.util.Arrays;
import java.util.List;

public class SetInterpreter {
    static List<String> setInterpreter(String set) {
        if (set.charAt(set.length() - 2) == ',') {
            return Arrays.asList(set.substring(1, set.length() - 3).split(","));
        } else {
            return Arrays.asList(set.substring(1, set.length() - 3).split(","));
        }
    }
}
