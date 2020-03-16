FROM openjdk:8
ADD /build/libs/angular-spring-api.jar  angular-spring-api.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","angular-spring-api.jar" ]
