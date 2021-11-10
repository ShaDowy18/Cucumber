package ru.autotst.test;

import cucumber.api.java.ru.*;

import static org.junit.Assert.assertEquals;

public class MyStepDefs {

    @Тогда("^сравнение строки \"([^\"]*)\" с \"([^\"]*)\"$")
    public void checkStrings(String arg1, String arg2) {
        assertEquals(arg1, arg2);
    }
}
