FROM openjdk:10-jre
RUN mkdir /app
ADD build/libs/shippable-demo-0.0.1-SNAPSHOT.jar /app/
ENV FOO Dave
ENV SPRING_PROFILE local
EXPOSE 8080
ENTRYPOINT ["java", \
     "-Dspring.profiles.active=${SPRING_PROFILE}", \
    "-jar","/app/shippable-demo-0.0.1-SNAPSHOT.jar"]
