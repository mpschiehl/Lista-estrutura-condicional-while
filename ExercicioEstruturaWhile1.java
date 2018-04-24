import javax.swing.JOptionPane;

public class ExercicioEstruturaWhile1{
    public static void main(String[] args) {
        String nome = "";

        nome = JOptionPane.showInputDialog(null, "Informe o Nome ou digite \"sair\" para encerrar.", "Exercicio1",JOptionPane.PLAIN_MESSAGE); 

        while(!nome.equalsIgnoreCase("fim")){
            nome = JOptionPane.showInputDialog(null, "Informe o Nome ou digite \"sair\" para encerrar.", "Exercicio1",JOptionPane.PLAIN_MESSAGE);

        }
    }
}