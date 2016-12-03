package com.tamenserver.standard.setinterpreter;

import java.util.Arrays;
import java.util.List;

import com.tamenserver.standard.setinterperter.exception.NotASetException;

public class SetInterpreter {

    public List<String> setInterpreter(String set) throws NotASetException {
        for (int i = 1; i < set.length() - 1; i++) {
            if (set.charAt(i) == '{' || set.charAt(i) == '}') {
                throw new NotASetException();
            }
        }
        if (set.charAt(0) == '{' && set.charAt(set.length() - 1) == '}') {
            if (set.charAt(set.length() - 2) == ',') {
                return Arrays.asList(set.substring(1, set.length() - 2).split(","));
            } else {
                return Arrays.asList(set.substring(1, set.length() - 1).split(","));
            }
        } else {
            throw new NotASetException();
        }
    }
}
