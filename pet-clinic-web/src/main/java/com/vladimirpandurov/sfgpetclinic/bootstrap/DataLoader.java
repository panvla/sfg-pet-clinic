package com.vladimirpandurov.sfgpetclinic.bootstrap;

import com.vladimirpandurov.sfgpetclinic.model.Owner;
import com.vladimirpandurov.sfgpetclinic.model.PetType;
import com.vladimirpandurov.sfgpetclinic.model.Vet;
import com.vladimirpandurov.sfgpetclinic.services.OwnerService;
import com.vladimirpandurov.sfgpetclinic.services.PetTypeService;
import com.vladimirpandurov.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);


        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Pera");
        owner2.setLastName("Peric");

        ownerService.save(owner2);

        System.out.println("Loaded Owners.....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mica");
        vet1.setLastName("Milicevic");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Vlade");
        vet2.setLastName("Divac");

        vetService.save(vet2);

        System.out.println("Loaded Vets......");

    }
}
