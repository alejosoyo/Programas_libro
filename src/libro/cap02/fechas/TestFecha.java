package libro.cap02.fechas;

public class TestFecha {

    public static void main(String[] args) {
        Fecha f = new Fecha();
        String vec[];
        f.dia = 2; // la variable dia es privada, no tenemos acceso
        f.mes = 10; // idem...
        f.anio = 1970; // olvidalo...
    }
}
