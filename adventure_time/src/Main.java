import Equipables.skill.*;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        GameSkills skills = new GameSkills();

        for (Skills s: skills.getGameSkillList())
        {
            s.displaySkillBook();
        }
    }
}
