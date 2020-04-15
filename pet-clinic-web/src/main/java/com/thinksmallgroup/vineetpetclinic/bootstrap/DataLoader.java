package com.thinksmallgroup.vineetpetclinic.bootstrap;

import com.thinksmallgroup.vineetpetclinic.model.Owner;
import com.thinksmallgroup.vineetpetclinic.model.Vet;
import com.thinksmallgroup.vineetpetclinic.services.OwnerService;
import com.thinksmallgroup.vineetpetclinic.services.PetService;
import com.thinksmallgroup.vineetpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Owner 1");
        owner1.setId(1L);
        owner1.setLastName("Last 1");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Owner 2");
        owner2.setId(2L);
        owner2.setLastName("Last 2");

        ownerService.save(owner2);

        System.out.println("Owners Loaded...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Vet 1");
        vet1.setId(1L);
        vet1.setLastName("Last 1");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Vet 2");
        vet2.setId(1L);
        vet2.setLastName("Last 2");

        vetService.save(vet2);

        System.out.println("Vets Loaded...");

    }
}
