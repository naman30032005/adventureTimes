
-- table
Create table players
(
	Id int Identity(1,1) primary key,
	Nam nvarchar(255) not null,
	race nvarchar(50) not null,
	aff nvarchar(255) not null,
	class nvarchar(255) not null,
	Lvl Int not null,
	exper Int not null,
	Mon decimal(10,2) not null,
	hp decimal(10,2) not null,
	att int not null,
	def int not null,
	mp int not null,
	dex int not null,
	intelligence int not null,
	cha int not null,
	bp int not null
);
go 

--trigger
Create trigger trgsave
on players
after insert
as 
	Begin
		declare @n Nvarchar(255), @race nvarchar(50), @affinity nvarchar(255), @class nvarchar(255),@Lvl Int,
		@exp Int,@Money decimal(10,2),@hp decimal(10,2),@att int,@def int,@mp int,@dex int,@intelligence int,
		@cha int,@bp int
		
		select @n = Nam,@race = race, @affinity = aff, @class = class, @Lvl = Lvl, @exp = exper, @Money = Mon,
		@hp = hp, @att = att, @def = def, @mp = mp, @dex = dex, @intelligence = intelligence, @cha = cha, @bp = bp
		from inserted
		
		if Exists (select 1 from players where nam = @n)
			begin
				rollback transaction;
				update players
				set Lvl = @lvl, exper = @exp, mon = @Money, hp = @hp, att = @att, def = @def, mp = @mp, dex = @dex,
				intelligence = @intelligence,cha = @cha, bp = @bp
				where nam = @n
			end
	End
go

--procedure
create procedure Usp_save
	@name nvarchar(255), @race nvarchar(50), @affinity nvarchar(255), @class nvarchar(255),@Lvl Int,
		@exp Int,@Money decimal(10,2),@hp decimal(10,2),@att int,@def int,@mp int,@dex int,@intelligence int,
		@cha int,@bp int
as
	Begin
		if Exists(select 1 from players where nam = @name)
			begin
				insert into players
				values(@name, @race, @affinity, @class, @lvl, @exp, @money, @hp,@att, @def, @mp, @dex, @intelligence, @cha, @bp)
			end
		else
			begin
				begin transaction;
					disable trigger trgsave on players
					insert into players
					values(@name, @race, @affinity, @class, @lvl, @exp, @money, @hp,@att, @def, @mp, @dex, @intelligence, @cha, @bp);
					enable trigger trgsave on players;
					commit transaction;
			end
	end
go

Exec usp_save 'PLayer 69', 'human', 'light', 'magician', 2, 10, 10,10, 10, 10, 2015, 15, 10, 10, 100

select * from players

