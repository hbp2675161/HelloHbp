FROM openjdk:8
COPY ./out/artifacts/hbp_jar/hbp.jar hbp.jar
ENV JAVA_OPTS=""
EXPOSE 9191
ENTRYPOINT ["java","-jar","./hbp.jar"]