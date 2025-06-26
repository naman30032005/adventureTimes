package Equipables.armor;

import Entities.*;
import Misc.Grade;

public abstract class Armor{
    private String name;
    private Grade grade;
    private String type;
    private String condition;

    public Armor(String name,String grade,String type, String condition) {
        setName(name);
        setGrade(new Grade(grade));
        setType(type);
        setCondition(condition);
    }

    public void equipTo(Entity entity) {
        //equip armor to entity;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
