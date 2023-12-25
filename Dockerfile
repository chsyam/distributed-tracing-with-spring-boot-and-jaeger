FROM openjdk:17-oracle
ADD target/jaeger-0.0.1-SNAPSHOT.jar jaeger-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","jaeger-0.0.1-SNAPSHOT.jar]