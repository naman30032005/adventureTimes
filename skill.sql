Create Table Skills
(
skillID Int identity(1,1) Primary Key,
skillName Varchar(50),
skillGrade Varchar(20),
skillType Varchar(20),
skillStatToBoost varchar(20),
skillCondition Varchar(255),
skillArea Char(1) check (skillArea in ('S','M'))
)
Insert into skills
values
('Toughened Skin', 'common','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian', 'S'),
('Toughened Skin', 'uncommon','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian','S'),
('Toughened Skin', 'rare','defense','def','R,C: dragonkin,orc,triton Vanguard,Dreadguard,Guardian','S'),
('Toughened Skin', 'epic','defense','def','R,C: dragonkin,orc,triton Divine_Sentinal,Bulwark,Abyss_Warden','S'),
('Toughened Skin', 'mythical','defense','def','R,C: dragonkin,orc,triton Divine_Sentinal,Bulwark,Abyss_Warden','S'),
('Toughened Skin', 'legendary','defense','def','R,C: dragonkin,orc,triton Iron_Fortress,Eternal_Aegis,Infernal_Bastion','S'),
('Toughened Skin', 'godly','defense','def','R,C: dragonkin,orc,triton Iron_Fortress,Eternal_Aegis,Infernal_Bastion','S')


select * from skills

