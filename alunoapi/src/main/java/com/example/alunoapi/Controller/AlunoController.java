package com.example.alunoapi.Controller;

import com.example.alunoapi.model.Aluno;
import com.example.alunoapi.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<Object> obterTodos() {
        return ResponseEntity.ok(service.obterTodos());
    }

    @PostMapping
    public ResponseEntity<Object> criar(@RequestBody Aluno aluno) {
        return ResponseEntity.ok(service.criar(aluno));
    }
}