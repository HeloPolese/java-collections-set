package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Set<Aluno> alunosUnicos = new HashSet<>();

        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Instrutor instrutor = new Instrutor("Alex", simpleDateFormat.parse("20/02/2007"),"111.111.111-11");
            Curso A = new Curso("cursoA");
            Curso B = new Curso("cursoB");
            Curso C = new Curso("cursoC");

            instrutor.adicionarCurso(A);
            instrutor.adicionarCurso(B);
            instrutor.adicionarCurso(C);

            for (Curso curso: instrutor.getCursos()){
                System.out.println("\nQuantos estudantes para o curso " + curso.getNome() + ":");
                int alunosParaCursoX = sc.nextInt();

                for (int i = 1; i <= alunosParaCursoX ; i++) {
                    System.out.println("\nMatricula: ");
                    int matricula = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Nome:");
                    String nome = sc.nextLine();

                    System.out.println("Data de Nascimento (dd/mm/yyyy): ");
                    Date dataDeNascimento = simpleDateFormat.parse(sc.next());

                    Aluno aluno = new Aluno(matricula,nome,dataDeNascimento);

                    curso.adicionarAluno(aluno);
                }
            }

            for (Curso curso : instrutor.getCursos()){
                alunosUnicos.addAll(curso.getAlunos());
            }

            System.out.println("Total de Alunos: " + alunosUnicos.size());
        }

        catch (ParseException e) {
            System.out.println("Data inválida!");
        }
        catch (InputMismatchException e){
            System.out.println("Digite dados Válidos!");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
        }
    }
}
