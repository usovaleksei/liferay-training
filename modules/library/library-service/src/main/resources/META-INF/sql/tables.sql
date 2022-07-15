create table LB_Address (
	uuid_ VARCHAR(75) null,
	addressId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	town VARCHAR(75) null,
	street VARCHAR(75) null,
	house VARCHAR(75) null,
	flat VARCHAR(75) null
);

create table LB_Book (
	uuid_ VARCHAR(75) null,
	bookId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	authorId LONG,
	bookTitle VARCHAR(75) null,
	publishingYear DATE null,
	genreId LONG,
	studentId LONG
);

create table LB_Genre (
	uuid_ VARCHAR(75) null,
	genreId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null
);

create table LB_Student (
	uuid_ VARCHAR(75) null,
	studentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	bornDate DATE null,
	addressId LONG
);