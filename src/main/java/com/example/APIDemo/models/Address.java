package com.example.APIDemo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Address {
    private String houseNo;

    private String streetName;

    private String city;

    private String state;

    private String country;

    private String pinCode;

}
