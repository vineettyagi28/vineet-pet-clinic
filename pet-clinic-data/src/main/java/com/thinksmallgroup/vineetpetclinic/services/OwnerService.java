package com.thinksmallgroup.vineetpetclinic.services;

import com.thinksmallgroup.vineetpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
