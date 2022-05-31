# syntax=docker/dockerfile:1
# 基础镜像
FROM openjdk:8
MAINTAINER SZ
# 指定工作目录
WORKDIR /app
# 移入工作目录
COPY ./target/demo-0.0.1-SNAPSHOT.jar ./
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]