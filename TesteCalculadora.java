import javax.swing.JOptionPane;

public class TesteCalculadora extends Calculadora { 
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica("Mondial");

        int op = Integer.parseInt
        (JOptionPane.showInputDialog
        ("1-Soma(2 numeros)\n2- Soma(3 numeros)\n3-Subtração(2 numeros)\n4-Multiplicação\n5-Divisão"));

        double operando1 = Integer.parseInt
        (JOptionPane.showInputDialog("Qual é o primeiro operando?"));

        double operando2 = Integer.parseInt
        (JOptionPane.showInputDialog("Qual é o segundo operando?"));

        double operando3 = Integer.parseInt
        (JOptionPane.showInputDialog("Qual é o terceiro operando?"));

        double resultado;

        if(op == 1){
            resultado = calc.soma (operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado dessa soma é:" + resultado);
        }
        else if (op == 2) {
            resultado = calc.soma (operando1, operando2, operando3);
            JOptionPane.showMessageDialog(null, "O resultado dessa soma é:" + resultado);
        }

        else if (op == 3){
            resultado = calc.subtracao (operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado dessa subtração é:" + resultado);
        }
        else if (op == 4){
            resultado = calc.multiplicao (operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado dessa multiplicação é:" + resultado);
        }
        else if (op == 5){
            resultado = calc.divisao(operando1, operando2);
            JOptionPane.showMessageDialog(null, "O resultado dessa divisão é:" + resultado);
        }
        else {
            JOptionPane.showMessageDialog(null, "Opção invalida");
        }


    }
    
}
