package com.stackoverflow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author maba, 2012-09-17
 */
public class App {

    public void imprimeCabecalho(List<String> alunos, String professor, String titulo) {
        imprimeUniversidade("Universidade de Brasília");
        imprimeTitulo(titulo);
        imprimeProfessor(professor);
        imprimeAlunos(alunos);
        imprimeData();
    }

    public static void main(String[] args) {
        App app = new App();
        List<String> alunos = new ArrayList<>();
        alunos.add("Letícia");
        alunos.add("Mariana");
        alunos.add("Bernardo");
        alunos.add("Clarissa");
        alunos.add("Felipe");
        app.imprimeCabecalho( alunos,"André Lanna", "DAS");
    }

    public void imprimeAlunos(List<String> alunos) {
        for(String aluno: alunos){
            System.out.println(aluno);
        }
    }

    public void imprimeProfessor(String name) {
        System.out.println(name);
    }

    public void imprimeTitulo(String name) {
        System.out.println(name);
    }

    public void imprimeData() {
        System.out.println(new Date());
    }

    public void imprimeUniversidade(String name) {
        System.out.println(name);
    }

}
