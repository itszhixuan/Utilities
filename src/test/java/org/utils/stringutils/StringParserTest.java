package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    @Test
    void splitString_oneSep_expectTwoParts() throws InvalidStringInputException {
        String inputString = "Hello|World";
        String separator = "\\|";
        StringParser sp = new StringParser();
        ArrayList<String> stringParts = sp.splitString(inputString, separator);
        assertEquals(2, stringParts.size());
    }

    @Test
    void splitString_nullInput_expectException() throws InvalidStringInputException {
        String inputString = null;
        String separator = "\\|";
        StringParser sp = new StringParser();
        //ArrayList<String> stringParts = sp.splitString(inputString, separator);
        assertThrows(InvalidStringInputException.class,
                () -> sp.splitString(inputString,separator));
    }
}