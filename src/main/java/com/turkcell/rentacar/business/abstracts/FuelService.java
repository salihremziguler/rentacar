package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Brand;
import com.turkcell.rentacar.entities.concretes.Fuel;

import java.util.List;

public interface FuelService {
    Fuel add(Fuel brand);
    List<Fuel> getAll();
    Fuel getById(int id);
    Fuel update(int id, Fuel brand);
    void delete(int id);

}
