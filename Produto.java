
public class Produto {
       public static void main(String main[]) {
    	  valor Produto = new valor();
    	  Produto.setLápis(1);
    	  Produto.getPreço();
    	  Produto.getcaderno();
    	  
    	  /* o codigo abaixo coloca mensagem informando o produto
    	   * 
    	   */
    	 
    	 System.out.println("o valor do lápis é " +" " +Produto.getPreço());
    	 System.out.println("Temos também Caderno da marca: " +"" + Produto.getcaderno());
       }
}
