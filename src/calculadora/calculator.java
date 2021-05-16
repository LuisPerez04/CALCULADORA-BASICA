package calculadora;
/**
 * 
 * @author Luis Roman Perez Martinez
 * @since 16 de Mayo 2021
 * @version 1.0.2
 */
public class calculator {
    /**
     * 
     * Declaracion de mis varibalbes y atributos
     */
    private int operando1;
    private int operando2;
    private String signo;
    public double resultado;
    private int resultadoC;
    private int numero;
    
    /**
     * 
     * Mi metodo constructor
     */
    public calculator(){
}
    /**
     * Metodo inicial de la calculadora
     * @param operando1
     * @param operando2 
     * Guarda un valor inicial si el usuario necesita hacer alguna operacion aritmetica
     * 
     */
    public calculator (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    /**
     * Apartado Suma
     * Recorre el metodo para sumar los numeros introducidos en los parametros designados
     * @return 
     */
    public int sumar(){
        int suma = this.operando1 + this.operando2;
        return suma;
    }
    /**
     * Apartado Resta 
     * Recorre el metodo para restar los numeros que se introduzcan en el parametro
     * @return 
     */
    public int restar(){
        int resta = this.operando1 - this.operando2;
        return resta;
    }
    /**
     * Apartado Multiplicacion
     * Recorre el metodo para multiplicar los numeros que se introduzcan en el parametro
     * @return 
     */
    public int multiplicar (){
        int multiplicacion = this.operando1 * this.operando2;
        return multiplicacion;
    }
    /**
     * Apartado Division
     * Recorre el metodo para multiplicar los numeros que se introduzcan en el parametro y si
     * se divide en 0 te menciona numero infinito
     * @return 
     */
    public double dividir (){
        double division = (double) this.operando1 / (double)this.operando2;
        return division;
    }
    /**
     * Apartado de get y set de operandos
     * @return 
     */
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
     /**
     * 
     * Elimina la ultima operacion realizada
     */
    public void eliminar(){
        if(this.signo.equalsIgnoreCase("+")){
            this.resultado -= this.numero;
        } else if(this.signo.equalsIgnoreCase("-")){
            this.resultado += this.numero;
        } else if(this.signo.equalsIgnoreCase("*")){
            this.resultado /= this.numero;
        } else if(this.signo.equalsIgnoreCase("/")){
            this.resultado *= this.numero;
        }
    }
    /**
     * 
     * Mostrar resultado
     */
    public void resultado(){
        resultadoC = (int)resultado;
        if(resultado % resultado == 0){
            System.out.println("resultado = " + resultadoC);
        } else{
            System.out.println("resultado = " + resultado);
        } 
    }
}     
    