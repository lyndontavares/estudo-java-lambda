package com.idomine.testes;

import java.util.ArrayList;
import java.util.List;

import com.idomine.model.Person;

public class Lambda06
{

    public static void main(String[] args)
    {

        List<Person> pessoas = new ArrayList<>();

        Person pegarPrimeiraPessoaSeNaoCria = pessoas
                .stream()
                .findAny()
                .orElse(new Person("Nova Pessoa", 33));

        System.out.println(pegarPrimeiraPessoaSeNaoCria);

        List<Person> pessoas2 = Person.of(10);

        Person pessoasQueContemUmNoNome = pessoas
                .stream()
                .filter(p -> p.getNome().contains("1"))
                .findAny()
                .orElse(new Person("Nova Pessoa", 22));

        System.out.println("Primeira pessoa com 1 no nome ou cria novo: " + pessoasQueContemUmNoNome);
    }
}
