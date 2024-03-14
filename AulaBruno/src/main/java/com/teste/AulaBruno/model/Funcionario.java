package com.teste.AulaBruno.model;

import jakarta.persistence.*;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String nome;

    @Column
    private String matricula;

    @Column
    private Double salario;

    @Column
    private Double bonificacao;

    @Column
    private Double comissao;


    // Getters and setters
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }


    public Funcionario() {
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salario=" + salario +
                ", bonificacao=" + bonificacao +
                ", comissao=" + comissao +
                '}';
    }
}
