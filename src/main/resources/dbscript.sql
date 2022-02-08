create table ilt_details_section
(
	id int identity
		primary key,
	footer varchar(255),
	header varchar(255),
	title varchar(255)
)
go

create table ilt_details_info
(
	id int identity
		primary key,
	relatedCourseIds varchar(255),
	relatedCourseTitle varchar(255),
	about int
		constraint FKhbcujlfpj4iq1gn8790y2y1x3
			references ilt_details_section,
	courseAgenda int
		constraint FK3u4x6dm9wrix4xar84o273qta
			references ilt_details_section
)
go

create table ilt_instructors
(
	id int identity
		primary key,
	description varchar(255),
	imagePath varchar(255),
	name varchar(255),
	position varchar(255)
)
go

create table ilt_detailsInfo_instructors_mapping
(
	iltDetailsId int not null
		constraint FKcgjbqbcetod0g6eaig0jyanuo
			references ilt_details_info,
	iltInstructorId int not null
		constraint FKo9ekqcxfqmdqwjjcg8ust1q4b
			references ilt_instructors,
	primary key (iltDetailsId, iltInstructorId)
)
go

create table ilt_middle_list_content
(
	id int identity
		primary key,
	listItem varchar(255),
	ilt_details_section_id int not null
		constraint FKrokt2gr88nyo4kwigq1db3v8o
			references ilt_details_section
)
go

create table ilt_tag
(
	id int identity
		primary key,
	colorCode varchar(255),
	name varchar(255)
)
go

create table market_place_premium_plan
(
	id int identity
		primary key,
	description varchar(255) not null,
	display bit,
	isActive bit,
	isBundle bit,
	name varchar(255) not null,
	planTypeId int not null,
	price decimal(18) not null
)
go

create table ilt_basic_info
(
	id int identity
		primary key,
	courseType varchar(255),
	iconPath varchar(255),
	trainingName varchar(255),
	trainingPlace varchar(255),
	validityType varchar(255),
	iltDetailsInfoId int
		constraint FKpcu345l548b0vxukwvnudj2qa
			references ilt_details_info,
	planId int
		constraint FKg5apy8eoxg2lp5wwet844son9
			references market_place_premium_plan
)
go

create table ilt_basicInfo_tags_mapping
(
	iltBasicInfoId int not null
		constraint FKodqxbk1rh2k7qt7rvw89ee6dw
			references ilt_basic_info,
	iltTagId int not null
		constraint FKlx6m06me47l9nwa3rgs9kpp9a
			references ilt_tag,
	primary key (iltBasicInfoId, iltTagId)
)
go

