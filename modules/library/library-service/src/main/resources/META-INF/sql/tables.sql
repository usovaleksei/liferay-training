create table LB_Book (
	uuid_ VARCHAR(75) null,
	bookId LONG not null primary key,
	authorId LONG,
	bookTitle VARCHAR(75) null,
	createDate DATE null,
	genreId LONG,
	studentId LONG
);

create table LB_Genre (
	uuid_ VARCHAR(75) null,
	genreId LONG not null primary key,
	title VARCHAR(75) null
);

create table LB_Student (
	uuid_ VARCHAR(75) null,
	studentId LONG not null primary key,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	bornDate DATE null,
	address VARCHAR(75) null
);