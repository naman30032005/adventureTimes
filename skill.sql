Create Table Skills
(
skillID Int identity(1,1) Primary Key,
skillName Varchar(50),
skillGrade Varchar(20),
skillType Varchar(20),
skillStatToBoost varchar(20),
skillCondition Varchar(255),
skillArea Char(1) check (skillArea in ('S','M')),
mpConsumption Int
)

-- Defense Skills
Insert into skills(skillName,skillGrade,skillType,skillStatToBoost,skillCondition,skillArea,mpConsumption)
values
('Toughened Skin', 'common','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian', 'S',20),
('Toughened Skin', 'uncommon','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian','S',20),
('Toughened Skin', 'rare','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian','S',20),
('Toughened Skin', 'epic','defense','def','R,C: dragonkin,orc,triton Divine_Sentinal,Bulwark,Abyss_Warden','S',20),
('Toughened Skin', 'mythical','defense','def','R,C: dragonkin,orc,triton Divine_Sentinal,Bulwark,Abyss_Warden','S',20),
('Toughened Skin', ' Legendary','defense','def','R,C: dragonkin,orc,triton Iron_Fortress,Eternal_Aegis,Infernal_Bastion','S',20),
('Toughened Skin', ' Godly','defense','def','R,C: dragonkin,orc,triton Iron_Fortress,Eternal_Aegis,Infernal_Bastion','S',20)

--Attack Skills
INsert into skills(skillName,skillGrade,skillType,skillStatToBoost,skillCondition,skillArea,mpConsumption)
values
('Flame  Blade', 'common','Attack','ATK','C: Vanguard,Dreadguard,Guardian', 'M',20),
('Flame  Blade', 'uncommon','Attack','ATK','C: Vanguard,Dreadguard,Guardian','M',20),
('Flame  Blade', 'rare','Attack','ATK','C: Vanguard,Dreadguard,Guardian','M',20),
('Flame  Blade', 'epic','Attack','ATK','C: Divine_Sentinal,Bulwark,Abyss_Warden','M',20),
('Flame  Blade', 'mythical','Attack','ATK','C: Divine_Sentinal,Bulwark,Abyss_Warden','M',20),
('Flame  Blade', ' Legendary','Attack','ATK','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion','M',20),
('Flame  Blade', ' Godly','Attack','ATK','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion','M',20)

--Dodge Skills
Insert into skills(skillName,skillGrade,skillType,skillStatToBoost,skillCondition,skillArea,mpConsumption)
values
('Disappearing Steps', 'common','Dodge','SPD','C: Vanguard,Dreadguard,Guardian', 'M',20),
('Disappearing Steps', 'uncommon','Dodge','SPD','C: Vanguard,Dreadguard,Guardian','M',20),
('Disappearing Steps', 'rare','Dodge','SPD','C: Vanguard,Dreadguard,Guardian','M',20),
('Disappearing Steps', 'epic','Dodge','SPD','C: Divine_Sentinal,Bulwark,Abyss_Warden','M',20),
('Disappearing Steps', 'mythical','Dodge','SPD','C: Divine_Sentinal,Bulwark,Abyss_Warden','M',20),
('Disappearing Steps', ' Legendary','Dodge','SPD','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion','M',20),
('Disappearing Steps', ' Godly','Dodge','SPD','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion','M',20)

--Status Skills
Insert into skills(skillName,skillGrade,skillType,skillStatToBoost,skillCondition,skillArea,mpConsumption)
values
('Healing  Light', 'common','Status','VIT','C: Vanguard,Dreadguard,Guardian', 'M',20),
('Healing  Light', 'uncommon','Status','VIT','C: Vanguard,Dreadguard,Guardian','M',20),
('Healing  Light', 'rare','Status','VIT','C: Vanguard,Dreadguard,Guardian','M',20),
('Healing  Light', 'epic','Status','VIT','C: Divine_Sentinal,Bulwark,Abyss_Warden','M',20),
('Healing  Light', 'mythical','Status','VIT','C: Divine_Sentinal,Bulwark,Abyss_Warden','M',20),
('Healing  Light', ' Legendary','Status','VIT','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion','M',20),
('Healing  Light', ' Godly','Status','VIT','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion','M',20)

--Passive Skills with Stat Boost
Insert into skills(skillName,skillGrade,skillType,skillStatToBoost,skillCondition)
values
('Talented Swordsman', 'common','Passive','ATK','C: Vanguard,Dreadguard,Guardian'),
('Talented Swordsman', 'uncommon','Passive','ATK','C: Vanguard,Dreadguard,Guardian'),
('Talented Swordsman', 'rare','Passive','ATK','C: Vanguard,Dreadguard,Guardian'),
('Talented Swordsman', 'epic','Passive','ATK','C: Divine_Sentinal,Bulwark,Abyss_Warden'),
('Talented Swordsman', 'mythical','Passive','ATK','C: Divine_Sentinal,Bulwark,Abyss_Warden'),
('Talented Swordsman', ' Legendary','Passive','ATK','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion'),
('Talented Swordsman', ' Godly','Passive','ATK','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion')

--Passive Skills without Stat Boost
Insert into skills(skillName,skillGrade,skillType,skillStatToBoost,skillCondition)
values
('Night Vision', 'common','Passive','','C: Vanguard,Dreadguard,Guardian'),
('Night Vision', 'uncommon','Passive','','C: Vanguard,Dreadguard,Guardian'),
('Night Vision', 'rare','Passive','','C: Vanguard,Dreadguard,Guardian'),
('Night Vision', 'epic','Passive','','C: Divine_Sentinal,Bulwark,Abyss_Warden'),
('Night Vision', 'mythical','Passive','','C: Divine_Sentinal,Bulwark,Abyss_Warden'),
('Night Vision', ' Legendary','Passive','','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion'),
('Night Vision', ' Godly','Passive','','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion')

drop table skills