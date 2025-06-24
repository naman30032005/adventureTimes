package Misc;

public class Grade {
    private String gradeName;

    public Grade(String grade)
    {
        setGrade(grade);
    }

    public int getStatBoost(String grade)
    {
        return switch(grade.strip())
        {
            case "Common","common","COMMON" -> 1;
            case "Uncommon","uncommon","UNCOMMON" -> 3;
            case "rare","Rare","RARE" -> 5;
            case "Epic", "epic","EPIC" -> 10;
            case "Mythical", "mythical","MYTHICAL" -> 15;
            case "Legendary", "legendary","LEGENDARY" -> 30;
            case "Godly","godly","GODLY" -> 50;
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
