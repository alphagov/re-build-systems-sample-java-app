FROM openjdk:8-jre-alpine

RUN apk update
RUN apk upgrade

RUN apk add bash

ENV PORT 9000
ENV ADMIN_PORT 9001

EXPOSE 9000
EXPOSE 9001

WORKDIR /app

ADD config.yml .
ADD target/re-build-systems-sample-java-app-1.0.jar .

CMD java -jar /app/re-build-systems-sample-java-app-1.0.jar server /app/config.yml
