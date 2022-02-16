package com.vladimirpandurov.sfgpetclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Setter
@Getter
@MappedSuperclass
public class Person extends BaseEntity{

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;


}
