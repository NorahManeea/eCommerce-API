package com.example.ecommerceapi.entity;

import com.example.ecommerceapi.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Set<Role> role;
}
