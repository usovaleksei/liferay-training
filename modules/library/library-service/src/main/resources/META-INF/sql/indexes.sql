create index IX_C738FAC5 on LB_Address (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_9DB6E87 on LB_Address (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6D9B1667 on LB_Book (bookTitle[$COLUMN_LENGTH:75$]);
create index IX_593F2B6C on LB_Book (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_11339CEE on LB_Book (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_DD3A4494 on LB_Genre (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_47F2E016 on LB_Genre (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_579CF78C on LB_Student (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_EED5F10E on LB_Student (uuid_[$COLUMN_LENGTH:75$], groupId);