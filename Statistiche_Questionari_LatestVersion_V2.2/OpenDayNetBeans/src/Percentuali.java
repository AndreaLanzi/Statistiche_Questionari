import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Percentuali {
	private DatiCondivisi dati;
	//List<Integer> contatoreDomande = new ArrayList<Integer>();
       public  int []contatorePercentuali= new int [48];
	public Percentuali(DatiCondivisi d)
	{
		dati=d;
	}
        
        public void contaRiposte()
        {
            int cont;
            int x;
            for(int j=0;j<dati.ListaQuestionari.size();j++)
            {
                x=0;
                for(int i=2;i<dati.ListaQuestionari.get(j).RisposteQuestionario.size();i++)
                {     
                    
                     if(dati.ListaQuestionari.get(j).RisposteQuestionario.get(i).equals("1.0"))
                     {
                     contatorePercentuali[x]+=1;
                     }
                     x++;
                     
                }
            }
            
            for(int i=0;i<48;i++)
           {
                System.out.print(contatorePercentuali[i]+"\t");
           }
        }
        
        public int getVal(int i)
        {
            return contatorePercentuali[i];
        }
        
        
	
}
