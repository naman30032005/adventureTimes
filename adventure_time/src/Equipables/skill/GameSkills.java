package Equipables.skill;

import java.util.*;
import GameData.SqlFetchData;
public class GameSkills{
    private List<Skills> gameSkillList = new LinkedList<>();
    public GameSkills()
    {
        loadData();
    }

    public void loadData() {
        String query = "select * from skills";
        SqlFetchData sfd = new SqlFetchData(query);

        List<String> data = sfd.fetchData();

        for (String s: data) {
            String[] elms = s.split("\\|");
            if (elms[2].equalsIgnoreCase("Attack"))
            {
                gameSkillList.add(new AttackSkills(elms[0],elms[1],elms[2],elms[3],elms[4],elms[5],Double.parseDouble(elms[6])));
            }
            else if (elms[2].equalsIgnoreCase("Defense"))
            {
                gameSkillList.add(new DefenseSkills(elms[0],elms[1],elms[2],elms[3],elms[4],elms[5],Double.parseDouble(elms[6])));
            }
            else if (elms[2].equalsIgnoreCase("Dodge"))
            {
                gameSkillList.add(new DodgeSkills(elms[0],elms[1],elms[2],elms[3],elms[4],elms[5],Double.parseDouble(elms[6])));
            }
            else if (elms[2].equalsIgnoreCase("Status"))
            {
                gameSkillList.add(new StatusSkills(elms[0],elms[1],elms[2],elms[3],elms[4],elms[5],Double.parseDouble(elms[6])));
            }
            else if (elms[2].equalsIgnoreCase("Passive"))
            {
                if (elms[3] == ""){
                    gameSkillList.add(new PassiveSkills(elms[0],elms[1],elms[2],elms[4]));
                }
                else
                {
                    gameSkillList.add(new PassiveSkills(elms[0],elms[1],elms[2],elms[3],elms[4]));
                }
            }

        }
    }

    public List<Skills> getGameSkillList() {
        return gameSkillList;
    }

    public void setGameSkillList(List<Skills> gameSkillList) {
        this.gameSkillList = gameSkillList;
    }

}
