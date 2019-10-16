package com.company;

public class WorkplaceCommunication implements Communication{
    Boolean isOffice;

    public String greet(String greeting) {
        if (greeting == "Hello") {
            return "Hello";
        }
        return "";
    }

    public Boolean sayWhere(String where){
        if(where == "Office"){
            isOffice = true;
        } else{
            isOffice = false;
        }
        return isOffice;
    }
}
