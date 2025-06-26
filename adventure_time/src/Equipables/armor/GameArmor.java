package Equipables.armor;

import java.util.*;
import GameData.SqlFetchData;
public class GameArmor{
    private List<Armor> armorList;

    public GameArmor() {
        loadData();
    }

    public void loadData()
    {
        String query = "select * from Armor";
        SqlFetchData data = new SqlFetchData(query);
    }

    public List<Armor> getArmorList() {
        return armorList;
    }

    public void setArmorList(List<Armor> armorList) {
        this.armorList = armorList;
    }

}
