FROM openjdk:10-jre
RUN mkdir /app
ADD build/libs/shippable-demo-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/shippable-demo-0.0.1-SNAPSHOT.jar"]
