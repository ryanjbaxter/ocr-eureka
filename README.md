# ocr-eureka
[![CircleCI](https://circleci.com/gh/ryanjbaxter/ocr-eureka.svg?style=svg)](https://circleci.com/gh/ryanjbaxter/ocr-eureka)

Eureka server for OCR Spring Cloud sample.  It uses 
[Eureka from Spring Cloud Netflix](http://cloud.spring.io/spring-cloud-static/spring-cloud.html#spring-cloud-eureka-server).

## Running
This is a simple Spring Boot application and can be run simply by cloning the repo.

```
$ git clone https://github.com/ryanjbaxter/ocr-eureka
$ cd ocr-eureka
$ ./mvnw spring-boot:run
```

Alternatively you can run this application using an [image](https://hub.docker.com/r/ryanjbaxter/ocr-eureka/) from Docker Hub.

```
$ docker run -i -p 8761:8761 ryanjbaxter/ocr-eureka
```

## Usage

Once running you can go to `http://localhost:8761` to see the Eureka Dashboard.
