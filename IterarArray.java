import java.util.ArrayList;
import java.util.List;
public class IterarArray{

      public static List<String> amigosEmComum(String[] amigosA, String[] amigosB){
      List<String> amigosComum = new ArrayList<>();
      for(String amigoA : amigosA){
         for(String amigoB : amigosB){
            if (amigoA.equals(amigoB)){
               amigosComum.add(amigoA);
            }
         }
      }
      return amigosComum;
    }
   
    public static void main (String[]args){
      String[] amigosDoGabriel = {"Amanda", "Lohan", "Leandro", "Silva"};
      String[] amigosDoRenan = {"Jonas", "Lohan", "Amanda", "Gabriel"};

      List<String> amigosComuns = amigosEmComum (amigosDoGabriel, amigosDoRenan);
      System.out.println("Os amigos em comum são: " + amigosComuns);
   }
}
      

//Iterar um Array é percorrer este array e fazer algo em cada elemento