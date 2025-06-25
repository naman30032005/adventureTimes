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