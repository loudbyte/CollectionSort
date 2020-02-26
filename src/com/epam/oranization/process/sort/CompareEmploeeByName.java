package com.epam.oranization.process.sort;

import com.epam.oranization.emploee.Emploee;

import java.util.Comparator;

public class CompareEmploeeByName implements Comparator<Emploee> {

    @Override
    public int compare(Emploee o1, Emploee o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}