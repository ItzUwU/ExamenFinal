import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String scUsuario = new String();
        String scContrasena = new String();


        for (int i = 1; i <= 3; i++) {
            
            System.out.println("intentos: " + (4-i));
            System.out.print("ingrese su contrasena: ");
            scContrasena = teclado.next();
            if (scContrasena.equals("hola")){
                System.out.println("clave correcta");
                break;
                }
            if (i == 3){
                System.out.println("Lo sentimos tu usuario o clave son incorrectas");
                System.exit(0);
            }
        }
        System.out.println("asd");
    }
}
