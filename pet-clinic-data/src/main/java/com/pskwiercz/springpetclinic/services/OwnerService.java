package com.pskwiercz.springpetclinic.services;

import com.pskwiercz.springpetclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {

    Owner findByLastName(String lastName);

}
