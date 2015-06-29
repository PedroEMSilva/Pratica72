/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import static javax.swing.UIManager.put;

/**
 *
 * @author Cliente
 */
public class ContadorPalavras {

    BufferedReader br;

    public ContadorPalavras(String pathname) throws FileNotFoundException {

        br = new BufferedReader(new FileReader(pathname));
    }
    String linha;
   
    int pos;

    public HashMap<String, Integer> getPalavras() throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        while ((linha = br.readLine()) != null) {
            
            String[] a = linha.replaceAll("\\p{Punct}", "").split("\\s");
            for (String s : a) {
                if (map.containsKey(s)) {
                    map.put(s, (map.get(s) + 1));
                    System.out.println(s+"    adicionei 1");
                } else {
                    map.put(s,1);
                    System.out.println(s+"     novo");
                }

            }
        }
        System.out.println("-#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#--#-");
        return map;
    }
}
