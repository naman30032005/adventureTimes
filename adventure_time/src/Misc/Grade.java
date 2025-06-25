package Misc;

/**
 * @Author : Naman
 * @Param : gradeName
 * @gradeName : name of the Grade
 * @Description : Represents a Grade with a name and stat boost.
 * Example grades: Common, Rare, Epic, etc.
 * */
public class Grade {
    private String gradeName;

    public Grade(String grade)
    {
        setGrade(grade);
    }

    public int getStatBoost(String grade)
    {
        return switch(grade.strip().toLowerCase())
        {
            case "common" -> 1;
            case "uncommon" -> 3;
            case "rare" -> 5;
            case "epic" -> 10;
            case "mythical" -> 15;
            case "legendary" -> 30;
            case "godly" -> 50;
            default -> 0;
        };
    }
    public String getGradeName() {
        return gradeName.toUpperCase();
    }

    public void setGrade(String grade) {
        this.gradeName = grade;
    }

}
