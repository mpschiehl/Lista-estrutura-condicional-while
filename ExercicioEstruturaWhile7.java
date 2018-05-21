import javax.swing.JOptionPane;

public class  ExercicioEstruturaWhile7{
    public static void main(String[] args){
      String nomeMenorPeso= "", nomeMairoAltura = "", nomeMaiorNome = "",menorQuantidadeCartaoAmarelo = "", nomeMenorNome = "", nomeMaiorPeso = "",nomeMaiorQuantidadeVermelho = "", nomeMaiorQuantidadeCartaoAmarevl = "", nomeMenorQuantidadeVermelho = "";
      int quantidadeSexoFemino = 0, quantidadeSexoMasculino = 0, i = 0;

      while (i<1){
          i = i + 1;
        String nome = JOptionPane.showInputDialog(null,"Informe o nome do Atleta" , "Seleção Brasileira de Futebol",JOptionPane.QUESTION_MESSAGE);

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a idade do Atleta","Seleção Brasileira de Futebol",JOptionPane.QUESTION_MESSAGE));

        Double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Infome o peso do Atleta ", "Seleção Brasileira de Futebol", JOptionPane.QUESTION_MESSAGE));

        String sexo = JOptionPane.showInputDialog(null, "Informe o Sexo do atleta","Seleção Brasileira de Futebol",JOptionPane.QUESTION_MESSAGE);

        Double altura =Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do atleta","Seleção Brasileira de Futebol",JOptionPane.QUESTION_MESSAGE));

        int golMarcado =Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de gols marcados pelo atleta","Seleção Brasileira de Futebol",JOptionPane.QUESTION_MESSAGE));

        int cartaoAmarelo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de cartões amarelos recebidos", "Seleção Brasileira de Futebol",JOptionPane.QUESTION_MESSAGE));

        

      }

    }
}  