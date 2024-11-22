
package com.example.demo.controller;

import com.example.demo.model.ConsumoEnergetico;
import com.example.demo.repository.ConsumoEnergeticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/consumos")
public class ConsumoEnergeticoController {

    @Autowired
    private ConsumoEnergeticoRepository consumoRepository;

    @PostMapping
    public ConsumoEnergetico registrar(@RequestBody @Valid ConsumoEnergetico consumo) {
        return consumoRepository.save(consumo);
    }

    @GetMapping
    public List<ConsumoEnergetico> listar() {
        return consumoRepository.findAll();
    }

    @GetMapping("/paginados")
    public Page<ConsumoEnergetico> listarPaginados(@RequestParam int page, @RequestParam int size) {
        return consumoRepository.findAll(PageRequest.of(page, size));
    }
}
