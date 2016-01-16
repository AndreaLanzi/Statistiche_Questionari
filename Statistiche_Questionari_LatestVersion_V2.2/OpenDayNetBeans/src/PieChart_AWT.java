import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
 
public class PieChart_AWT extends ApplicationFrame 
{
    static int i=0;
    static String titolo;
   public PieChart_AWT( String title ) 
   {
      super( title ); 
      setContentPane(createDemoPanel( ));
      
   }
   private static PieDataset createDataset( ) 
   {
       int n=0;
      DefaultPieDataset dataset = new DefaultPieDataset( );
      n++;
      
      while(i<SharedFrames.ContaOpzioni.v[0])
      {
          String s = "Opzione "+ (i+1);
          titolo= "Domanda" + (n+1);
        dataset.setValue( s, new Double( SharedFrames.Percentuali.contatorePercentuali[i] ) ); 
        i++;
      }
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset )
   {
      JFreeChart chart = ChartFactory.createPieChart(      
         titolo,  // chart title 
         dataset,        // data    
         true,           // include legend   
         true, 
         false);

      return chart;
   }
   
   public static JPanel createDemoPanel( )
   {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }
   
   /*
   public static void main( String[ ] args )
   {
      PieChart_AWT demo = new PieChart_AWT( "Mobile Sales" );  
      demo.setSize( 560 , 367 );    
      RefineryUtilities.centerFrameOnScreen( demo );    
      demo.setVisible( true ); 
   }*/
}