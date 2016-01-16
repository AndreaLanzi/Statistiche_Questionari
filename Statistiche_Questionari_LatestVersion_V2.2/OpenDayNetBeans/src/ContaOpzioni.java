


import java.io.*;
import java.net.*;
import java.util.ArrayList;


public class ContaOpzioni {
	
	DatiCondivisi dati;
	public static int []v;
	public ContaOpzioni(DatiCondivisi dati)
	{
		this.dati=dati;
	}
	
	
	public void contatore()
	{
      
      String cont = dati.getStringIntestazione();
     
      String nm;
      v= new int [20];
      //ArrayList<int[]> v=new ArrayList<int[]>();
      for(int c=1; c<dati.ListaIntestazioni.size();c++) //abbondo un po' ma almeno sono sicuro che � una cosa dinamica.
      {
	      for(int j=0; j<cont.length()-3;j++)
	      {
	    	  nm=cont.substring(j,j+3);
	    	  if(c<10)
	    	  {
		    	  if(nm.equals("Q0"+c))
		    	  {
		    		  v[c]++;
		    	  }
	    	  }
	    	  if(c>9)
	    	  {
	    		  if(nm.equals("Q"+c))
	        	  {
	    		   v[c]++;
	        	  }
	    	  }
	      }
      
      }
     
      for(int h=1; h<20; h++)
      {
    	 if(h<10)
    	 {
    	  System.out.println("Q0"+h);  
    	  System.out.println(v[h]);  
    	 }
    	 if(h>10)
    	 {
   	      System.out.println("Q"+h);  
   	      System.out.println(v[h]);  
    	 }
      }
     
    
    }//End metodo
	
	
}

	

   
  
    