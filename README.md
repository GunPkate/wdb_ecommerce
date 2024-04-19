# Wdb Springboot 

## initialize project

set initial config, dependecy and run config
![image](https://github.com/GunPkate/wdb_ecommerce_springboot/assets/77183620/0cbceceb-9f76-4804-8861-9403cf868578)
![image](https://github.com/GunPkate/wdb_ecommerce_springboot/assets/77183620/24538b47-e999-4e63-a1f2-ff1cd7da1e4d)
![image](https://github.com/GunPkate/wdb_ecommerce_springboot/assets/77183620/e6cf070f-7ef6-4630-adbf-8a9f4a0502c5)

add docker-compose script
```
version: "3.8"
services:
  db:
    container_name: postgres_container
    image: postgres
    restart: always
    environment:
      POSTGRES_USER: root
      POSTGRES_PASSWORD: root
      POSTGRES_DB: test_db
    ports:
      - "5432:5432"
```

app property
```
spring.application.name=wdbecomerce

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=none
spring.jpa.properties.hibernate.format_sql=true
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=root
spring.datasource.password=root

spring.sql.init.mode=always
#spring.sql.init.schema-locations=classpath:/data.sql
spring.sql.init.continue-on-error=true
```

pom.xml 
```
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId
</dependency>
```
