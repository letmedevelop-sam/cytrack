package com.cydeo.enums;

public enum Country {

    US("United States"), DEU("Germany"), UK("United Kingdom"),  TUR("Turkey"),  HUN("Hungary");

    private final String value;

    Country(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
