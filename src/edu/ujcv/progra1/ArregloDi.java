package edu.ujcv.progra1;

public class ArregloDi {
    private int size;
    private ArregloDi[] ListaDeAl = new ArregloDi[21];
    private ArregloDi[] BaseDeDatos;
    private ArregloDi[] AlumosExpulsados;
    boolean claseA = false;boolean claseB = false;boolean claseC = false;boolean claseD = false;boolean claseE = false;boolean claseF = false;boolean claseG = false;

    int contA=0; int contB=0; int contC=0;int contD=0;int contE=0;int contF=0;int contG=0;

    private String nombre;
    private int numeroDecuenta;private Random rd;List<String> Nombres;List<String> Apeliidos;


    public ArregloDi[] GenerarAlumos(){
        List<String> Nombres = new ArrayList<String>();
        List<String> Apeliidos = new ArrayList<String>();
        Random rd = new Random();


        Nombres.add("angel");
        Nombres.add("Pedro");
        Nombres.add("Pedro")
        ;Nombres.add("Susan");
        Nombres.add("Ariel");
        Nombres.add("Marie")
        ;Nombres.add("Ariel");
        Nombres.add("Gabriel");
        Nombres.add("Ana");
        Nombres.add("Miguel");
        Nombres.add("Andre");
        Nombres.add("Carlos");
        Nombres.add("Andrea");
        çNombres.add("Eliza");
        Nombres.add("Jorge");
        Nombres.add("Benito");
        Nombres.add("Ramon");
        Nombres.add("Esteban");
        Nombres.add("Andres");
        Nombres.add("Alejandro");
        Apeliidos.add("Linsey");
        Apeliidos.add("Enamorado");
        Apeliidos.add(" Dias");
        Apeliidos.add(" Valeriano");
        Apeliidos.add(" Pelgrim");
        Apeliidos.add(" Turcios");
        Apeliidos.add(" Valldares");
        Apeliidos.add(" Guifarro");
        Apeliidos.add(" Barrera");
        Apeliidos.add(" Martiz");
        Apeliidos.add(" Padilla");
        Apeliidos.add(" Casco");
        Apeliidos.add(" Cantor");
        Apeliidos.add(" Ulloa");ç
    Apeliidos.add(" Romero");
        Apeliidos.add(" Juarez");
        Apeliidos.add(" Castillo");
        Apeliidos.add(" Baquedano");
        Apeliidos.add(" Betancure");
        Apeliidos.add(" Manzanares");
        int cont = 1;
        int ano = 2019;
        int Z = rd.nextInt(20);
        for (int i = 0; i < Z; i++) {
            Z = rd.nextInt(20);
            String nom = Nombres.get(Z)+""+Apeliidos.get(Z);
            ListaDeAl[i] = new ArregloDi(nom,cont);
        }
        for (int i = 0; i < ListaDeAl.length ; i++) {
            BaseDeDatos[i] = ListaDeAl[i];
        }
        return ListaDeAl;
    }
    public ArregloDi removeFirst(){
        ArregloDi temp = ListaDeAl[0];

        for (int i = 1; i < size ; i++) {
            ListaDeAl[i-1] = ListaDeAl[i];
        }
        size--;
        return temp;
    }


    //Contructores
    public ArregloDi(String nombre,int numerDecuenta){
        this.nombre = nombre;
        this.numeroDecuenta = numerDecuenta;
        this.claseA = false;this.claseB = false;this.claseC = false;this.claseD = false;this.claseE = false;this.claseF = false;this.claseG = false;
        this.contA = contA;this.contB = contB;this.contC = contC;this.contD = contD;this.contE = contE;this.contF = contF;this.contG = contG;
    }
    public ArregloDi(){}

    public ArregloDi(int size){
        ListaDeAl = new ListaDeAl[size];
        this.size = 0;
    }


    //Setter
    public void setClaseA(boolean claseA) {
        this.claseA = claseA;
    }
    public void setContA(int contA) {
        this.contA = contA;
    }
    //Getter
    public ArregloDi getListaDeAl(int x) {
        return ListaDeAl[x];
    }

    public int tamanoList() {
        return ListaDeAl.length;
    }

    public ArregloDi getBaseDeDatosInt(int x) {
        return BaseDeDatos[x];
    }
    public ArregloDi[] getBaseDeDatos() {
        return BaseDeDatos;
    }
    public void setClaseB(boolean claseB) {
        this.claseB = claseB;
    }
    public void setContB(int contB) {
        this.contB = contB;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
}
