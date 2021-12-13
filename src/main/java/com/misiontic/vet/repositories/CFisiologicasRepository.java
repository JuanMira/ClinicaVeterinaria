package com.misiontic.vet.repositories;

import com.misiontic.vet.models.CFisiologicas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CFisiologicasRepository extends MongoRepository <CFisiologicas, String> { }

