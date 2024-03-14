package com.teste.AulaBruno.repository;

import com.teste.AulaBruno.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Long> {

}
