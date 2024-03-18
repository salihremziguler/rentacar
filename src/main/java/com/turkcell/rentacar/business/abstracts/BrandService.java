package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Brand;
import com.turkcell.rentacar.entities.concretes.Fuel;

import java.util.List;

public interface BrandService {
    Brand add(Brand brand);
    List<Brand> getAll();
    Brand getById(int id);
    Brand update(int id, Brand brand);
    void delete(int id);

}
