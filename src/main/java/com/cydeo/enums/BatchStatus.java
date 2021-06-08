package com.cydeo.enums;

public enum BatchStatus {

    ACTIVE("In Progress"), COMPLETED("Completed");

    private final String value;

    private BatchStatus(String value){

        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
