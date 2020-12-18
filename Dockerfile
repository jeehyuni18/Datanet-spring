FROM openjdk:14-slim

EXPOSE 8081

ADD build/libs/datanet-spring-0.0.1-SNAPSHOT.jar datanet-spring-0.0.1-SNAPSHOT.jar

CMD ["java","-jar", "datanet-spring-0.0.1-SNAPSHOT.jar"]