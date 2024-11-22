
package com.example.demo.controller;

import com.example.demo.model.Dispositivo;
import com.example.demo.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController {

    @Autowired
    private DispositivoRepository dispositivoRepository;

    @PostMapping
    public Dispositivo criar(@RequestBody @Valid Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }

    @GetMapping
    public List<Dispositivo> listar() {
        return dispositivoRepository.findAll();
    }
}
