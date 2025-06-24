import Entities.Player;
import Equipables.skill.*;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        GameSkills skills = new GameSkills();

        Player player1 = new Player("IronDestrux",null,"Good",null);
        for (Skills s: skills.getGameSkillList())
        {
            s.displaySkillBook();
            player1.addSkills(s);
        }
        List<Skills> playerskills = player1.getSkillList();
        System.out.println(playerskills.size());
    }
}
