package com.pkg.exception_3;

import java.util.Arrays;
import java.util.List;

public class ExceptionTest_3 {

    private List<User> allUsers = Arrays.asList(new User(1L, "sakaa moto"),
            new User(2L, "ajit"));

    public void findUserById(long id){
        boolean res = allUsers.stream().anyMatch(data -> data.getUserId() == id);
        if(!res){
            throw new UserNotFoundException(id);
        }
        System.out.println("yup got the user...");
    }

    public static void main(String[] args) {

        try {
            ExceptionTest_3 t3 = new ExceptionTest_3();
            t3.findUserById(10L);

        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
