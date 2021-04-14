FROM ubuntu:20.04

COPY /ToolBox
WORKDIR /ToolBox

RUN apt update && apt install -y openjdk-8-jre openjdk-8-jdk firefox
RUN javac ToolBox.java
CMD ["java", "ToolBox"]