package com.misiontic.vet.exceptions;

public class HcNotFoundException extends RuntimeException {
    public HcNotFoundException(String message) {
        super(message);
    }
}
