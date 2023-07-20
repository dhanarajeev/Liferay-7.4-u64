create table lr_employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	name VARCHAR(75) null,
	phoneNumber LONG,
	email VARCHAR(75) null,
	address VARCHAR(75) null
);