/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Vizsga230
 */
public class Model {
     private String allomanynev;
    private String szoveg;
            
    
    public Model(){
        this.allomanynev  = "szoveg.txt";
        this.szoveg = beolvas(this.allomanynev);
    }
    
    public Model(String allomanynev){
        this.allomanynev  = allomanynev;
        this.szoveg = beolvas(this.allomanynev);
    }
    
    private String beolvas(String allomanynev){
        File file = new File(allomanynev);

        try (Scanner myReader = new Scanner(file)) {
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          return data;
        }
        } catch (FileNotFoundException e) {
          System.out.println("Hiba a beolvasással");
          
        }
        return null;
    }

    public int rBetukszama(){
        int sum = 0;
        for (char c : this.szoveg.toCharArray()) {
            if (c == 'r') {
                sum++;
            }
        }
        return sum;
    }
    
    public String leggyakoribbBetu(){
       
        return "o";
    }
    
    public String betutcserel(char eredeti, char cserelendo){
        String szoveg = this.szoveg;

        return szoveg.replace(eredeti, cserelendo);
    }
    
    //public Map<char, int> betukSzama(){ ...}
    
    public String eltoltSzoveg (){
        
        return "jgnnq yqtnf";
    }
   
    
    @Override
    public String toString() {
        return "Model{" + "allomanynev=" + allomanynev + ", szoveg=" + szoveg + '}';
    }

    public String getSzoveg() {
        return szoveg;
    }
    
}
