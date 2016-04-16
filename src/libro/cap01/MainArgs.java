package libro.cap01;

public class MainArgs {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("Total: " + args.length + " argumentos");
    }
}
