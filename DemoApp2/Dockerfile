FROM openjdk:17

COPY DemoApp2/target/DemoApp2-0.0.1-SNAPSHOT.jar /tmp/app2/app.jar

WORKDIR /tmp/app2

EXPOSE 8092

ENTRYPOINT ["java","-jar", "app.jar"]