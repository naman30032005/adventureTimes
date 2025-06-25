package Misc;

/**
 * Represents a grade that boosts stats based on rarity.
 *
 * <p>Each grade corresponds to a predefined boost value:
 * Common, Uncommon, Rare, Epic, Mythical, Legendary, and Godly.</p>
 *
 * Example usage:
 *  <p>Grade grade = new Grade("Epic");</p>
 *  <p>int boost = grade.getStatBoost(); // returns 10</p>
 *
 *  @author Naman
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
