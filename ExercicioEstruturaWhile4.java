import javax.swing.JOptionPane;

public class  ExercicioEstruturaWhile4{
    public static void main(String[] args){
        int quantidadeDeCarros = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de Carros que deseja Cadastrar","Exercicio05",JOptionPane.PLAIN_MESSAGE)),registro = 0;
        int mediaAno =0 , letraG = 0, letraA=0;
        double mediaValorVeiculo =0;
           
        while(registro !=quantidadeDeCarros){
            registro = registro + 1;
            String modelo =JOptionPane.showInputDialog(null,"Informe O Modelo do veiculo","Exercicio While 4",JOptionPane.PLAIN_MESSAGE);
            modelo = modelo.trim().toLowerCase();
            
            double valorDoCarro = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do Veiculo","Exercicio While 04",JOptionPane.PLAIN_MESSAGE));
            int anoDoCarro = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano do Veiculo", "Exercicio While4",JOptionPane.PLAIN_MESSAGE));
            mediaAno = (2018-anoDoCarro)+ mediaAno;
            mediaValorVeiculo = mediaValorVeiculo +valorDoCarro;
            char letra = modelo.charAt(0);
            if (letra =='g'){
                letraG = letraG +1;
            }else if(letra =='a'){
                letraA = letraA+1;
            }
            
        }
        mediaAno = 2018-(mediaAno/registro);
        mediaValorVeiculo =mediaValorVeiculo/registro;

        JOptionPane.showMessageDialog(null ,"Media do ano dos carros cadastrados " + mediaAno + "\n"+ "Media de valor de veiculos cadastrado e de " + mediaValorVeiculo + "\nNumero de veiculos com a letra \"G\" na primeira letra " + letraG + "\nNumero de veiculos com a letra \"A\" na primeira letra " + letraA  ,"Exercicio While 04",JOptionPane.PLAIN_MESSAGE);
    }
}