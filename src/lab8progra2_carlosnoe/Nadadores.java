package lab8progra2_carlosnoe;

public class Nadadores {

    public String Nombre;
    public String Nacionalidad;
    public int edad;
    public int DistanciaCompe;
    public int NumeroDeMedallas;
    public double Altura;
    public double MejorTiempo;

    public Nadadores() {
    }

    
    
    public Nadadores(String Nombre, String Nacionalidad, int edad, int DistanciaCompe, int NumeroDeMedallas, double Altura, double MejorTiempo) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.edad = edad;
        this.DistanciaCompe = DistanciaCompe;
        this.NumeroDeMedallas = NumeroDeMedallas;
        this.Altura = Altura;
        this.MejorTiempo = MejorTiempo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDistanciaCompe() {
        return DistanciaCompe;
    }

    public void setDistanciaCompe(int DistanciaCompe) throws Exception {
        if (DistanciaCompe == 100) {
            this.DistanciaCompe = DistanciaCompe;
        } else if (DistanciaCompe == 200) {
            this.DistanciaCompe = DistanciaCompe;
        } else if (DistanciaCompe == 400) {
            this.DistanciaCompe = DistanciaCompe;
        } else if (DistanciaCompe == 800) {
            this.DistanciaCompe = DistanciaCompe;
        } else {
            throw new Exception("No puede Competir Distancia no valida");
        }
    }

    public int getNumeroDeMedallas() {
        return NumeroDeMedallas;
    }

    public void setNumeroDeMedallas(int NumeroDeMedallas) {
        this.NumeroDeMedallas = NumeroDeMedallas;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getMejorTiempo() {
        return MejorTiempo;
    }

    public void setMejorTiempo(double MejorTiempo) {
        this.MejorTiempo = MejorTiempo;
    }

    @Override
    public String toString() {
        return "Nadadores{" + "Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + ", edad=" + edad + ", DistanciaCompe=" + DistanciaCompe + ", NumeroDeMedallas=" + NumeroDeMedallas + ", Altura=" + Altura + ", MejorTiempo=" + MejorTiempo + '}';
    }

}
