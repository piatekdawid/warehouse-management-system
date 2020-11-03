package com.dawidp.warehousemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;
    private String company;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String street;
    @Column(name = "street_number")
    private String streetNumber;
    @Column(name = "zip_code")
    private String zipCode;
    private String city;
    private String country;
    private String phone;
    @NaturalId
    private String email;
}
