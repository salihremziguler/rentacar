package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.TransmissionService;
import com.turkcell.rentacar.dataAccess.abstracts.TransmissionRepository;
import com.turkcell.rentacar.entities.concretes.Transmission;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class TransmissionManager implements TransmissionService {

    private TransmissionRepository transmissionRepository;

    @Override
    public Transmission add(Transmission brand) {
        return transmissionRepository.save(brand);
    }

    @Override
    public List<Transmission> getAll() {
        return transmissionRepository.findAll();
    }

    @Override
    public Transmission getById(int id) {
        return transmissionRepository.getById(id);
    }

    @Override
    public Transmission update(int id, Transmission transmission) {
        Transmission updatedTransmission = transmissionRepository.findById(id).orElse(null);
        if (updatedTransmission == null) {
            return null;
        }
        updatedTransmission.setName(transmission.getName());
        return transmissionRepository.save(updatedTransmission);
    }

    @Override
    public void delete(int id) {
        transmissionRepository.deleteById(id);
    }

}