FROM balenalib/raspberry-pi-openjdk
COPY ./build/libs/*.jar /usr/app/
WORKDIR /usr/app
CMD exec java -jar *.jar
