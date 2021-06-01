package br.edu.iftm.expolimorfismo.testes;

import br.edu.iftm.expolimorfismo.classes.*;
import br.edu.iftm.expolimorfismo.classes.filhas.*;
import br.edu.iftm.expolimorfismo.classes.filhas.ex2.Cachorro2;

public class Principal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p =  new Peixe();
        Ave a = new Ave();
        
        m.setPeso(85.3);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        p.setPeso(0.35);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();

        a.setPeso(0.89);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();





        //Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        m.setPeso(5.70);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        c.setPeso(55.30);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        k.setPeso(3.94);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();







        Cachorro2 cachorro = new Cachorro2();
        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11, 45);
        cachorro.reagir(21, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2, 12.5);
        cachorro.reagir(17, 4.5);       
    }
}
