package lab8progra2_carlosnoe;

import java.util.ArrayList;

public class Pais {
    public String Nombre;
    public ArrayList<Nadadores> Swimer;
    public int MedallasObtenidas;

    public Pais(String Nombre, ArrayList<Nadadores> Swimer, int MedallasObtenidas) {
        this.Nombre = Nombre;
        this.Swimer = Swimer;
        this.MedallasObtenidas = MedallasObtenidas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Nadadores getSwimer(int numero, ArrayList<Nadadores>Swimer) {
        Nadadores Swomer=Swimer.get(numero);
        return Swomer;
    }

    public void setSwimer(ArrayList<Nadadores> Swimer) {
        this.Swimer = Swimer;
    }

    public int getMedallasObtenidas() {
        return MedallasObtenidas;
    }

    public void setMedallasObtenidas(int MedallasObtenidas) {
        this.MedallasObtenidas = MedallasObtenidas;
    }

    @Override
    public String toString() {
        return "Pais{" + "Nombre=" + Nombre + ", Swimer=" + Swimer + ", MedallasObtenidas=" + MedallasObtenidas + '}';
    }
    
    
}
