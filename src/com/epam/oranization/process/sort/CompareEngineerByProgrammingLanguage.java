package com.epam.oranization.process.sort;

import com.epam.oranization.emploee.Programmer;

import java.util.Comparator;

public class CompareEngineerByProgrammingLanguage implements Comparator<Programmer> {

    @Override
    public int compare(Programmer o1, Programmer o2) {
        return o1.getProgrammingLanguage().compareTo(o2.getProgrammingLanguage());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
