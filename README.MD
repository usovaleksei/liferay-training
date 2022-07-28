![alt text](https://github.com/usovaleksei/liferay-training/blob/master/images/taskOneScreen.PNG)

For connect to external DB necessary add to ext-portal.properties (C:\project\liferay-training\bundles):
- include-and-override=portal-developer.properties
- jdbc.default.driverClassName=org.postgresql.Driver
- jdbc.default.url=jdbc:postgresql://localhost:5432/localdb
- jdbc.default.username=user
- jdbc.default.password=password

Admin portlet, actions with guestbook:
![alt text](https://github.com/usovaleksei/liferay-training/blob/master/images/admin_portlet.PNG)

Add new entry:
![alt text](https://github.com/usovaleksei/liferay-training/blob/master/images/new_entry.PNG)

Load all entries from external DB:
![alt text](https://github.com/usovaleksei/liferay-training/blob/master/images/guestbook_DB_load_entry.PNG)

