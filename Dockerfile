FROM balenalib/rpi-raspbian
COPY ./build/libs/*.jar /usr/app/
WORKDIR /usr/app
CMD exec java -jar *.jar
