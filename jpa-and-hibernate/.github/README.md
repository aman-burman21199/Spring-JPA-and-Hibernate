## H2 Console:
1. Add this line to application.properties: spring.h2.console.enabled=true
2. go to this link: http://localhost:8080/h2-console

Note JDBC url is incorrect. When you run your app, you see the jdbc url in console (Find with 'url='). Copy, enter and connect.

To configure a static url:
1. Add this line to application.properties: spring.datasource.url=jdbc:h2:mem:testdb

'schema.sql' file is used to set db schema and should be in resources folder only.