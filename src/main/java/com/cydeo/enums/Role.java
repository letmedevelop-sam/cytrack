package com.cydeo.enums;

public enum Role {

    CYBERTEK_MENTOR("Cybertek Mentor"),
    ALUMNI_MENTOR("Cybertek Mentor"),
    ADMIN("Admin"),
    INSTRUCTOR("Instructor"),
    STUDENT("Student");

    private final String value;

    Role(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
