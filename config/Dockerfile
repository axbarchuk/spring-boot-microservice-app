FROM java:8-jre
MAINTAINER Alex Barchuk <ax.barchuk@gmail.com>

RUN ["mkdir", "-p", "/opt/app"]
WORKDIR /opt/app

COPY ["target/config.jar", "config.jar"]
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "config.jar"]