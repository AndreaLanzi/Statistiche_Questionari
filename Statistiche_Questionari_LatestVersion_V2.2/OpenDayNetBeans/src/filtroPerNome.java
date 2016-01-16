import java.util.ArrayList;

public class filtroPerNome {
	
	JQuest questionarioFiltratoPerNome;
	
	public filtroPerNome(DatiCondivisi dati, String nome)
	{
		for(int i=0; i<dati.ListaQuestionari.size(); i++)
                {
                    JQuest questionarioTemp = dati.ListaQuestionari.get(i);
                    if(questionarioTemp.RisposteQuestionario.get(1).equals(nome))
                    {
                        questionarioFiltratoPerNome = dati.ListaQuestionari.get(i);
                        break;
                    }
		
                }
		
		
	}
        
        public String getStringQuestionario(){
            String quest="";
            for(int i=0;i<questionarioFiltratoPerNome.RisposteQuestionario.size();i++)				
				quest+=questionarioFiltratoPerNome.RisposteQuestionario.get(i)+"\t";
            
            
            return quest;
            
        }
	
	public void printQuestionarioFiltrato()
	{
		 for(int i=0;i<questionarioFiltratoPerNome.RisposteQuestionario.size();i++)				
				System.out.print(questionarioFiltratoPerNome.RisposteQuestionario.get(i)+"\t");
		   
	}
        public JQuest getQuestionario()
        {
            return questionarioFiltratoPerNome;           
        }
}
