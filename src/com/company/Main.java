package com.company;

import Controller.Cadastro;
import Model.Bloco;
import Model.Localidade;
import Model.Mesa;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Localidade senai = new Localidade();
        senai.autoCadastro();
        System.out.println(senai.toString());
        Bloco c = new Bloco();
        c.autoCadastro();
        System.out.println(c.toString());
        Mesa minha = new Mesa();
        minha.autoCadastro();
        System.out.println(minha.toString());
    }
}
