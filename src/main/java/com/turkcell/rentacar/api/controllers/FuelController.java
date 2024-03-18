package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.FuelService;
import com.turkcell.rentacar.entities.concretes.Fuel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/fuels")
public class FuelController {

    private FuelService fuelService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Fuel add(@RequestBody Fuel fuel) {
        return fuelService.add(fuel);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Fuel> getAll() {
        return fuelService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Fuel getById(@PathVariable int id) {
        return fuelService.getById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Fuel update(@PathVariable int id, @RequestBody Fuel fuel) {
        return fuelService.update(id, fuel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id) {
        fuelService.delete(id);
    }

}
