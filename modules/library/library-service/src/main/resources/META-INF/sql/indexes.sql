create index IX_6D9B1667 on LB_Book (bookTitle[$COLUMN_LENGTH:75$]);
create index IX_2F6ABB3C on LB_Book (uuid_[$COLUMN_LENGTH:75$]);

create index IX_EC63CB14 on LB_Genre (uuid_[$COLUMN_LENGTH:75$]);

create index IX_5DB3431C on LB_Student (uuid_[$COLUMN_LENGTH:75$]);