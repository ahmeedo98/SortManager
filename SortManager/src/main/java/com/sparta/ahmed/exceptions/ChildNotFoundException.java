package com.sparta.ahmed.exceptions;

public class ChildNotFoundException extends Exception {

    @Override
    public String getMessage(){
        return "Child not found";
    }
}
