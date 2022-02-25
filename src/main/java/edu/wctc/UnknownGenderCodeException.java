package edu.wctc;

public class UnknownGenderCodeException extends Exception{

    public UnknownGenderCodeException(char genderCode){
        super(genderCode + " gender code is not known.");
    }
}
