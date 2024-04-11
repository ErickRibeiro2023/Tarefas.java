import javax.swing.JOptionPane;


//**Ler n salários e:**
//**(a) encontrar o maior**
//**(b) aplicar 10% de aumento a quem ganha menos de R$2500,00**
//**(c) mostrar o total da folha de pagamento antiga**
//**(d) mostrar o total da folha corrigida**
//Você pode escolher entre `perguntar ao usuário quantos salários serão digitados`
// ou `ler salários até que seja digitado um salário de zero reais`.


public class tarefa {
    public static void main(String[] args) {
        int salario = 0;
        int maiorSalario = 0;
        int totalSalario = 0;


        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Digite o seu salario: " );
            salario = Integer.parseInt(input);
             totalSalario = totalSalario + salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }


           // if (salario < 2500){

           //     salario += (salario * 10) / 100;

           //}
        }

        JOptionPane.showMessageDialog(null, "O maior salario é: " + maiorSalario);
        JOptionPane.showMessageDialog(null, "O total é: " + totalSalario);
    }
}
