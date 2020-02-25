package com.epam.oranization.emploee;

public abstract class Engineer extends Emploee {
    private int techSkillLevel;

    public void setTechSkillLevel(int techSkillLevel) {
        this.techSkillLevel = techSkillLevel;
    }

    public int getTechSkillLevel() {
        return techSkillLevel;
        }
}
