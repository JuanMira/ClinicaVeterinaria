package com.misiontic.vet.repositories;

import com.misiontic.vet.models.Hc;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface HcRepository extends MongoRepository <Hc, String> {
    List<Hc> findByIdMascota (String idMascota);
}
