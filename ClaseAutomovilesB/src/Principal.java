
public class Principal {
    public static void main(String[] args) {
        Carro c1= new Carro (true, true, "cuero", "Siena","Fiat", "Sedan","1.6 valvulas" ,4 ,"LVJ-745", "AJ1415VB", 5);
        System.out.println("Mi Carro " + "\n" +
                c1.getNombreMarca() + "\n" +
                c1.getNombreCarro() + "\n" +
                c1.getTipo()+ "\n" +
                c1.getMotor()+ "\n" +
                c1.getTipoAsiento()+ "\n" +
                c1.isAireAcond()+ "\n" +
                c1.isVidriosElect());
        System.out.println("Auto");
        Autos a1 = new Autos (4,"ASD-514","Alp",5);
        a1.quienSoy();
        System.out.println("Marca");
        Marca m1 = new Marca ("Ford", "Sedan", "1.6V", 4, "LGN-254", "LGN15445A", 5);
        m1.quienSoy();
        System.out.println("Carro");
        Carro c2 = new Carro(true, true, "Cuero", "Ford", "Fiesta", "Sedan", "1.8V", 4, "LAW-00J", "LAW2455A", 5);
        c2.quienSoy();
    }
}
