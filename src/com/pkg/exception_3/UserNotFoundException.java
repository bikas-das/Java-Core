package com.pkg.exception_3;

public class UserNotFoundException extends RuntimeException {

    private long userId;

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(long id) {
        super("user not found with this id : " + id);
        this.userId = id;
    }

    public long getUserId() {
        return userId;
    }
}
