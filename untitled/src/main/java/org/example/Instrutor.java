package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Instrutor {
    private String nome;
    private Date dataDeNascimento;
    private String cpf;
    private List<Curso> cursos = new ArrayList<>();


    public Instrutor(String nome, Date dataDeNascimento, String cpf){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;

        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11){
            throw new Error("O cpf está incorreto!");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public Date getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<Curso> getCursos(){
        return this.cursos;
    }

    public void adicionarCurso(Curso curso){
        this.cursos.add(curso);
    }

    public void removerCurso(Curso curso){
        this.cursos.remove(curso);
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.dataDeNascimento + " - " + this.cpf;
    }
}
