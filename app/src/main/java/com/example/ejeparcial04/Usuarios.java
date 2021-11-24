package com.example.ejeparcial04;
import java.util.ArrayList;

public class Usuarios {
    ArrayList correos =  new ArrayList();
    ArrayList nombres =  new ArrayList();
    ArrayList claves =  new ArrayList();
    ArrayList niveles = new ArrayList();
    /*
    1- Usuario
    2- Asistente
    3- Administrador
     */
    public Usuarios(){
        correos.add("2501882002@mail.utec.edu.sv");
        nombres.add("Vladimir");
        claves.add("password");
        niveles.add(1);

        correos.add("2524352016@mail.utec.edu.sv");
        nombres.add("Walter");
        claves.add("pass1234");
        niveles.add(1);


        correos.add("2528202016@mail.utec.edu.sv");
        nombres.add("Jorge");
        claves.add("jor1234");
        niveles.add(2);


        correos.add("2425212017@mail.utec.edu.sv");
        nombres.add("Eduardo");
        claves.add("edu1234");
        niveles.add(3);


        correos.add("2510252010@mail.utec.edu.sv");
        nombres.add("Karen");
        claves.add("kar1234");
        niveles.add(1);


        correos.add("2578142014@mail.utec.edu.sv");
        nombres.add("Mirna");
        claves.add("mir1234");
        niveles.add(2);

        correos.add("2514152018@mail.utec.edu.sv");
        nombres.add("Vanesa");
        claves.add("van1234");
        niveles.add(3);

    }

}
