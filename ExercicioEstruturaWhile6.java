import javax.swing.JOptionPane;

public class ExercicioEstruturaWhile6{
    public static void main(String[] args){
       String pedido = " ";
        int registro = 1,bolos = 0, doces =0,sanduiche = 0, pizzas = 0, registroaux = 0;
        double total = 0;

        while(registro !=0){
            registroaux = registroaux + 1;
        pedido = JOptionPane.showInputDialog(null,
        "Tipo        Nome                                       Valor "
        +"\nBolos   Bolo Brigadeiro                     R$ 29,50"
        +"\nBolos   Bolo Floresta Negra             R$ 2,00"
        +"\nBolo     Leite com Nutella                  R$ 29,23"
        +"\nBolos   Bolo Mouse de Chocolate   R$ 7,10"
        +"\nBolos   Bolo Nega Maluca                 R$ 19,33"
        +"\nDoces    Bomba de Creme                R$ 17,71"
        +"\nDoces    Bomba de Morango            R$ 4,82"
        +"\nSanduíche Filé-Mignon com"
        +"\nfritas e cheddar                                   R$ 21,16"
        +"\nSanduíche Hambúrguer com"
        +"\n queijos,champignon e rúcula          R$ 12,70"
        +"\nSanduíche Provolone e salame       R$ 19,70"
        +"\nSanduíche Vegetariano berinjela    R$ 28,22"
        +"\nPizza Calabresa                                   R$ 8,98"
        +"\nPizzas Napolitana                                R$ 0,42"
        +"\nPizzas Peruana                                    R$ 18,36"
        +"\nPizzas Portuguesa                              R$ 27,50"
        +"\n   Sair"
        +"\nSelecione o Produto", "Padaria do João",JOptionPane.QUESTION_MESSAGE,null, new Object[]
        {"Sair", "Bolo Brigadeiro","Bolo Floresta Negra","Bolo Leite com Nutella","Bolo Mousse de Chocolate","Bolo Nega Maluca","Bomba de Creme","Bomba de Morango","Sanduíche Filé-Mignon fritas e cheddar","Sanduíche Hambúrguer queijos,champignon e rúcula","Sanduíche Provolone e salame","Sanduíche Vegetariano berinjela","Pizza Calabresa","Pizzas Napolitana","Pizzas Peruana","Pizzas Portuguesa"},"Sair" ).toString();
        if(pedido.equals("Sair")){
            registro = 0;
        }else if(pedido.equals("Bolo Brigadeiro")){
            bolos = bolos +1;
            total = total +29.5; 
        }else if(pedido.equals("Bolo Floresta Negra")){
            bolos = bolos +1;
            total = total +2;
        }else if(pedido.equals("Bolo Leite com Nutella")){
            bolos = bolos +1;
            total = total +29.23;
        }else if (pedido.equals("Bolo Mousse de Chocolate")){ 
            bolos = bolos +1;
            total = total +7.10;
        }else if (pedido.equals("Bolo Nega Maluca")){
            bolos = bolos +1;
            total = total +19.33;
        }else if(pedido.equals("Bomba de Creme")){
            doces = doces +1;
            total = total +17.71;
        }else if(pedido.equals("Bomba de Morango")){
            doces = doces +1;
            total = total +4.82;
        }else if(pedido.equals("Sanduíche Filé-Mignon fritas e cheddar")){
            sanduiche = sanduiche + 1;
            total = total + 21.16;
        }else if(pedido.equals("Sanduíche Hambúrguer queijos,champignon e rúcula")){
            sanduiche = sanduiche + 1;
            total = total +12.7;
        }else if(pedido.equals("Sanduíche Provolone e salame")){        sanduiche = sanduiche + 1;
            total = total +19.7;
        }else if (pedido.equals("Sanduíche Vegetariano berinjela")){
            sanduiche = sanduiche + 1;
            total = total + 28.22;
        }else if(pedido.equals("Pizza Calabresa")){
            pizzas = pizzas + 1;
            total = total + 8.98;
        }else if(pedido.equals("Pizzas Napolitana")){
            pizzas = pizzas + 1;
            total = total + 0.42;
        }else if(pedido.equals("Pizzas Peruana")){
            pizzas = pizzas + 1;
            total = total + 18.36;
        }else if (pedido.equals("Pizzas Portuguesa")){
            pizzas = pizzas + 1;
            total = total + 27.5;
        }
        }
        double media = total/registroaux;
        JOptionPane.showMessageDialog(null,"Quantidade de Bolos solicitados " + bolos +"\nQuatidade de Doces escolidos " + doces + "\nQuantidade de Sanduiches " + sandui­che + "\nQuantidade de Pizzas Escolhidas " + pizzas + "\nA Media dos produtos " + media,"Padaria do João",JOptionPane.INFORMATION_MESSAGE);
    }
}