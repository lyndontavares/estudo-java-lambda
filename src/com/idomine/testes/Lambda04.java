package com.idomine.testes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.idomine.model.Person;

public class Lambda04
{

    public static void main(String[] args)
    {

        List<Person> listPersons = Arrays.asList(new Person("Eduardo", 12),
                new Person("Luiz", 32), new Person("Bruna", 26));

        System.out.println("Ordenando Persons pelo nome:");
        Collections.sort(listPersons, (Person Person1, Person Person2) -> Person1.getNome().compareTo(Person2.getNome()));
        listPersons.forEach(p -> System.out.println(p.getNome()));

        System.out.println("Ordenando Persons pela idade:");
        Collections.sort(listPersons, (Comparator<? super Person>) (Person Person1, Person Person2) -> Person1.getIdade().compareTo(Person2.getIdade()));
        listPersons.forEach(p -> System.out.println(p.getNome()));

    }
}
