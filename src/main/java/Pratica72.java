
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.ContadorPalavras;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica72 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o caminho:   ");
        String caminho = scanner.next();
        ContadorPalavras c= new ContadorPalavras(caminho);
         HashMap<String, Integer> map1 =c.getPalavras();
         
         Iterator<Map.Entry<String, Integer>> i = map1.entrySet().iterator(); 
while(i.hasNext()){
    String key = i.next().getKey();
    System.out.println(key+", "+map1.get(key));
}
    }
}
