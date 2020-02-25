package com.epam.oranization.process.sort;

import com.epam.oranization.emploee.Emploee;

import java.util.Comparator;

public class CompareEmploeeBySalary implements Comparator<Emploee> {
    @Override
    public int compare(Emploee o1, Emploee o2) {
        return o1.getSalary() - o2.getSalary();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}