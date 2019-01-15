package com.idomine.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person
{
    private long id;

    private String nome;

    private Integer idade;

    private String email;

    private BigDecimal salario;

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Integer getIdade()
    {
        return idade;
    }

    public void setIdade(Integer idade)
    {
        this.idade = idade;
    }

    public BigDecimal getSalario()
    {
        return salario;
    }

    public void setSalario(BigDecimal salario)
    {
        this.salario = salario;
    }

    public Person()
    {
    }

    public Person(String nome, int idade)
    {
        super();
        this.nome = nome;
        this.idade = idade;
    }

    public static List<Person> of(int numeroPessoas)
    {
        List<Person> pessoas = new ArrayList<>();
        Random rand = new Random();

        for (int i = 1; i <= numeroPessoas; i++)
        {
            Person p = new Person();

            int randomNum = rand.nextInt(10000);

            p.setId(i);
            p.setNome("Person " + i);
            p.setEmail("gmail" + i + "@gmail.com");
            p.setSalario(new BigDecimal(randomNum));
            pessoas.add(p);
        }
        return pessoas;
    }

    @Override
    public String toString()
    {
        return "Person [id=" + id + ", nome=" + nome + ", idade=" + idade + ", email=" + email + ", salario=" + salario + "]";
    }

 

}
