package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.BrandService;
import com.turkcell.rentacar.dataAccess.abstracts.BrandRepository;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Override
    public Brand add(Brand brand) {
        //todo : business rules

        Brand createdBrand = brandRepository.save(brand);
        return createdBrand;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getById(int id) {
        return brandRepository.findById(id).orElse(null);
    }

    @Override
    public Brand update(int id, Brand brand) {
        Brand updatedBrand = brandRepository.findById(id).orElse(null);
        if (updatedBrand == null) {
            return null;
        }
        updatedBrand.setName(brand.getName());
        return brandRepository.save(updatedBrand);
    }

    @Override
    public void delete(int id) {
        brandRepository.deleteById(id);
    }
}