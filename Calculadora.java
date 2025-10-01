import javax.swing.JOptionPane;

public class Calculadora {
    String modelo ;
    public Calculadora (){
        JOptionPane.showMessageDialog(null, "Calculadora simples.");
    }

    public double soma(double a, double b){
        double resultado;
        resultado = a + b;
        return resultado;
        
    }


     public double subtracao(double a, double b){
        double resultado;
        resultado = a - b;
        return resultado;
        
    }

    public double multiplicao(double a, double b){
        double resultado;
        resultado = a * b;
        return resultado;
        
    }

    public double divisao(double a, double b){
        double resultado;
        resultado = a / b;
        return resultado;
        
    }
    public double soma(double a, double b, double c){
        double resultado;
        resultado = a + b + c;
        return resultado;
        
    }
    public double subtracao(double a, double b, double c){
        double resultado;
        resultado = a - b - c;
        return resultado;
        
    }



    
}
