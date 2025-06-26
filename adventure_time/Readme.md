# Adventure Time
This is a Fantasy RPG game Developed by me to practise java. This game covers all the parts necessary to understand java language in detail and contains all the important topics that beginners can use to develop their own games.

## Skills(Abstract class)

#### Features of the Abstract Class:
- Private Attributes (Name, Grade, Type, Condition)
- Getters and Setters
- Overloaded Constructors
- Abstract method equipTo (To equip the skill to player)
- Abstract method 

#### Subclasses:
- ActiveSkills(Abstract, Attributes : statToBoost,skillArea,mpConsumption)
  - AttackSkills
  - DefenseSkills
  - DodgeSkills
  - Healing/Buff/Debuff Skills
- PassiveSkills(StatBoosters/Extra Skills)

#### Grades:
- Common (+1)
- Uncommon(+3)
- Rare(+5) 
- Epic(+10)
- Mythical(+15)
- Legendary(+30)
- Godly(+50)


## Races

- Human
- Drangonkin
- Elves
- Orcs
- Triton
- Merfolk
- Celestials

## XP Calculations
cap variable would be used to Store the Xp required for the previous level;
- lvl1 -> lvl2 : 50xp (needed)
- lvl2 -> lvl3 : lvl1cap + (50 * Currentlvl) + (50 * random(0,1))
- lvl3 -> lvl4 : lvl2cap + (50 * Currentlvl) + (50 * random(0,1))

## Entity (Abstract Class)

#### Attributes
- name
- Race
- alignment : [Holy, Human, Demon]
- archetype(Class)
- Money
- Stats : [ATK, DEF, VIT, INT, MP, AGL, CHA]

#### Subclasses

- Player
- Enemy
- Npc

## Opening LORE (AI Generated)
You remember the screen glowing in front of you.  
Another late-night raid. Another victory.  
You were *the* top-ranked player in **Crimson Rift Online** —  
a game known for its brutal difficulty and unforgiving PvP.

But then...

Your vision blurred. Your heart skipped.

One moment you were at your desk —  
The next, you were surrounded by void.

A soft chime echoed.

> “You have died.”

Another voice followed. Calm. Cold. Not human.

> “System initializing... soul transfer complete.”
> “Welcome, Player. You are no longer in your world.”

A glowing interface appears before your eyes.

SYSTEM MESSAGE:  
Welcome, Player.

Before you begin your new life in Sanctarum,  
please configure your identity parameters.

[1] Enter your Name:
> [player inputs name]

SYSTEM MESSAGE:  
Name registered as [player name].

Next, select your Race:
1. Human — Versatile and resilient.
2. Elf — Agile, attuned to magic and nature.
3. Demonkin — Born of fire and shadow, powerful but feared.
> [player inputs number]

SYSTEM MESSAGE:  
Race registered as [selected race].

Alignment selection is next. This will influence your destiny and powers.  
Choose wisely.

1. Holy — Champion of light and justice.
2. Human — Balanced, adaptable, master of many paths.
3. Demon — Embrace darkness and raw power.
> [player inputs number]

SYSTEM MESSAGE:  
Alignment registered as [selected alignment].

Finally, choose your starting Class. Your path awaits.

*If you need help, type “list” to see available classes for your alignment.*

> [player inputs class name or types “list”]

If "list":  
HOLY: Guardian, Vowrunner, Sanctifier  
HUMAN: Bladeborn, Shadowhand, Mindweaver  
DEMON: Bloodknight, Nightblade, Hexborn

> [player inputs choice]

SYSTEM MESSAGE:  
Class registered as [selected class].

Loading your new body...

---

You awaken to the world of Sanctarum, your adventure begins now.

Good luck, [player name].