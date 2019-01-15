package com.idomine.testes;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import com.idomine.model.Person;

/**
 * 
 * @author LYNDON TAVARES
 * 
 *         Lambda: Lambda calculus, which is a theoretical framework for describing functions and their evaluation.
 * 
 *         A lambda expression is something like a method without a name.
 *
 */
public class Lambda01
{

    @Test
    public void lambda_1()
    {

        List<Person> pessoas = Person.of(10);

        List<Person> pFiltro = pessoas.stream().filter(p ->
        {

            System.out.println(p.getNome());
            return p.getNome().equals("Person 10");

        }).collect(Collectors.toList());
        
        
        System.out.println(pessoas);
        
        System.out.println(pFiltro);
    }

}
