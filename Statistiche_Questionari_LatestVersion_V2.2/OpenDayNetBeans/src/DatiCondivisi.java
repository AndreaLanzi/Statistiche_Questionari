import java.util.ArrayList;

public class DatiCondivisi {
	
	ArrayList<JQuest> ListaQuestionari = new ArrayList<JQuest>();
	//private int nRighe,lastIntestazioni;
	ArrayList<String> ListaIntestazioni = new ArrayList<String>();//vettore che contiene l' intestazione della prima riga del questionario es: q01 q02 q03 ecc...
	
        
        ArrayList<String> ListaNomi = new ArrayList<String>(); //serve per le combo box nella GUI
	DatiCondivisi()
	{
		
	}
	

	
	   public void readAll()
		{
		   for(int i=0;i<ListaIntestazioni.size();i++)				
				System.out.print(ListaIntestazioni.get(i)+"\t");
		   
		   		System.out.println();
		   		
			for(int i=0;i<ListaQuestionari.size();i++)			
				ListaQuestionari.get(i).print();
			
		}
	   
	   
	   
	   public void addJQuest(JQuest newQuest)
	   {
		   ListaQuestionari.add(newQuest);//Inserisco un questionario nella pos data
	   }
	   
	   
	   public String getStringIntestazione() //Serve per il contaOpzioni di pelliz, restituisce una stringa con dentro tuuuutta la prima riga del DB.
	   {
		   String stringa="";
		   for(int i=0; i<ListaIntestazioni.size(); i++)
		   {
			   stringa+=ListaIntestazioni.get(i);
		   }
		   return stringa;
	   }
           
           public void extractListaNomi(){
               
               for(int i =0; i<ListaQuestionari.size(); i++)
                   ListaNomi.add(ListaQuestionari.get(i).RisposteQuestionario.get(1));
              
           }
	   
           public String getStringAll()
           {
               String all ="";
                    for(int i=0;i<ListaQuestionari.size();i++)	
                    {
                            all+= ListaQuestionari.get(i).getString();
                            all+="\n";
                    }
                        
            return all;
               
           }
}
