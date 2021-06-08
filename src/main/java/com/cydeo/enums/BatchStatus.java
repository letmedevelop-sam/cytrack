package com.cydeo.enums;

public enum BatchStatus {

    IN_PROGRESS("In Progress"), COMPLETED("Completed");

    private final String value;

    private BatchStatus(String value){

        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
