package calculadora;
public class calculator {
    //Atributos
    private int operando1;
    private int operando2;
    private String signo;
    public double resultado;
    private int resultadoC;
    private int numero;
    //Constructores
    public calculator(){
}
    public calculator (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    //Metodos
    public int sumar(){
        int suma = this.operando1 + this.operando2;
        return suma;
    }
    public int restar(){
        int resta = this.operando1 - this.operando2;
        return resta;
    }
    public int multiplicar (){
        int multiplicacion = this.operando1 * this.operando2;
        return multiplicacion;
    }
    public double dividir (){
        double division = (double) this.operando1 / (double)this.operando2;
        return division;
    }
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
    
    public void resultado(){
        resultadoC = (int)resultado;
        if(resultado % resultado == 0){
            System.out.println("resultado = " + resultadoC);
        } else{
            System.out.println("resultado = " + resultado);
        } 
    }
}     
    