/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class SharedFrames {
    
    //FINESTRE:
    public static main main;
    public static menu menu;
    public static visualizzaTutto visualizzaTutto;
    public static  FiltraNome FiltraNome;
    public static FiltraNome_Domanda filtraNomeDomanda;
    public static PieChart_AWT PieChart_AWT;
    
    //Dati:
    public static  DatiCondivisi dati;
    public static JXls x;
    public static importaDomande domande;
    public static ContaOpzioni ContaOpzioni;
    public static Percentuali Percentuali;
    
    public SharedFrames() {
        dati = new DatiCondivisi();
        
        menu = new menu();
        visualizzaTutto= new visualizzaTutto();
        FiltraNome = new FiltraNome();
        filtraNomeDomanda= new FiltraNome_Domanda();
          
        domande = new importaDomande("domandeQuestionario.txt");
    }
    
    
    
}

