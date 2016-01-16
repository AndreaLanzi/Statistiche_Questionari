/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Andrea
 */
public class OpenDayNetBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SharedFrames condiviso = new SharedFrames();
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main().setVisible(true);
            }
        });
       
        
       /*
        try{
			
		//LISTA JQUEST e LISTA INTESTAZIONE DB (2 liste parallele) - Morisco
		DatiCondivisi dati = new DatiCondivisi();
		
		//IMPORTA DB DA EXCEL - Morisco
		JXls x= new JXls("QuestionarioDB.xlsx",dati);	
		x.estrapolaDati();//Con questa riga di comando vengono inseriti i questionari correttamente nei dati condivisi.
		
                //IMPORTO LE DOMANDE Q01-domanda1 \n Q02-domanda2 ..ecc..
		//importaDomande importaDom = new importaDomande("domandeQuestionario.txt");
                
                
		//FILTRO IN BASE AL NOME, dico un nome e ricevo tutte le sue risposte.
                //filtroPerNome filtroNome = new filtroPerNome(dati, "utente2");
		//filtroNome.printQuestionarioFiltrato();
                //filtroNome.getQuestionario();  //restituisce un'oggetto di tipo JQuest serve per l'altro filtro
                
                
                
                //FILTRO IN BASE AL NOME E ALLA DOMANDA (funziona ma mori deve sistemare l'importazione delle celle vuote)
                //filtroPerNomeEDomanda filtroNeD = new filtroPerNomeEDomanda(dati, "Q14", "utente2");
                //filtroNeD.printQuestionarioFiltrato();
                
                
                //STAMPO TUTTI I QUESTIONARI (con in cima le opzioni delle risposte) - Morisco
		//dati.readAll();//Stampa i questionari importati nei dati condivisi
		
                //DICE QUANTE OPZIONI DI RISPOSTA CI SONO PER OGNI DOMANDA - Pellizzer
		//ContaOpzioni contatore = new ContaOpzioni(d);
		//contatore.contatore(); 
                
		
//x.readAll();//Queto metodo estrapola i dati, li inserisce in dati condivisi poi li stampa, è un impacchettamento di tutte le operazioni	

		
		
		}
		catch(Exception E)
		{
			System.out.println("Errore");
		}
        */
        
    }
    
}
