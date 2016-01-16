import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;



public class JXls 
{
	
	private String fileName;
	private DatiCondivisi dati;
	
	
   public JXls(String fileName, DatiCondivisi d)
   {
	   this.fileName=fileName;
	   this.dati=d;
	   
	   
   }
   
   public void esempio()
   {
	   {
//	      FileInputStream fis = new FileInputStream(
//	      new File("createworkbook.xlsx"));
//	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
//	      XSSFSheet spreadsheet = workbook.getSheetAt(0);
//	      Iterator < Row > rowIterator = spreadsheet.iterator();
//	      while (rowIterator.hasNext()) 
//	      {
//	         row = (XSSFRow) rowIterator.next();
//	         Iterator < Cell > cellIterator = row.cellIterator();
//	         while ( cellIterator.hasNext()) 
//	         {
//	            Cell cell = cellIterator.next();
//	            switch (cell.getCellType()) 
//	            {
//	               case Cell.CELL_TYPE_NUMERIC:
//	               System.out.print( 
//	               cell.getNumericCellValue() + " \t\t " );
//	               break;
//	               case Cell.CELL_TYPE_STRING:
//	               System.out.print(
//	               cell.getStringCellValue() + " \t\t " );
//	               break;
//	            }
//	         }
//	         System.out.println();
//	      }
//	      fis.close();
		   }
   }
   //Non aprire � solo codice commentato che non mi andava di cancellare poich� pu� ritornare utile
   
   //Restituisce il numero di righe ovvero numero di questionari!! Poich� ogni riga corrisponde ad un questionario
 	
   public void readAll()
	{
            estrapolaDati();
	   
            dati.readAll();
	}
   
   
   public void read()//Legge ci� che vi � all' interno del file excel //NON USATO!!
   {
	   
	   try {
		    //getCellNum() getColumnIndex
		    FileInputStream file = new FileInputStream(new File(fileName));
		     
		    //Get the workbook instance for XLS file 
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		 
		    //Get first sheet from the workbook
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    int nRighe=0; 
		    //Iterate through each rows from first sheet
		    Iterator<Row> rowIterator = sheet.iterator();
		    while(rowIterator.hasNext()) {
		        Row row = rowIterator.next();
		        
		        //For each row, iterate through each columns
		        Iterator<Cell> cellIterator = row.cellIterator();
		        if(nRighe>0){//Se la riga in questione non � la prima allora estrai i dati
		        while(cellIterator.hasNext()) {
		             
		            Cell cell = cellIterator.next();
		          
		           // System.out.print(cell.getStringCellValue()+ "\t\t");
		            if(cell.getColumnIndex()==0 ||cell.getColumnIndex()>9)//Se la colonna della cella in questione non � compresa fra la seconda e la nona (dove ci sono dati ininfluenti) allora estrai i dati.
		            {  		            	
			            switch(cell.getCellType()) {
                                        
			                case Cell.CELL_TYPE_BOOLEAN:
			                    System.out.print(cell.getBooleanCellValue() + "\t\t");			                    
			                    break;
			                case Cell.CELL_TYPE_NUMERIC:
			                    System.out.print(cell.getNumericCellValue() + "\t\t");			                                        
			                    break;
			                case Cell.CELL_TYPE_STRING:
			                    System.out.print(cell.getStringCellValue() + "\t\t");			                    
			                    break;
		            }
			        
		        }
		            
		        }
		        System.out.println("");
		        }
		        nRighe++;
		    }
		    file.close();
		    FileOutputStream out = new FileOutputStream(new File(fileName));
		    workbook.write(out);
		    out.close();
		    workbook.close();
		    
		     
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
   }
   
   public void estrapolaDati()
   {
	   
	   try {
		    //getCellNum() getColumnIndex
		    FileInputStream file = new FileInputStream(new File(fileName));
		     
		    //Get the workbook instance for XLS file 
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
		 
		    //Get first sheet from the workbook
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    
		    //Iterate through each rows from first sheet
		    Iterator<Row> rowIterator = sheet.iterator();
		   
		    int caricatoIntestazioni = 0; //Flag per caricare o meno le intestazioni 
		  
		    while(rowIterator.hasNext()) {
		        Row row = rowIterator.next();
		        
		        
		        //For each row, iterate through each columns
		        Iterator<Cell> cellIterator = row.cellIterator();
		        if(caricatoIntestazioni==1)//Se la riga in questione non � la prima allora estrae i dati nel vettore di risposte altrimenti estrae nel vettore con l' intestazione del questionario
			        {
		        	JQuest nuovoQuest= new JQuest();
			        while(cellIterator.hasNext())
				        {
				            Cell cell = cellIterator.next();
				            
					        						     
				           // System.out.print(cell.getStringCellValue()+ "\t\t");
				            if(cell.getColumnIndex()==0 ||cell.getColumnIndex()>7)//Se la colonna della cella in questione non � compresa fra la seconda e la nona (dove ci sono dati ininfluenti) allora estrae i dati.
				            {  	
					            switch(cell.getCellType()) 
					            {//Estrae i dati in base al tipo
                                                        case Cell.CELL_TYPE_BLANK:
                                                              nuovoQuest.RisposteQuestionario.add("null");  
                                                            break;
                                                            
					                case Cell.CELL_TYPE_BOOLEAN:
					                    //System.out.print(cell.getBooleanCellValue() + "\t\t");
					                    Boolean b=cell.getBooleanCellValue();			                    
					                   nuovoQuest.RisposteQuestionario.add(b.toString());
                                                           if(b.equals(""))
                                                           {
                                                               int i=0;}
					                    break;
					                case Cell.CELL_TYPE_NUMERIC:
					                    //System.out.print(cell.getNumericCellValue() + "\t\t");
					                    double n=cell.getNumericCellValue();
					                    String s=String.valueOf(n);
					                    nuovoQuest.RisposteQuestionario.add(s);		                    
					                    break;
					                case Cell.CELL_TYPE_STRING:
					                    //System.out.print(cell.getStringCellValue() + "\t\t");
					                	nuovoQuest.RisposteQuestionario.add(cell.getStringCellValue());
					                    break;
					                
					            }	
					            
					            
				            }				            
				        }	
			        dati.ListaQuestionari.add(nuovoQuest);
			        }
		        else //Riempio la lista intestazioni
		        {
		        	while(cellIterator.hasNext()) {
			             
			            Cell cell = cellIterator.next();
			          
			           // System.out.print(cell.getStringCellValue()+ "\t\t");
			            if(cell.getColumnIndex()==0 ||cell.getColumnIndex()>7)//Se la colonna della cella in questione non � compresa fra la seconda e la nona (dove ci sono dati ininfluenti) allora estrae i dati.
			            {  		            	
				            switch(cell.getCellType()) 
				            {//Estrae i dati in base al tipo
				                case Cell.CELL_TYPE_BOOLEAN:
				                    //System.out.print(cell.getBooleanCellValue() + "\t\t");
				                    Boolean b=cell.getBooleanCellValue();			                    
				                    dati.ListaIntestazioni.add(b.toString());
				                    break;
				                case Cell.CELL_TYPE_NUMERIC:
				                    //System.out.print(cell.getNumericCellValue() + "\t\t");
				                    double n=cell.getNumericCellValue();
				                    String s=String.valueOf(n);
				                    dati.ListaIntestazioni.add(s);			                    
				                    break;
				                case Cell.CELL_TYPE_STRING:
				                    //System.out.print(cell.getStringCellValue() + "\t\t");
				                	 dati.ListaIntestazioni.add(cell.getStringCellValue());
				                    break;
				                
				            }	
				            
			            }
			            
			            
			            caricatoIntestazioni= 1;  
			        }		      
		        }
		       
		    }
		    
		    file.close();
		    FileOutputStream out = new FileOutputStream(new File(fileName));
		    workbook.write(out);
		    out.close();
		    workbook.close();
		    
		     
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
   }

}