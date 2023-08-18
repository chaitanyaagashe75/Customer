package com.example.customer.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
@NoArgsConstructor
public class Customer {
    @Id
    private int id;
    private String name;
    private String address;

}
