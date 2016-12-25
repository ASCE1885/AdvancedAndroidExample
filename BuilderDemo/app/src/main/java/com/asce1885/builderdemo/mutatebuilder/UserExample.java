package com.asce1885.builderdemo.mutatebuilder;

/**
 * Created by guhaoxin on 16/12/25.
 */
public class UserExample {

    public User getUser() {
        return new User.UserBuilder("Jack", "Wilson")
                .gender("male")
                .age(30)
                .phoneNo("13056978656")
                .build();
    }
}
