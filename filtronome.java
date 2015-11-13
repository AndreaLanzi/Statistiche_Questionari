/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author mehilli_eni
 */
public class filtronome {
    
    public CQuest filtra(List<CQuest> lista, String nome){
        CQuest d=new CQuest();
        for(int i=0; i<lista.size(); i++){
            if(lista.element[i].getNome().equals(nome))
                d=lista.element[i];
        }
        return d;
    }
    
}
