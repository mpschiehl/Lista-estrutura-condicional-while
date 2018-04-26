import javax.swing.JOptionPane;

public class ExercicioEstruturaWhile2{
    public static void main(String[] args){
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Idade", "Exercicio Estrutura While2",JOptionPane.PLAIN_MESSAGE));
    while(idade <129){
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Idade", "Exercicio Estrutura While2",JOptionPane.PLAIN_MESSAGE));
    }
    }
}