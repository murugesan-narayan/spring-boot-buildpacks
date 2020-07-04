### spring Boot Buildpacks

    This application demonstrates how to build docker image using inbuilt buildpacks in spring boot

To Build Image:

    mvn spring-boot:build-image
    
To Run Container:

    docker run -p 8080:8080 --name springbootcontainer spring-boot-buildpacks:1.0-SNAPSHOT
    

Note: Ensure that you have proper docker setup locally.