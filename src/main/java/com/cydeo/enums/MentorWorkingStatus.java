package com.cydeo.enums;

public enum MentorWorkingStatus {
    FULL_TIME("Full Time"), PART_TIME("Part Time");

    private final String value;

    MentorWorkingStatus(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
