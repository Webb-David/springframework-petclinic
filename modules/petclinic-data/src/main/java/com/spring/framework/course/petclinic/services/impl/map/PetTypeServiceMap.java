package com.spring.framework.course.petclinic.services.impl.map;

import com.spring.framework.course.petclinic.model.PetType;
import com.spring.framework.course.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType findTypeByName(String petTypeName) {
        return findAll().stream()
                .filter(petType -> petType.getName().equalsIgnoreCase(petTypeName))
                .findFirst().orElse(null);
    }
}
