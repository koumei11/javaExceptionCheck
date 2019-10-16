package com.company;

public class YourNotMyBossException extends Exception {
    private static final long serialVersionUID = 1L;

    YourNotMyBossException(String msg){
        super(msg);
    }
}
