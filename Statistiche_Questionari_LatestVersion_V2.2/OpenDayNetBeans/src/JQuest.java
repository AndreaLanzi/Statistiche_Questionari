import java.util.ArrayList;

public class JQuest 
{

	 ArrayList<String> RisposteQuestionario = new ArrayList<String>();// = new String[50];//vettore che contiene la riga delle risposte
	
	
	
	public JQuest() 
	{
	  
	}
	
	public void print()//Stampa le risposte del questionario
	{
		for(int i=0; i<RisposteQuestionario.size(); i++)//
	    {
	        System.out.print(RisposteQuestionario.get(i)+"\t");
	    }
		System.out.println();
	}
        
        public String getString()
        {
            String all = "";
            for(int i=0; i<RisposteQuestionario.size(); i++)//
	    {
	        all+=RisposteQuestionario.get(i)+"\t";
	    }
            
            return all;
        }
	   

}
