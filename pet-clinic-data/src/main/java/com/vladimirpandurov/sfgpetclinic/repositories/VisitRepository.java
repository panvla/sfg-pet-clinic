package com.vladimirpandurov.sfgpetclinic.repositories;

import com.vladimirpandurov.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
