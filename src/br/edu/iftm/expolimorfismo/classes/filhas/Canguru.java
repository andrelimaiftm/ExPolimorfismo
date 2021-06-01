package br.edu.iftm.expolimorfismo.classes.filhas;

import br.edu.iftm.expolimorfismo.classes.Mamifero;

public class Canguru extends Mamifero{
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
