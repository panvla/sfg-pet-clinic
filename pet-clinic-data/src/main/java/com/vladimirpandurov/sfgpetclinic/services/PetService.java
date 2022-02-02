package com.vladimirpandurov.sfgpetclinic.services;

import com.vladimirpandurov.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
