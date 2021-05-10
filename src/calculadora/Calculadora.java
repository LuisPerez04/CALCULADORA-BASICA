package calculadora;
public class Calculadora {
    public static void main(String[] args) {
       calculator micalculadora = new calculator (21,76);
       int suma = micalculadora.sumar();
       System.out.println("La suma es: " + suma);
       System.out.println("La resta es: " + micalculadora.restar());
       System.out.println("La multiplicacion es: " + micalculadora.multiplicar());
       System.out.println("La division es: " + micalculadora.dividir());
    }
    
}
