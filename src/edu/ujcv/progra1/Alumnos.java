package edu.ujcv.progra1;

import java.util.Random;

public class Alumnos {
    public static String[] nombres = {"Carlos", "Fernando", "Gustavo", "Adolfo", "Javier", "Delmer", "Juan", "Antonio","erick","alberto","adrian","alberto","julian","Maria","Fernanda","Ana","Lisa","Juana","Araceli"

    };

    public static String [] apellidos ={"Carias", "Reyes","Funez","Valladares","Juares","Almendares","Hernandez","Lagos","Amador","fuentes","Aguilar","Villatoro","Perez","Galeas","lozano","Ayala"};


public static String AlumnosAleatorios() {
    Random X = new Random();
    int list1 = X.nextInt(nombres.length);
    int list2 = X.nextInt(apellidos.length);

    return nombres[list1] + " " + apellidos[list2] +"";

    public static int año()
    {
        int x = (int) Math.floor(Math.random()*(2015-2020+1)+2020);

        return x;
    }

    public static int middle()
    {
        int y = (int) Math.floor(Math.random()*(100-999+1)+999);

        return y;
    }

    public static int fin()
    {
        int z = (int) Math.floor(Math.random()*(100-999+1)+999);

        return z;
    }

    public static String numeroCuenta()
    {
        return " " + año() + middle() + fin();
    }
}


}
}