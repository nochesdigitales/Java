public class Carro extends Marca{
    private boolean aireAcond;
    private boolean vidriosElect;
    private String tipoAsiento;
    private String nombreCarro;

    public Carro(boolean aireAcond, boolean vidriosElect, String tipoAsiento, String nombreCarro, String nombreMarca, String tipo, String motor, int numRuedas, String placa, String serialMotor, int numPuertas) {
        super(nombreMarca, tipo, motor, numRuedas, placa, serialMotor, numPuertas);
        this.aireAcond = aireAcond;
        this.vidriosElect = vidriosElect;
        this.tipoAsiento = tipoAsiento;
        this.nombreCarro = nombreCarro;
    }

    public boolean isAireAcond() {
        return aireAcond;
    }

    public void setAireAcond(boolean aireAcond) {
        this.aireAcond = aireAcond;
    }

    public boolean isVidriosElect() {
        return vidriosElect;
    }

    public void setVidriosElect(boolean vidriosElect) {
        this.vidriosElect = vidriosElect;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public String getNombreCarro() {
        return nombreCarro;
    }

    public void setNombreCarro(String nombreCarro) {
        this.nombreCarro = nombreCarro;
    }
    @Override
    public void quienSoy(){
        System.out.println("Soy un Carro");
    }
}
