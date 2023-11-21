create table lr_Company (
	uuid_ VARCHAR(75) null,
	companyId LONG not null primary key,
	companyName VARCHAR(75) null,
	registrationId LONG,
	email VARCHAR(75) null,
	taxId LONG,
	phoneNumber LONG,
	gst LONG,
	address VARCHAR(75) null
);