FROM java:8
EXPOSE 8761
VOLUME /tmp
ADD target/ocr-eureka*.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]