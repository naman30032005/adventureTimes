import Entities.*;
import static java.lang.System.*;
import Equipables.skill.*;

import java.io.IOException;
import java.util.*;
public class Main {

    static Scanner sc = new Scanner(in);

    public static void main(String[] args) {
        // Loads all the Skills to the Game
        GameSkills allSkills = new GameSkills();
        /* openingLore(); */

        for (Skills skill: allSkills.getGameSkillList())
        {
            skill.displaySkillBook();
        }
    }

    public static void openingLore() {
        String[] lines = {"You remember the screen glowing in front of you. Another late-night raid. Another victory.\nYou were the top-ranked player in Crimson Rift Online — a game known for its brutal difficulty and unforgiving PvP.","But then...","Your vision blurred. Your heart skipped.\n\nOne moment you were at your desk —  \nThe next, you were surrounded by void.\n\nA soft chime echoed.\n\n> “You have died.”","Another voice followed. Calm. Cold. Not human.\n\n> “System initializing... soul transfer complete.”\n> “Welcome, Player. You are no longer in your world.”","A glowing interface appears before your eyes\n\nSYSTEM MESSAGE: \nWelcome, Player."};

        for (String line: lines)
        {
            typeWriting(line,new Random().nextInt(100,130));
            clearScreen();
        }
    }

    public static void typeWriting(String text, int delayMs)
    {
        for (int i = 0; i < text.length();i++)
        {
            out.print(text.charAt(i));
            out.flush();
            try {
                Thread.sleep(delayMs);
            } catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        out.println();
    }

    //clears the Screen for Animation Purposes
    public static void clearScreen() {
        out.println("Press Enter...");
        String next = sc.nextLine();
        for (int i = 0; i < 50; i++)
        {
            out.println();
        }
    }
}
