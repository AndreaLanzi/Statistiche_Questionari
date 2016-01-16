

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class importaDomande {

	//public ArrayList<String> ListaQx = new ArrayList<String>();
	public ArrayList<String> ListaDomande = new ArrayList<String>();
	
	public importaDomande(String nomeFile) //serve per la gui per il menu a tendina
	{
		
		try {
			BufferedReader input = new BufferedReader(new FileReader(nomeFile));
			StringBuffer buffer = new StringBuffer();
			String text;
			while ((text = input.readLine()) != null)
			{
                            
                            //SERVE PER SPLITTARE ID - DOMANDA
				/*String numDomanda = text.substring(0,3); //prendo l'id della domanda ex: Q01
				ListaQx.add(numDomanda);
				String domanda = text.substring(4);//prendo la domanda
				ListaDomande.add(domanda);
                                        */
                            ListaDomande.add(text);
			}
			input.close();

			System.out.println(buffer.toString());
		} catch (IOException ioException) {
		}
		
		
		
	}
}
