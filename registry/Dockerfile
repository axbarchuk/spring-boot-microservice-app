FROM java:8-jre
MAINTAINER Alex Barchuk <ax.barchuk@gmail.com>

RUN ["mkdir", "-p", "/opt/app"]
WORKDIR /opt/app

COPY ["target/registry.jar", "registry.jar"]
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "registry.jar"]