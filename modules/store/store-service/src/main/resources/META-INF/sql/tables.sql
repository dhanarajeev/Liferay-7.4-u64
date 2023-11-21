create table lr_Store (
	uuid_ VARCHAR(75) null,
	storeId LONG not null primary key,
	branchId LONG,
	branchName VARCHAR(75) null,
	address VARCHAR(75) null,
	contactNumber LONG
);