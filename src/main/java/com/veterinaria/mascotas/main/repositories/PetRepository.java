package com.veterinaria.mascotas.main.repositories;

import com.veterinaria.mascotas.main.models.Pet;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetRepository extends MongoRepository<Pet, String> {

}
