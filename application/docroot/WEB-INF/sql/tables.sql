create table LS_MobilePhone (
	mobilePhoneId LONG not null primary key,
	name VARCHAR(75) null,
	brand VARCHAR(75) null,
	description VARCHAR(75) null,
	releaseDate DATE null,
	price DOUBLE
);

create table MB_MobilePhone (
	mobilePhoneId LONG not null primary key,
	name VARCHAR(75) null,
	brand VARCHAR(75) null,
	description VARCHAR(75) null,
	releaseDate DATE null,
	price DOUBLE
);