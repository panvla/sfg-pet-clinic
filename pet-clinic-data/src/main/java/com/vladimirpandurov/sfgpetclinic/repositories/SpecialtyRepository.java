package com.vladimirpandurov.sfgpetclinic.repositories;

import com.vladimirpandurov.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
