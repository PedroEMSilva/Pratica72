
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
        File file = new File(caminho+".out");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
                            
				file.createNewFile();
                               
			}
        BufferedWriter bw = new BufferedWriter(new FileWriter(caminho+".out"));
        ContadorPalavras c= new ContadorPalavras(caminho);
         HashMap<String, Integer> map1 =c.getPalavras();
         List<Integer> list = new ArrayList<Integer>(map1.values());
         Collections.sort(list, new Comparator(){
              @Override
              public int compare(Object o1, Object o2) {    
                 Integer c1 = (Integer) o1;    
                 Integer c2 = (Integer) o2;    
                 return c2-c1;
               }  
         });
         Iterator<Map.Entry<String, Integer>> i = map1.entrySet().iterator(); 
for (Integer a:list){
    String key = ;
    bw.write(key+","+map1.get(key));
    System.out.println("teoricamente escrevendo algo");
    bw.newLine();
    
}
bw.close();
    }
}
