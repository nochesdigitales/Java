public class Marca extends Autos{
    private String nombreMarca;
    private String tipo;
    private String motor;

    public Marca(String nombreMarca, String tipo, String motor, int numRuedas, String placa, String serialMotor, int numPuertas) {
        super(numRuedas, placa, serialMotor, numPuertas);
        this.nombreMarca = nombreMarca;
        this.tipo = tipo;
        this.motor = motor;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    @Override
    public void quienSoy(){
        System.out.println("Soy una Marca");
    }
      
}
