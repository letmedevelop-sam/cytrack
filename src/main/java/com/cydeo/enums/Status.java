package com.cydeo.enums;

public enum Status {

    NEW("New"), RETAKING("Re-Taking"),RETURNING("Returing");

    private final String value;

    private Status(String value){

        this.value=value;
    }

    public String getValue(){
        return value;
    }

}
