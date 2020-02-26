package com.epam.oranization.process.sort;

import com.epam.oranization.emploee.Emploee;

import java.util.Comparator;

public class CompareEmploeeById implements Comparator<Emploee> {

    @Override
    public int compare(Emploee o1, Emploee o2) {
        return o1.getId() - o2.getId();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
