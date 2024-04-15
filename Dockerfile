FROM amazoncorretto:11
VOLUME /app

COPY target/cloud-movies-0.0.1-SNAPSHOT.jar movies.jar

EXPOSE 8080
CMD ["java", "-jar", "movies.jar"]