package edu.ujcv.progra1;




public class Clase {
    //miembros
    private ArrayList<Alumnos> alumnosClase;
    private Alumnos alumno;
    private Boolean nota;

    //Constructores
    public Clase(){}

    public Clase(ArrayList<Alumnos> alumnosClase, int indice){
        this.alumnosClase = alumnosClase;
    }

    public Clase(Alumnos alumno, Boolean nota)
    {
        this.alumno = alumno;
        this.nota = nota;
    }

    // sets y gets
    public ArrayList<Alumnos> getAlumnosClase(){
        return alumnosClase;
    }

    public void setAlumnosClase(ArrayList<Alumnos> alumnosClase) {
        this.alumnosClase = alumnosClase;
    }

    public Alumnos getAlumno()
    {
        return alumno;
    }
    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }
    public Boolean getNota() {
        return nota;
    }
    public void setNota(Boolean nota) {
        this.nota = nota;
    }

    public void agregar(Alumnos a)
    {
        this.alumnosClase.add(a);

    }
    public Alumnos mostrarAlumno(int indice){
        return this.alumnosClase.get(indice);
    }
}


