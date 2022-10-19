FROM openjdk:8-jdk-alpine
ADD /target/billing-service-0.0.1-SNAPSHOT.jar billing-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "billing-service-0.0.1-SNAPSHOT.jar"]