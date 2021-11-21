
package centreform;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import static org.apache.xalan.lib.ExsltDatetime.date;
import org.jdom2.JDOMException;

/**
 *
 * @author Rami
 */
public class Formation extends javax.swing.JFrame {

    
    public Formation() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomF = new javax.swing.JTextField();
        dateF = new org.netbeans.modules.form.InvalidComponent();
        dateD = new org.netbeans.modules.form.InvalidComponent();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableF = new javax.swing.JTable();
        btnAjouter = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnSupp = new javax.swing.JButton();
        nbrH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Ref = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ens = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Nom Formation  ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Date Debut      ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Date Fin");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Nombre d'heures");

        nomF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomFActionPerformed(evt);
            }
        });

        tableF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Référance", "Nom Formation", "Date Debut", "Date Fin", "Enseignant", "Nombre D'heures"
            }
        ));
        tableF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableF);

        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnMod.setText("Modifier");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnSupp.setText("Supprimer");
        btnSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppActionPerformed(evt);
            }
        });

        nbrH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrHActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Référence ");

        Ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Enseignant");

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAjouter)
                                .addGap(27, 27, 27)
                                .addComponent(btnMod)
                                .addGap(41, 41, 41)
                                .addComponent(btnSupp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(dateF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nomF, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ref, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ens, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(47, 47, 47)
                                        .addComponent(nbrH, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(Ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nomF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(dateD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(dateF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(Ens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nbrH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnMod)
                    .addComponent(btnSupp)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomFActionPerformed
DefaultTableModel model;
public  void setTable()
{
    model =(DefaultTableModel)tableF.getModel();
}
private void clear(){
    Ref.setText("");
    nomF.setText("");
    dateD.setDate(null);
    dateF.setDate(null);
    nbrH.setText("");
    Ens.setText("");
    Ref.requestFocus();
    
}

    

SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
    int currentRow;
private void setCurrentRow()
{
    currentRow =tableF.getSelectedRow();
}

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
   
        setCurrentRow();
   

      if(Ref.getText().equals("")|| nomF.getText().equals("")|| dateD.getDate() == null || dateF.getDate() == null ||Ens.getText().equals("")|| nbrH.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"IL FAUT REMPLIR TOUS LES CHAMPS");
        }
     else{
          
           String value = model.getValueAt(currentRow , 0).toString();
            
    
   
     
       try {
          
            Xml.Modifier(Ref.getText(),nomF.getText(), d.format(dateD.getDate()), d.format(dateF.getDate()),Ens.getText(), nbrH.getText() , value);
         } catch (IOException ex) {
             System.out.print(ex);
         } catch (JDOMException ex) {
            System.out.print(ex);
         }
    
   Base.Modifier(Ref.getText(),nomF.getText(), d.format(dateD.getDate()), d.format(dateF.getDate()),Ens.getText(), nbrH.getText() ,value);
    
     
     
     model.setValueAt(Ref.getText(), currentRow, 0);
     model.setValueAt(nomF.getText(),currentRow,1);
     model.setValueAt(dateD.getDate(),currentRow,2);
     model.setValueAt(dateF.getDate(),currentRow,3);
     model.setValueAt(Ens.getText(),currentRow,4);
     model.setValueAt(nbrH.getText(),currentRow,5);
    

  
     clear();}
    }//GEN-LAST:event_btnModActionPerformed

    private void btnSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppActionPerformed
        setCurrentRow();    
        setTable();
        
       
        
       String value = model.getValueAt(currentRow , 0).toString();
        
      
       Base.Supprimer(value);
        try {
            Xml.Supprimer(value);
        } catch (IOException ex) {
            Logger.getLogger(Formation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JDOMException ex) {
            Logger.getLogger(Formation.class.getName()).log(Level.SEVERE, null, ex);
        }
       model.removeRow(currentRow);
       
       clear();
    }//GEN-LAST:event_btnSuppActionPerformed

    private void nbrHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbrHActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       btnSupp.setEnabled(false);
       btnMod.setEnabled(false);
        try{
            Image img =ImageIO.read(getClass().getResource("formation.png"));
            this.setIconImage(img);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
               
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         setTable();
  String username = "root";
            String password = "";
            String url = "jdbc:mysql://localhost/centreFormation";
            try{
            Connection con =DriverManager.getConnection(url, username, password);
            Statement st ;
            st=con.createStatement();
            
            String req = "SELECT * FROM formations;";
            ResultSet res = st.executeQuery(req);
           while(res.next()){
                model.addRow(new Object[]{ res.getString(1), res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
             
           }
            
           
            JOptionPane.showMessageDialog(null,"DONE");
            }
            catch(Exception E)
             {
             System.out.println("Erreur");
              }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed

        setTable();
        if(Ref.getText().equals("")|| nomF.getText().equals("")|| dateD.getDate() == null || dateF.getDate() == null ||Ens.getText().equals("")|| nbrH.equals("")){
            JOptionPane.showMessageDialog(null,"IL FAUT REMPLIR TOUS LES CHAMPS");}
        else
        {
            model.addRow(new Object[]{Ref.getText(),nomF.getText(),d.format(dateD.getDate()),d.format(dateF.getDate()),Ens.getText(),nbrH.getText()});
            try {
                Xml.Ajouter(Ref.getText(),nomF.getText(),d.format(dateD.getDate()),d.format(dateF.getDate()),Ens.getText(),nbrH.getText());
            } catch (JDOMException ex) {
                Logger.getLogger(Formation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Formation.class.getName()).log(Level.SEVERE, null, ex);
            }
            Base.Ajouter(Ref.getText(),nomF.getText(), d.format(dateD.getDate()), d.format(dateF.getDate()),Ens.getText(), nbrH.getText());
            clear();

        }

    }//GEN-LAST:event_btnAjouterActionPerformed

    private void tableFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFMouseClicked
        
         try {
             
             setTable();
              setCurrentRow();  
            
            Ref.setText(model.getValueAt(currentRow, 0).toString());
             nomF.setText(model.getValueAt(currentRow, 1).toString());
             java.util.Date date =  new SimpleDateFormat("dd-MM-yyyy").parse((String)model.getValueAt(currentRow, 2));
             java.util.Date date1 =  new SimpleDateFormat("dd-MM-yyyy").parse((String)model.getValueAt(currentRow, 3));
            dateD.setDate(date);
            dateF.setDate(date1);
            Ens.setText(model.getValueAt(currentRow, 4).toString());
             nbrH.setText(model.getValueAt(currentRow, 5).toString());
             btnSupp.setEnabled(true);
             btnMod.setEnabled(true);
            
        } catch (ParseException ex) {
            System.out.print(ex);}
    }//GEN-LAST:event_tableFMouseClicked

    private void RefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ens;
    private javax.swing.JTextField Ref;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnSupp;
    private org.netbeans.modules.form.InvalidComponent dateD;
    private org.netbeans.modules.form.InvalidComponent dateF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nbrH;
    private javax.swing.JTextField nomF;
    private javax.swing.JTable tableF;
    // End of variables declaration//GEN-END:variables
}
