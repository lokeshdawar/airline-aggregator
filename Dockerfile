FROM java:8-jre-alpine

LABEL maintainer="Lokesh Dawar"

VOLUME [ "/tmp" ]

EXPOSE 9000

ARG JAR_FILE=target/airline-aggregator-0.0.1-SNAPSHOT.war

ADD ${JAR_FILE} airline-aggregator.war

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/airline-aggregator.war"]