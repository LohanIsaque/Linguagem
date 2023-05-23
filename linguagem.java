public class linguagem{
   protected String nome;
   protected String regioesFaladas;
   protected String ordemDasPalavras;
   protected int numFalantes;


public linguagem(String nome, String regioesFaladas, String ordemDasPalavras, int numFalantes){
    this.nome = nome;
    this.regioesFaladas = regioesFaladas;
    this.ordemDasPalavras = ordemDasPalavras;
    this.numFalantes = numFalantes; 
    

}

public void getInfo(){
    System.out.println( nome + " é o idioma falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas + "." );
}

   public static void main(String[] args) {
    linguagem espanhol = new linguagem("Espanhol", " Espanha ", "verbo-objeto-sujeito", 538000000 );
    espanhol.getInfo();
    Mayan iucateco = new Mayan("iucateco", " América Central ", " verbo-objeto-sujeito ", 800000);
    iucateco.getInfo();
    SinoTibetan tibetano = new SinoTibetan( "Tibetano" , 1500000000);
    tibetano.getInfo();
      
   }

}