package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {

    @Value("${user.firstName:default}")
    private String firstName;

    @Value("${user.lastName:default}")
    private String lastName;

    @Value("${user.age:0}")
    private Integer age;

    @RequestMapping(value = "user-details", method= RequestMethod.GET)
    public String getFirstName() {
        return "user-details {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

}
