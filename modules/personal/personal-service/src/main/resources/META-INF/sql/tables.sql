create table lr_Personal (
	uuid_ VARCHAR(75) null,
	personId LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	emailAddress VARCHAR(75) null,
	phoneNumber LONG,
	createPassword VARCHAR(75) null,
	conformPassword VARCHAR(75) null,
	address VARCHAR(75) null
);