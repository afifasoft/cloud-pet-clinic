package com.cloudchainsoftware.cloudpetclinic.services;

import com.cloudchainsoftware.cloudpetclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long>{

    Owner findByLastName(String lastName);
}
