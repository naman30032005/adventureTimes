package Equipables.skill;

import static java.lang.System.out;

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
        int charactersToDisplay = 40;

        int namelength = charactersToDisplay - getName().length();

        int gradelength = charactersToDisplay - gradeName.length();

        String fmt = String.format("[%s + %d]",getStatToBoost().toUpperCase(),getGrade().getStatBoost(gradeName));
        if (fmt.length() % 2 != 0)
        {
            fmt += " ";
        }
        int statlength = charactersToDisplay - fmt.length();



        out.println(" " + "-".repeat(charactersToDisplay));
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println("|" + " ".repeat(namelength/2) + getName() + " ".repeat(namelength/2) + "|");
        out.println("|" + " ".repeat(gradelength/2) + gradeName + " ".repeat(gradelength/2) + "|");
        out.println("|" + " ".repeat(statlength/2) + fmt + " ".repeat(statlength/2) + "|");
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println("|" + " ".repeat((charactersToDisplay - 10)/2) + "Condition:" + " ".repeat((charactersToDisplay - 10)/2) + "|");
        out.println("|" + " ".repeat(charactersToDisplay) + "|");
        out.println(" " + "-".repeat(charactersToDisplay));

    }

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
