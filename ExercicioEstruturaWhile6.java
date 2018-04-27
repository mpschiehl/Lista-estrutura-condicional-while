import javax.swing.JOptionPane;

public class ExercicioEstruturaWhile6{
    public static void main(String[] args){
       String pedido = " ";
        int registro = 1;

        while(registro !=0){

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
        }else if(pedido.equals("Bolo Floresta Negra")){
        }else if(pedido.equals("Bolo Leite com Nutella")){
        }else if (pedido.equals("Bolo Mousse de Chocolate")){ 
        }else if (pedido.equals("Bolo Nega Maluca")){
        }else if(pedido.equals("Bomba de Creme")){
        }else if(pedido.equals("Bomba de Morango")){
        }else if(pedido.equals("Sanduíche Filé-Mignon fritas e cheddar")){
        }else if(pedido.equals("Sanduíche Hambúrguer queijos,champignon e rúcula")){
        }else if(pedido.equals("Sanduíche Provolone e salame")){        
        }else if (pedido.equals("Sanduíche Vegetariano berinjela")){
        }else if(pedido.equals("Pizza Calabresa")){
        }else if(pedido.equals("Pizzas Napolitana")){
        }else if(pedido.equals("Pizzas Peruana")){
        }else if (pedido.equals("Pizzas Portuguesa")){
        }
        }
    }
}