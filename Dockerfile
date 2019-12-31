FROM openjdk:8-jre-alpine
COPY ./build/libs/*.jar /usr/app/
WORKDIR /usr/app
CMD exec java -jar *.jar
