



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldNomeFile = new javax.swing.JTextField();
        buttonNomeFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldNomeFile.setText("QuestionarioDB.xlsx");

        buttonNomeFile.setText("CARICA");
        buttonNomeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNomeFileActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STATISTICHE QUESTIONARIO");

        jLabel1.setText("nome file:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldNomeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonNomeFile)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNomeFile)
                    .addComponent(fieldNomeFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNomeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNomeFileActionPerformed
        // TODO add your handling code here:
        String nomeFile = fieldNomeFile.getText();
        
        
        //IMPORTA DB DA EXCEL - Morisco
        SharedFrames.x = new JXls(nomeFile, SharedFrames.dati);	
       SharedFrames.x.estrapolaDati();//Con questa riga di comando vengono inseriti i questionari correttamente nei dati condivisi.
        SharedFrames.ContaOpzioni = new ContaOpzioni(SharedFrames.dati);
      SharedFrames.ContaOpzioni.contatore();
      SharedFrames.Percentuali = new Percentuali(SharedFrames.dati);
      SharedFrames.Percentuali.contaRiposte();
      
        
       SharedFrames.PieChart_AWT = new PieChart_AWT("Graph");   SharedFrames.PieChart_AWT.setSize( 560 , 367 ); 
        
        
       this.setVisible(false);//"chiudo" questa finestra.
       
       SharedFrames.menu.setVisible(true);
       
       SharedFrames.FiltraNome.abilitaComboBox(); //va sempre chiamato prima del filtro sotto.
       SharedFrames.FiltraNome.setVisible(false);
       
       SharedFrames.visualizzaTutto.setVisible(false);
       SharedFrames.filtraNomeDomanda.setVisible(false);
      
    }                                              

    /**
     * @param args the command line argumentsrallele) - Morisco
       SharedFrames.dati= new DatiCondivisi();

        //IMPORTA DB DA EXCEL - Morisco
        SharedFrames.x= new JXls("QuestionarioDB.xlsx",SharedFrames.dati);	
        SharedFrames.x.estrapolaDati();//Con questa riga di comando vengono inseriti i questionari correttamente nei dati condivisi.
        
    }//GEN-LAST:event_buttonNomeFileActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonNomeFile;
    private javax.swing.JTextField fieldNomeFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
