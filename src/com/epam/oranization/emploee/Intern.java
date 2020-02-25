package com.epam.oranization.emploee;

public class Intern extends Programmer {
    private int educationLevel;

    public int getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(int educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Intern(String name, int id, int salary, int techSkillLevel, String language, int educationLevel) {
        super(name, id, salary, techSkillLevel, language);
        this.setEducationLevel(educationLevel);
    }
}
