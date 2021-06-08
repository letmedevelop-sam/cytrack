package com.cydeo.enums;

public enum TaskStatus {

    IN_PROGRESS("In Progress"), LATE("Late"), COMPLETED("Completed");

    private final String value;

    private TaskStatus(String value){

        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
