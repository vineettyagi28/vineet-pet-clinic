package com.thinksmallgroup.vineetpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private Owner owner;
    private PetType petType;
    private LocalDate birthday;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
