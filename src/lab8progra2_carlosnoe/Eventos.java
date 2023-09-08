package lab8progra2_carlosnoe;

public class Eventos {

    public String EstiloNata;
    public int Distancia;
    public double RecordTiempo;

    public Eventos(String EstiloNata, int Distancia, double RecordTiempo) {
        this.EstiloNata = EstiloNata;
        this.Distancia = Distancia;
        this.RecordTiempo = RecordTiempo;
    }

    public String getEstiloNata() {
        return EstiloNata;
    }

    public void setEstiloNata(String EstiloNata) throws Exception {
        if (EstiloNata.equalsIgnoreCase("Libre")) {
            this.EstiloNata = EstiloNata;
        } else if (EstiloNata.equalsIgnoreCase("Pecho")) {
            this.EstiloNata = EstiloNata;
        } else if (EstiloNata.equalsIgnoreCase("Dorso")) {
            this.EstiloNata = EstiloNata;
        } else if (EstiloNata.equalsIgnoreCase("Mariposa")) {
            this.EstiloNata = EstiloNata;

        } else {
            throw new Exception("No puede Competir Distancia no valida");
        }
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) throws Exception {
        if (Distancia == 100) {
            this.Distancia = Distancia;
        } else if (Distancia == 200) {
            this.Distancia = Distancia;
        } else if (Distancia == 400) {
            this.Distancia = Distancia;
        } else if (Distancia == 800) {
            this.Distancia = Distancia;
        } else {
            throw new Exception("No puede Competir Distancia no valida");
        }

    }

    public double getRecordTiempo() {
        return RecordTiempo;
    }

    public void setRecordTiempo(double RecordTiempo) {
        this.RecordTiempo = RecordTiempo;
    }

    @Override
    public String toString() {
        return "Eventos{" + "EstiloNata=" + EstiloNata + ", Distancia=" + Distancia + ", RecordTiempo=" + RecordTiempo + '}';
    }

}
