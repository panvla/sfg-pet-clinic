package com.vladimirpandurov.sfgpetclinic.services;

import com.vladimirpandurov.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
