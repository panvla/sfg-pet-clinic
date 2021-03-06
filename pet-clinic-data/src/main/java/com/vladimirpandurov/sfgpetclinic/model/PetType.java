package com.vladimirpandurov.sfgpetclinic.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name="types")
public class PetType extends BaseEntity{
    @Column(name="name")
    private String name;

    public String toString(){
        return this.getName();

    }
}
