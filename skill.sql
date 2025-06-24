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
Insert into skills
values
('Toughened Skin', 'common','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian', 'S',20),
('Toughened Skin', 'uncommon','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian','S',20),
('Toughened Skin', 'rare','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian','S',20),
('Toughened Skin', 'epic','defense','def','R,C: dragonkin,orc,triton Divine_Sentinal,Bulwark,Abyss_Warden','S',20),
('Toughened Skin', 'mythical','defense','def','R,C: dragonkin,orc,triton Divine_Sentinal,Bulwark,Abyss_Warden','S',20),
('Toughened Skin', ' Legendary','defense','def','R,C: dragonkin,orc,triton Iron_Fortress,Eternal_Aegis,Infernal_Bastion','S',20),
('Toughened Skin', ' Godly','defense','def','R,C: dragonkin,orc,triton Iron_Fortress,Eternal_Aegis,Infernal_Bastion','S',20),
('Flame  Blade', 'common','Attack','ATK','C: Vanguard,Dreadguard,Guardian', 'M',20),
('Flame  Blade', 'uncommon','Attack','ATK','C: Vanguard,Dreadguard,Guardian','M',20),
('Flame  Blade', 'rare','Attack','ATK','C: Vanguard,Dreadguard,Guardian','M',20),
('Flame  Blade', 'epic','Attack','ATK','C: Divine_Sentinal,Bulwark,Abyss_Warden','M',20),
('Flame  Blade', 'mythical','Attack','ATK','C: Divine_Sentinal,Bulwark,Abyss_Warden','M',20),
('Flame  Blade', ' Legendary','Attack','ATK','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion','M',20),
('Flame  Blade', ' Godly','Attack','ATK','C: Iron_Fortress,Eternal_Aegis,Infernal_Bastion','M',20)

drop table skills