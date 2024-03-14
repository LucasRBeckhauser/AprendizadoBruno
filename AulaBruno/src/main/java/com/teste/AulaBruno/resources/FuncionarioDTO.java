package com.teste.AulaBruno.resources;

import com.teste.AulaBruno.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDTO {

    private Long id;
    private String nome;
    private String matricula;

    private Double bonificacao;


    public FuncionarioDTO() {
    }

    public FuncionarioDTO(Long id, String nome, String matricula, Double bonificacao) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.bonificacao = bonificacao;
    }


    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static FuncionarioDTO fromEntity(Funcionario funcionario) {
        return new FuncionarioDTO(
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getMatricula(),
                funcionario.getBonificacao()

        );
    }

    public static List<FuncionarioDTO> fromEntityList(List<Funcionario> funcionarios) {
        List<FuncionarioDTO> funcionarioDTOList = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            funcionarioDTOList.add(fromEntity(funcionario));
        }
        return funcionarioDTOList;
    }

    public Funcionario toEntity() {
        Funcionario funcionario = new Funcionario();
        funcionario.setId(this.id);
        funcionario.setNome(this.nome);
        funcionario.setMatricula(this.matricula);
        funcionario.setBonificacao(this.bonificacao);
        return funcionario;
    }

    public static  List <Funcionario> toEntityList (List<FuncionarioDTO> funcionarioDTOS) {
        List<Funcionario> funcionarios = new ArrayList<>();
        for (FuncionarioDTO funcionarioDTO : funcionarioDTOS) {
            funcionarios.add(funcionarioDTO.toEntity());
        }
        return funcionarios;
    }


}

