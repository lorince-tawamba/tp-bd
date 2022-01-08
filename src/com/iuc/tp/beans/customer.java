package com.iuc.tp.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class customer {

    private Long id;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String email;
}
