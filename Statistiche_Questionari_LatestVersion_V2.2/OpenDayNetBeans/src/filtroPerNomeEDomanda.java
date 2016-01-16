import java.util.ArrayList;

public class filtroPerNomeEDomanda {
	
	String domanda; //id domanda (ex Q01)
	DatiCondivisi dati;
        filtroPerNome filtroNome;
        JQuest questionarioFiltratoPerNome; //Quest temporaneo filtrato per nome
        
        ArrayList<String> ListaRisposteSingolaDomanda = new ArrayList<String>();
	
	public filtroPerNomeEDomanda(DatiCondivisi dati, String domanda, String nome)//ricevo solo l'ID della domanda!!
	{
		this.domanda=domanda;
		this.dati= dati;
                filtroNome = new filtroPerNome(dati, nome);
                questionarioFiltratoPerNome = filtroNome.getQuestionario();
                
                //devo scorrere la dati.intestazioni. quando incrocio l'ID domanda, allora prendo il JQuest locale in pos [x]
                for(int i=0; i<dati.ListaIntestazioni.size(); i++) //salto le prime due colonne perché so che non sono domande
                {
                    String dom = dati.ListaIntestazioni.get(i);
                    String IDdom = dom.substring(0, 3);
                    if(domanda.equals(IDdom))
                        ListaRisposteSingolaDomanda.add(questionarioFiltratoPerNome.RisposteQuestionario.get(i));
                }
                
	}
	
	public String getStringQuestionarioFiltrato()
	{
            String RispQuest="";
		 for(int i=0;i<ListaRisposteSingolaDomanda.size();i++)	
		 {
                     RispQuest+=ListaRisposteSingolaDomanda.get(i)+"\t";
		 }
                
            return RispQuest;
	}
}
