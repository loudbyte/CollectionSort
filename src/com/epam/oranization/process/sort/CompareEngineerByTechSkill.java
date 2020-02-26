package com.epam.oranization.process.sort;

import com.epam.oranization.emploee.Engineer;

import java.util.Comparator;

public class CompareEngineerByTechSkill implements Comparator<Engineer> {

    @Override
    public int compare(Engineer o1, Engineer o2) {
        return o1.getTechSkillLevel() - o2.getTechSkillLevel();
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
