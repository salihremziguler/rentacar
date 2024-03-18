package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Model;
import com.turkcell.rentacar.entities.concretes.Transmission;

import java.util.List;

public interface TransmissionService {
    Transmission add(Transmission brand);
    List<Transmission> getAll();
    Transmission getById(int id);
    Transmission update(int id, Transmission brand);
    void delete(int id);

}
