package com.veterinaria.mascotas.main.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.veterinaria.mascotas.main.models.Pet;
import com.veterinaria.mascotas.main.repositories.PetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
    private final PetRepository petRepository;

    @Autowired
    private MongoOperations mongoOperations;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @PostMapping("/pet")
    Pet createPet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }

    @GetMapping("/pet/{id}")
    Pet getPet(@PathVariable String id) throws Exception {
        return petRepository.findById(id).orElseThrow(() -> new Exception("ID de mascota no existe"));
    }

    @GetMapping("/pet")
    List<Pet> getPetList() {
        return petRepository.findAll();
    }

    @PutMapping("/pet/{id}")
    Map<String, String> updatePet(@PathVariable String id, @RequestBody Pet pet) {
        HashMap<String, String> res = new HashMap<String, String>();
        Query query = new Query();
        query.addCriteria(Criteria.where("idMascota").is(id));
        Pet petFounded = mongoOperations.findOne(query, Pet.class);

        if (!pet.getNombreMascota().equals("")) {
            petFounded.setNombreMascota(pet.getNombreMascota());
        }

        if (!pet.getRaza().equals("")) {
            petFounded.setRaza(pet.getRaza());
        }

        if (!pet.getIdDueño().equals("")) {
            petFounded.setIdDueño(pet.getIdDueño());
        }

        petRepository.save(petFounded);

        res.put("Message", "actualizado satisfactoriamente");
        return res;
    }

    @DeleteMapping("/pet/{id}")
    Map<String, String> deletePet(@PathVariable String id) {
        HashMap<String, String> res = new HashMap<String, String>();
        Optional<Pet> exist = petRepository.findById(id);
        if (exist.isPresent()) {
            petRepository.deleteById(id);
            res.put("message", "Borrado satisfactoriamente");
            return res;
        }

        res.put("message", "Mascota no existe");
        return res;
    }

}
