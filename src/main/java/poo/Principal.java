package poo;

import veiculos.*;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Alguns testes para entender...\n");

        VeiculoTerrestre a = new Ferrari("Testarossa");
        VeiculoTerrestre b = new Panther("Panther2");
        VeiculoTerrestre c = new Pampa("Pampa Guia");
        VeiculoMarinho   d = new Panther("Panther python");
        VeiculoAnfibio e = new Panther("Panther watercar");
        Veiculo f = new Ferrari("F430");
        Veiculo g = new Panther("Panther Fusc");
        Veiculo h = new Pampa("LS");


        a.acelerar(30);
        a.acelerar(2);
        b.acelerar(10);
        c.acelerar(10);
        e.acelerar(10);

        ((Ferrari) a).abrirCapota();

        d.esvaziarLastro();
        e.esvaziarLastro();

        ((Ferrari) f).acelerar(1);
        System.out.println("velocidade f:" + ((Ferrari) a).getVelocidade_atual());

        Ferrari i = (Ferrari) f;
        i.abrirCapota();
        i.acelerar(10);

        ((Ferrari) f).ligarFarolNeblina();


    }

}
