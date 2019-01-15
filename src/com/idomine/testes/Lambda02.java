package com.idomine.testes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Test;

import com.idomine.model.Person;

public class Lambda02
{

    @Test
    public void lambda_1()
    {

        List<Person> pessoas = Person.of(10);
        pessoas.forEach(System.out::println);
        
        List<Person> filtro1 = pessoas.stream().filter( p-> p.getNome().equals("Person 1")).collect(Collectors.toList());
        System.out.println(filtro1);
        
        String filtro2 = pessoas.stream().map( p-> p.getNome()).filter( nome-> nome.equals("Person 1")).collect(Collectors.joining(", "));
        System.out.println(filtro2);
     
        
        Optional<Person> filtro3 = pessoas.stream().filter( p -> p.getNome().startsWith("Person 1")).findAny();
        System.out.println(filtro3);
        

        long filtro4 = pessoas.stream().count();
        System.out.println(filtro4);
        
        
        
        
    }
}
