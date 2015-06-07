/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dazito.couchdbrxjava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;




/**
 *
 * @author Pedro
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    
    @JsonProperty("_id")
    private String id;

    @JsonProperty("_rev")
    private String revision;
    
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    private String country;

    public Person(String firstName, String lastName, int age, String location, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.country = country;
    }

    public Person(String id, String revision, String firstName, String lastName, int age, String location, String country) {
        this.id = id;
        this.revision = revision;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.country = country;
    }

    public Person() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getRevision() {
        return revision;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }
}
