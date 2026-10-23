package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {
    private String nome;
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Aluno> getAlunos() {
        return this.alunos;
    }

    public void adicionarAluno(Aluno aluno){
        if (alunos.contains(aluno)){
            throw new IllegalArgumentException("Este aluno já está cadastrado no curso!");
        }
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        this.alunos.remove(aluno);
    }
}
