package com.cloudchainsoftware.cloudpetclinic.services.map;

import com.cloudchainsoftware.cloudpetclinic.model.Vet;
import com.cloudchainsoftware.cloudpetclinic.services.CRUDService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService implements CRUDService<Vet,Long> {


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(),vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete();
    }

    @Override
    public void deleteById(Long id) {

    }
}
