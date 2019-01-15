package com.idomine.testes;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.idomine.model.Person;

public class Lambda05
{

    public static void main(String[] args)
    {
        
        List<Person> pessoas = Person.of(10);
        
        BigDecimal totalSalarios = pessoas
                .stream()
                .map(Person::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        
        System.out.println("Total de Salário: "+totalSalarios);
        
        
        Optional<Person> maiorSalario = pessoas
                .stream()
                .max(Comparator.comparing(Person::getSalario));
        System.out.println("Pessoa com maior salário: "+maiorSalario);
                
        
        Optional<Person> menorSalario = pessoas
                .stream()
                .min(Comparator.comparing(Person::getSalario));
        System.out.println("Pessoa com menor salário: "+menorSalario);
        
        
        
    }
}
