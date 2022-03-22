package com.vladimirpandurov.sfgpetclinic.controllers;

import com.vladimirpandurov.sfgpetclinic.model.Pet;
import com.vladimirpandurov.sfgpetclinic.model.Visit;
import com.vladimirpandurov.sfgpetclinic.services.PetService;
import com.vladimirpandurov.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/owners")
public class VisitController {

    private final VisitService visitService;
    private final PetService petService;

    public VisitController(VisitService visitService, PetService petService) {
        this.visitService = visitService;
        this.petService = petService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields("id");
    }
    @ModelAttribute("visit")
    public Visit loadPetWithVisit(@PathVariable Long petId, Model model){
        Pet pet = petService.findById(petId);
        model.addAttribute("pet", pet);
        Visit visit = new Visit();
        pet.getVisits().add(visit);
        visit.setPet(pet);
        return visit;
    }
    @GetMapping("/*/pets/{petId}/visits/new")
    public String initNewVisitForm(@PathVariable Long petId, Model model){
        return "pets/createOrUpdateVisitForm";
    }
    @PostMapping("/{ownerId}/pets/{petId}/visits/new")
    public String processNewVisitForm(Visit visit, BindingResult result){
        if(result.hasErrors()){
            return "pets/createOrUpdateVisitForm";
        }else {
            this.visitService.save(visit);
            return "redirect:/owners/{ownerId}";
        }
    }

}
