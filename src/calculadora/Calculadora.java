package calculadora;
/**
 * 
 * @author Luis Roman Perez Martinez
 * @since 16 de Mayo 2021
 * @version 1.0.2
 */
public class Calculadora {
    /**
     * @param args es mi metodo main
     */
    public static void main(String[] args) {
        /**
     * 
     * Mostrar resultado
     */
       calculator micalculadora = new calculator (21,76);
       int suma = micalculadora.sumar();
       System.out.println("La suma es: " + suma);
       System.out.println("La resta es: " + micalculadora.restar());
       System.out.println("La multiplicacion es: " + micalculadora.multiplicar());
       System.out.println("La division es: " + micalculadora.dividir());
    }
    
}
