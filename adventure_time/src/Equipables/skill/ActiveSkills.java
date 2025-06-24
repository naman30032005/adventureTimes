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
        int dashes = getName().length() + 8;
        int empty = getName().length() + 8;;
        int gradeSpaceLeft = 0;
        int gradeSpaceRight = 0;
        String fmt = String.format("[%s + %d]",getStatToBoost(),getGrade().getStatBoost(gradeName));
        int statSpaceLeft = 0;
        int statSpaceRight = 0;
        if (getName().length() > gradeName.length())
        {
            if (getName().length() % 2 == 0) {
                if (gradeName.length() % 2 == 0) {
                    gradeSpaceLeft = (getName().length() - gradeName.length())/2 + 3;
                    gradeSpaceRight = gradeSpaceLeft;
                }
                else {
                    gradeSpaceLeft = (getName().length() - gradeName.length()+1)/2 + 2;
                    gradeSpaceRight = gradeSpaceLeft + 1;
                }

                if (fmt.length() % 2 == 0)
                {
                    statSpaceLeft = (getName().length() - fmt.length())/2 + 4;
                    statSpaceRight = statSpaceLeft;
                }
                else {
                    statSpaceLeft = (getName().length() -fmt.length())/2 + 4;
                    statSpaceRight = statSpaceLeft + 1;
                }
            }
            else {
                if (gradeName.length() % 2 == 0) {
                    gradeSpaceLeft = (getName().length() - gradeName.length())/2 + 3;
                    gradeSpaceRight = gradeSpaceLeft + 1;
                }
                else {
                    gradeSpaceLeft = (getName().length() - gradeName.length()+1)/2 + 3;
                    gradeSpaceRight = gradeSpaceLeft;
                }
                if (fmt.length() % 2 == 0)
                {
                    statSpaceLeft = (getName().length() - fmt.length())/2 + 4;
                    statSpaceRight = statSpaceLeft + 1;
                }
                else {
                    statSpaceLeft = (getName().length() - fmt.length()) / 2 + 4;
                    statSpaceRight = statSpaceLeft;
                }
            }
        }
        out.println(" "+"-".repeat(dashes));
        out.println("|" + " ".repeat(empty) + "|");
        out.printf("|    %s    |\n",getName());
        out.printf("|"+ " ".repeat(gradeSpaceLeft) +"(%s)"+ " ".repeat(gradeSpaceRight) +"|\n",gradeName);
        out.println("|" + " ".repeat(statSpaceLeft) + fmt + " ".repeat(statSpaceRight)+ "|");
        out.println("|" + " ".repeat(empty) + "|");
        out.println(" "+"-".repeat(dashes));

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
