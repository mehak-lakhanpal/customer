FROM openjdk:17
RUN mkdir /app
WORKDIR /app
COPY target/customer-0.0.1-SNAPSHOT.jar /app
EXPOSE 9880
ENTRYPOINT ["java", "-jar", "customer-0.0.1-SNAPSHOT.jar"]