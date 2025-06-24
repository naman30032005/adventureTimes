package Equipables.skill;

import Entities.Entity;

import static java.lang.System.*;

public abstract class ActiveSkills extends Skills{
    private String statToBoost;
    private String skillArea;
    private double mpConsumption;
    private String gradeName = getGrade().getGradeName();

    public ActiveSkills(String name, String grade,String type, String statToBoost, String condition,String skillArea, double mpConsumption) {
        super(name,grade,type,condition);
        setStatToBoost(statToBoost);
        setSkillArea(skillArea);
        setMpConsumption(mpConsumption);
    }

    @Override
    public void displaySkillBook() {
        // total number of characters per line
        int charactersToDisplay = 60;

        int namelength = charactersToDisplay - getName().length();

        int gradelength = charactersToDisplay - gradeName.length();

        String fmt = String.format("[%s + %d]",getStatToBoost().toUpperCase(),getGrade().getStatBoost(gradeName));
        if (fmt.length() % 2 != 0)
        {
            fmt += " ";
        }
        int statlength = charactersToDisplay - fmt.length();

        boolean oneCondition;
        String fmtcondition,fmtcondition1 = "";
        int conditionlength,condition1length = 0;
        if (getCondition().split(" ").length == 2) {
            oneCondition = true;
            if (getCondition().split(" ")[0].substring(0,1).equalsIgnoreCase("R")) {
               fmtcondition = String.format("(Race): %s",getCondition().split(" ")[1]);
               if (fmtcondition.length() % 2 != 0)
               {
                   fmtcondition += " ";
               }
               conditionlength = charactersToDisplay - fmtcondition.length();
            }
            else
            {
                fmtcondition = String.format("(Class): %s",getCondition().split(" ")[1]);
                if (fmtcondition.length() % 2 != 0)
                {
                    fmtcondition += " ";
                }
                conditionlength = charactersToDisplay - fmtcondition.length();
            }
        }
        else{
            oneCondition = false;
            fmtcondition = String.format("(Race): %s",getCondition().split(" ")[1]);
            fmtcondition1 = String.format("(Class): %s",getCondition().split(" ")[2]);
            if (fmtcondition.length() % 2 != 0)
            {
                fmtcondition += " ";
            }
            conditionlength = charactersToDisplay - fmtcondition.length();
            if (fmtcondition1.length() % 2 != 0)
            {
                fmtcondition1 += " ";
            }
            condition1length = charactersToDisplay - fmtcondition1.length();
        }

        String area = "";
        int arealength = 0;
        if (getSkillArea().equalsIgnoreCase("S"))
        {
            area = "Skill Coverage : Single Entity";
            arealength = charactersToDisplay - area.length();
        }
        else {
            area = "Skill Coverage : Multiple Entities";
            arealength = charactersToDisplay - area.length();
        }

        String fmtMp = String.format("[Mp Usage: %.0f]",getMpConsumption());
        if (fmtMp.length() % 2 != 0)
        {
            fmtMp += " ";
        }
        int Mplength = charactersToDisplay - fmtMp.length();

        out.println(" " + "-".repeat(charactersToDisplay));
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println("|" + " ".repeat(namelength/2) + getName() + " ".repeat(namelength/2) + "|");
        out.println("|" + " ".repeat(gradelength/2) + gradeName + " ".repeat(gradelength/2) + "|");
        out.println("|" + " ".repeat(statlength/2) + fmt + " ".repeat(statlength/2) + "|");
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println("|" + " ".repeat((charactersToDisplay - 10)/2) + "Condition:" + " ".repeat((charactersToDisplay - 10)/2) + "|");
        out.println("|" + " ".repeat(conditionlength/2) + fmtcondition + " ".repeat(conditionlength/2) + "|");
        if (!oneCondition)
        {
            out.println("|" + " ".repeat(condition1length/2) + fmtcondition1 + " ".repeat(condition1length/2) + "|");
        }
        out.println("|" + " ".repeat(arealength/2) +area + " ".repeat(arealength/2) + "|");
        out.println("|" + " ".repeat(Mplength/2) +fmtMp + " ".repeat(Mplength/2) + "|");
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println(" " + "-".repeat(charactersToDisplay));

    }

    public abstract void performAction(Skills skill, Entity entity);

    //Getters and Setters

    public String getStatToBoost() {
        return statToBoost;
    }

    public void setStatToBoost(String statToBoost) {
        this.statToBoost = statToBoost;
    }

    public String getSkillArea() {
        return skillArea;
    }

    public void setSkillArea(String skillArea) {
        this.skillArea = skillArea;
    }

    public double getMpConsumption() {
        return mpConsumption;
    }

    public void setMpConsumption(double mpConsumption) {
        this.mpConsumption = mpConsumption;
    }
}
