package com.vladimirpandurov.sfgpetclinic.repositories;

import com.vladimirpandurov.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
