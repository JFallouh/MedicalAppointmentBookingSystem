/*
/created by James Fallouh 6171620
 */
package com.jamesFallouh.MAS.exception;

public class MASException extends RuntimeException {
    public MASException(String message) {
        super(message);
    }

    public MASException(String message, Throwable cause) {
        super(message, cause);
    }
}
