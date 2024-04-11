import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int maior = 0;
        int numero;

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Digite um numero " + (i + 1) + ":");
            numero = Integer.parseInt(input);

            if (numero > maior) {
                maior = numero;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior valor digitado é: " + maior);
    }
}
