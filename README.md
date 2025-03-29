# Java Application Dockerfile Example

## This is a simple example of a Dockerfile for a Java application.
```
docker build -t my-java-app . ; 
docker run -it --rm my-java-app ; 
```
![image](https://github.com/user-attachments/assets/610f401e-996e-48da-acf2-34101e567d7d)

## JAVA GAV
* The GAV (Group, Artifact, Version) coordinates for the Java application are as follows:
  * Group: com.example
  * Artifact: java-app
  * Version: 1.0.0
* The GAV coordinates are used to identify the Java application and its dependencies in a Maven or Gradle project.
* The GAV coordinates are typically specified in the `pom.xml` file for Maven projects or the `build.gradle` file for Gradle projects.
* The GAV coordinates are used to manage the dependencies of the Java application and to ensure that the correct versions of the dependencies are used when building and running the application.
* The GAV coordinates are also used to publish the Java application to a Maven or Gradle repository, such as Maven Central or JFrog Artifactory.
