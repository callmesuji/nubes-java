DROP TABLE IF EXISTS team;

create table team(label varchar(20) primary key,city varchar(200),
coach varchar(200), home varchar(200),team_name varchar(200));

insert into team(label,city,coach,home,team_name) values
("MI","Mumbai,Maharashtra","Mahela Jaywardene","Wankhede Stadium Mumbai","Mumbai Indians"),
("CSK","Chennai,Tamil Nadu","Stephen Fleming","M.A. Chidambaram Stadium","Chennai Chennai Super Kings"),
("DC","Delhi, NCR","Ricky Ponting","Feroz Shah Kotla Ground","Delhi Capitals"),
("KXIP","Mohali, Punjab","Anil Kumble","IS Bindra Stadium","Kings XI Punjab"),
("KKR","Kolkata, West Bengal","Brendon McCullum","Eden Gardens","Kolkata Knight Riders"),	
("RR","Jaipur Rajasthan","Andrew McDonald",	"Sawai Mansingh Stadium","Rajasthan Royals"),	
("RCB","Bengaluru, Karnataka","Simon Katich","M. Chinnaswamy Stadium","Royal Challengers Bangalore"),	
("SRH","Hyderabad, Telengana","Trevor Bayliss","Rajiv Gandhi International Cricket Stadium","Sunrisers Hyderabad");
