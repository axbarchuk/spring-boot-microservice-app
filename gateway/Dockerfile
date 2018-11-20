FROM java:8-jre
MAINTAINER Alex Barchuk <ax.barchuk@gmail.com>

RUN ["mkdir", "-p", "/opt/app"]
WORKDIR /opt/app

COPY ["target/gateway.jar", "gateway.jar"]
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "gateway.jar"]