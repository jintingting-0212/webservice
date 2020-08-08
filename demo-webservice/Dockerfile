FROM openjdk:8u181-jdk-alpine

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

WORKDIR /home/apps/
ADD target/demo-webservice-0.0.1-SNAPSHOT.jar .


ENTRYPOINT ["java","-jar", "demo-webservice-0.0.1-SNAPSHOT.jar"]
