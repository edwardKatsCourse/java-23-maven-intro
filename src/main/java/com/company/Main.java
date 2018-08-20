package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Main {

    /**
     * 1. Different IDEs -> different Java projects
     * 2. Different external libraries
     * 3. Build project -> .jar
     * 4. multi-module project???
     *
     *
     * Fields:
     * GroupId -> packages (com.telran/com.company)
     * ArtifactId -> maven-demo-java-23
     * Version -> 2.0-SNAPSHOT
     *
     * pom.xml -> THE MAIN MAVEN FILE!!!
     */

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        Person peter = new Person("Peter", "Dale", 41);
        String json = objectMapper.writeValueAsString(peter);
        System.out.println(json);


        Person peterFromJson = objectMapper.readValue(json, Person.class);
        System.out.println(peterFromJson.toString());


    }
}


class Person {

    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}