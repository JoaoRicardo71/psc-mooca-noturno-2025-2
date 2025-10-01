import javax.swing.JOptionPane;

public class CalculadoraCientifica extends Calculadora {
    
    public CalculadoraCientifica (String modelo){
        JOptionPane.showMessageDialog(null, "Calculadora Cientifica.");
    }


    public void mensagem () {
        JOptionPane.showMessageDialog(null, "O modelo dessa calculadora é " + modelo);
    }

    public void subtracao (){

    }
    @Override
    public double subtracao (double a, double b){
        double resultado = a - b;
        return resultado;
    }

}
