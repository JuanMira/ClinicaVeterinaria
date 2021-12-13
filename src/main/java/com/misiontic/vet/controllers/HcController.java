package com.misiontic.vet.controllers;

import com.misiontic.vet.exceptions.HcNotFoundException;
import com.misiontic.vet.models.Hc;
import com.misiontic.vet.models.Vacuna;
import com.misiontic.vet.models.CFisiologicas;
import com.misiontic.vet.repositories.CFisiologicasRepository;
import com.misiontic.vet.repositories.HcRepository;
import com.misiontic.vet.repositories.VacunaRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Date;

@RestController
public class HcController {

    private final HcRepository hcRepository;
    private final VacunaRepository vacunaRepository;
    private final CFisiologicasRepository cFisiologicasRepository;

    public HcController(HcRepository hcRepository, VacunaRepository vacunaRepository, CFisiologicasRepository cFisiologicasRepository) {
        this.hcRepository = hcRepository;
        this.vacunaRepository =vacunaRepository;
        this.cFisiologicasRepository = cFisiologicasRepository;
    }

    @PostMapping("/hc")
    Hc newHc(@RequestBody Hc hc) {
        hc.setFechaConsulta(new Date());
        return hcRepository.save(hc);
    }

    @GetMapping("/hc/{idMascota}")
    List<Hc> mascotaHc(@PathVariable String idMascota){
        Hc mascotaHc = hcRepository.findById(idMascota).orElse(null);
        if (mascotaHc == null)

            throw new HcNotFoundException("No se encontro una historia clínica para el id Mascota:" + idMascota);

        List<Hc> hcByIdMascota = hcRepository.findByIdMascota(idMascota);
        return hcByIdMascota;
    }
}
