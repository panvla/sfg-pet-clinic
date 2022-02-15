package com.vladimirpandurov.sfgpetclinic.repositories;

import com.vladimirpandurov.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
