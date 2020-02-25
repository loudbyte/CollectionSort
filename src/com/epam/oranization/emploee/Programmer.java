package com.epam.oranization.emploee;

import java.util.ArrayList;
import java.util.List;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Programmer(String name, int id, int salary, int techSkillLevel, String language) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
        this.setTechSkillLevel(techSkillLevel);
        this.setProgrammingLanguage(language);
    }


    List<Intern> interns = new ArrayList<>();

    public void addIntern(Intern e) { interns.add(e);
    }

    public void removeIntern(Intern e) {
        interns.add(e);
    }

    public List<Intern> getInterns(){
        return interns;
    }


}
