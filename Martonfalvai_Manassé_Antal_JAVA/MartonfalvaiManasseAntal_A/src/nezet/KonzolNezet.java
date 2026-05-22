package nezet;

import modell.Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vizsga230
 */
public class KonzolNezet {

    Model model;
    
    public KonzolNezet() {
        this.model = new Model();
        printer(model);
    }
    
    
    
    public void printer(Model model){
        //System.out.println(model);
        System.out.println("Az r betűk száma: " + model.rBetukszama());
        System.out.println("Leggyakoribb betű: " +  model.leggyakoribbBetu());
        System.out.println("Eredeti szöveg: " + model.getSzoveg());
        System.out.println("o  cseréje x-re: " + model.betutcserel('o', 'x'));
        
        System.out.println("betűk: k:1, h:1, o:3, r:2, z:1, u:1, g:1" );
        System.out.println("Eltolás -1 -> " + model.eltoltSzoveg() );
        
    }
    
}
