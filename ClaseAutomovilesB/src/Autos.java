public class Autos {
    private int numRuedas;
    private String placa;
    private String serialMotor;
    private int numPuertas;

    public Autos(int numRuedas, String placa, String serialMotor, int numPuertas) {
        this.numRuedas = numRuedas;
        this.placa = placa;
        this.serialMotor = serialMotor;
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSerialMotor() {
        return serialMotor;
    }

    public void setSerialMotor(String serialMotor) {
        this.serialMotor = serialMotor;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public void quienSoy(){
        System.out.println("Soy un Auto");
    }
    
}
