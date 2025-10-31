package com.example.springdatarest.projection;

import com.example.springdatarest.entities.Compte;
import com.example.springdatarest.entities.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde", types = Compte.class)
public interface CompteProjection1 {
    double getSolde();
}

@Projection(name = "mobile", types = Compte.class)
public interface CompteProjection2 {
    double getSolde();
    TypeCompte getType();
}