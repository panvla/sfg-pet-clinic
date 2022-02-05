package com.vladimirpandurov.sfgpetclinic.bootstrap;

import com.vladimirpandurov.sfgpetclinic.model.Owner;
import com.vladimirpandurov.sfgpetclinic.model.Vet;
import com.vladimirpandurov.sfgpetclinic.services.OwnerService;
import com.vladimirpandurov.sfgpetclinic.services.VetService;
import com.vladimirpandurov.sfgpetclinic.services.map.OwnerServiceMap;
import com.vladimirpandurov.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

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
