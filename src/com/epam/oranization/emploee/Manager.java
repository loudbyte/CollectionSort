package com.epam.oranization.emploee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Emploee {
    private boolean manage;

    public boolean isManage() {
        return manage;
    }

    public void setManage(boolean manage) {
        this.manage = manage;
    }

    public Manager(String name, int id, int salary, boolean manage) {
        this.setName(name);
        this.setId(id);
        this.setSalary(salary);
        this.setManage(manage);



    }

    List<Emploee> emploees = new ArrayList<>();

    public void addEmploee(Emploee e) {
        emploees.add(e);
    }

    public void removeEmploee(Emploee e) {
        emploees.remove(e);
    }

    public List<Emploee> getEmploees(){
        return emploees;
    }


}
