package com.vladimirpandurov.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person{

    private Set<Pet> pets;

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
