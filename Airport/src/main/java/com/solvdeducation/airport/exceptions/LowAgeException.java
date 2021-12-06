package com.solvdeducation.airport.exceptions;

public class LowAgeException extends Exception{
    public LowAgeException(){
        super("Buyers age must be over 18");
    }
}
