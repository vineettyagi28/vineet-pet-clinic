package com.thinksmallgroup.vineetpetclinic.service;

import com.thinksmallgroup.vineetpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
