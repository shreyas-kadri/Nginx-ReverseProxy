FROM openjdk:17

COPY DemoApp1/target/DemoApp1-0.0.1-SNAPSHOT.jar /tmp/app1/app.jar

WORKDIR /tmp/app1

EXPOSE 8090

ENTRYPOINT ["java","-jar", "app.jar"]