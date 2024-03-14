package com.teste.AulaBruno.resources;

import com.teste.AulaBruno.model.Funcionario;
import com.teste.AulaBruno.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @PostMapping
    public ResponseEntity create(@RequestBody Funcionario entity) {
        repository.save(entity);
        return ResponseEntity.ok().body(entity);
    }

    @GetMapping
    public ResponseEntity findAll (@RequestParam(defaultValue = "0")int page,
                                   @RequestParam(defaultValue = "10") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Funcionario> funcionariosPage = repository.findAll(pageable);
        Page<FuncionarioDTO> funcionariosDTOPage = funcionariosPage.map(FuncionarioDTO::fromEntity);
        return ResponseEntity.ok(funcionariosDTOPage);
    }


}
