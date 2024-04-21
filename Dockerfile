FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} tractor-service.jar
ENTRYPOINT ["java","-jar","/tractor-service.jar"]
EXPOSE 9001