package Equipables.skill;

import static java.lang.System.out;

public class PassiveSkills extends Skills{
    private String statToBoost;
    private String gradeName = getGrade().getGradeName();
    public PassiveSkills(String name,String grade,String type, String statToBoost, String condition)
    {
        super(name, grade, type, condition);
        setStatToBoost(statToBoost);
    }
    public PassiveSkills(String name,String grade,String type, String condition)
    {
        super(name, grade, type, condition);
    }

    @Override
    public void displaySkillBook() {
        // total number of characters per line
        int charactersToDisplay = 60;
        int skillnamelength = charactersToDisplay - "passive  skill".length();

        int namelength = charactersToDisplay - getName().length();

        int gradelength = charactersToDisplay - gradeName.length();

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


        out.println(" " + "-".repeat(charactersToDisplay));
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println("|" + " ".repeat(skillnamelength/2) + "Passive  Skill" + " ".repeat(skillnamelength/2) + "|");
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println("|" + " ".repeat(namelength/2) + getName() + " ".repeat(namelength/2) + "|");
        out.println("|" + " ".repeat(gradelength/2) + gradeName + " ".repeat(gradelength/2) + "|");
        if (statToBoost != null)
        {
            String fmt = String.format("[%s + %d]",getStatToBoost().toUpperCase(),getGrade().getStatBoost(gradeName));
            if (fmt.length() % 2 != 0)
            {
                fmt += " ";
            }
            int statlength = charactersToDisplay - fmt.length();

            out.println("|" + " ".repeat(statlength/2) + fmt + " ".repeat(statlength/2) + "|");
        }
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println("|" + " ".repeat((charactersToDisplay - 10)/2) + "Condition:" + " ".repeat((charactersToDisplay - 10)/2) + "|");
        out.println("|" + " ".repeat(conditionlength/2) + fmtcondition + " ".repeat(conditionlength/2) + "|");
        if (!oneCondition)
        {
            out.println("|" + " ".repeat(condition1length/2) + fmtcondition1 + " ".repeat(condition1length/2) + "|");
        }
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println(" " + "-".repeat(charactersToDisplay));

    }


    public String getStatToBoost() {
        return statToBoost;
    }

    public void setStatToBoost(String statToBoost) {
        this.statToBoost = statToBoost;
    }

}
