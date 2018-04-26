import javax.swing.JOptionPane;

public class ExercicioEstruturaWhile3{
    public static void main(String[] args){
         int totalDePessoa = 0;
        double peso = 1;
        while(peso<300 && peso>0){
            peso =Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o peso ou \"qualquer valor negativo\" para sair","Exercicio 3",JOptionPane.PLAIN_MESSAGE));
            totalDePessoa = totalDePessoa + 1;
        }
        JOptionPane.showMessageDialog(null, "Quantidade de Pesoas que informaram seu peso " + totalDePessoa, "Exercicio 3" ,JOptionPane.PLAIN_MESSAGE);
    }
}