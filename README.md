# Java Collections: Set

Atividade de fixação sobre a interface `Set` em Java, usando `HashSet` para garantir que não existam elementos duplicados.

## Sobre a atividade

O programa simula o cadastro de alunos em cursos ministrados por um instrutor. Cada curso guarda seus alunos em um `Set`, então o mesmo aluno não pode ser matriculado duas vezes no mesmo curso. No final, o programa mostra o total de alunos do instrutor, contando cada aluno uma única vez, mesmo que ele esteja em mais de um curso.

## Estrutura

- **Instrutor:** possui nome, data de nascimento, CPF e uma lista de cursos.
- **Curso:** possui nome e um `Set` de alunos.
- **Aluno:** possui matrícula, nome e data de nascimento. A matrícula identifica o aluno.
- **Main:** lê os dados pelo console e executa o cadastro.

## Conceitos praticados

- Interface `Set` e implementação `HashSet`
- Sobrescrita de `equals` e `hashCode` (o aluno é identificado pela matrícula)
- Associação entre classes (instrutor tem cursos, curso tem alunos)
- Encapsulamento (listas e conjuntos protegidos nos getters)
- Tratamento de exceções

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/HeloPolese/java-collections-set.git
   ```
2. Abra o projeto no IntelliJ IDEA.
3. Execute a classe `Main`.


## Tecnologias

- Java
- IntelliJ IDEA
- Git e GitHub
