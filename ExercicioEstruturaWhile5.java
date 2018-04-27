import javax.swing.JOptionPane;

public class ExercicioEstruturaWhile5{
    public static void main(String[]args){
        double numero1= 0,numero2= 0;    
               
       int respostaDoUsuario = 1;
        while(respostaDoUsuario !=0){
            numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe Um Numero","Exercicio while 5", JOptionPane.QUESTION_MESSAGE));
             numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe Um Numero","Exercicio while 5", JOptionPane.QUESTION_MESSAGE));
       
            respostaDoUsuario =JOptionPane.showOptionDialog(null, "Clique na opção desejada", "Exercicio while 5",0, JOptionPane.PLAIN_MESSAGE, null , new Object[]{
            "Sair","Somar","Subtrair","Multiplicar","Dividir"},"Sair");

            if(respostaDoUsuario ==1){
                double respostaAritmetica = numero1 + numero2;
               JOptionPane.showMessageDialog(null, "A Soma entre " + numero1 +" e "+ numero2 + "e igual a " + respostaAritmetica);
              
            }else if(respostaDoUsuario ==2){
                double respostaAritmetica = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "A subrtração entre " + numero1 +" e "+ numero2 + "e igual a " + respostaAritmetica);
            }else if (respostaDoUsuario==3){
                double respostaAritmetica = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "A multiplicação entre " + numero1 +" e "+ numero2 + "e igual a " + respostaAritmetica);
            }else if(respostaDoUsuario==4){
                double respostaAritmetica = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "A Divição entre " + numero1 +" e "+ numero2 + "e igual a " + respostaAritmetica);
            }


            
             if(respostaDoUsuario==0){
                 respostaDoUsuario = 0;
             }

            }
        }    
           
    }
