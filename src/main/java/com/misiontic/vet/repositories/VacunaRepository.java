package com.misiontic.vet.repositories;

import com.misiontic.vet.models.Vacuna;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VacunaRepository extends MongoRepository <Vacuna, String> { }


