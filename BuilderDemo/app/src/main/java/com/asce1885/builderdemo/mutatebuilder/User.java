package com.asce1885.builderdemo.mutatebuilder;

/**
 * Created by guhaoxin on 16/12/25.
 */
public class User {

    private final String mFirstName; // 必选
    private final String mLastName; // 必选
    private final String mGender;    // 可选
    private final int mAge;       // 可选
    private final String mPhoneNo;   // 可选

    private User(UserBuilder builder) {
        mFirstName = builder.firstName;
        mLastName = builder.lastName;
        mGender = builder.gender;
        mAge = builder.age;
        mPhoneNo = builder.phoneNo;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String gender;
        private int age;
        private String phoneNo;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
