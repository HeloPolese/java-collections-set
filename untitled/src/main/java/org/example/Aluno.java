package org.example;

import java.util.Date;
import java.util.Objects;

public class Aluno {
    private Integer matricula;
    private String nome;
    private Date dataDeNascimento;

    public Aluno(Integer matricula, String nome, Date dataDeNascimento){
        this.matricula = matricula;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public Integer getMatricula() {
        return this.matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString() {
        return nome + " - " + matricula + " - " + dataDeNascimento;
    }
}
