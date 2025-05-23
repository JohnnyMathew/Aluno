package com.example.alunoapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.alunoapi.model.Aluno;

public interface AlunoRepository extends MongoRepository<Aluno, String> {}