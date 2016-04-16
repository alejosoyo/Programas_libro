package libro.cap02.fechas;

public class TestFecha {

    public static void main(String[] args) {
        Fecha f = new Fecha();
        String vec[];
        f.setDia(2); // la variable dia es privada, no tenemos acceso
        f.setMes(10); // idem...
        f.setAnio(1970); // olvidalo...
    }
}
