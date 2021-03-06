/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Kshitiz
 */
public class DisplayMedicine extends javax.swing.JPanel {

    /**
     * Creates new form DisplayMedicine
     */
    
     DefaultTableModel dtm;
    public DisplayMedicine() {
        initComponents();
      dtm= (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
    // for loading the jdbc driver
        try{
              Class.forName("com.mysql.jdbc.Driver");
              System.out.println("Driver Loaded Successfully");
        }catch(Exception e){
            System.out.println("Driver didn't loaded");
        }
      // for connection with the database
        
        Connection con=null;
        try{
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacymanagement","root","");
             System.out.println("Database successfully connected");
        
        }catch(Exception e){
            System.out.println("Driver is not connected");
      
        }
        
        // for executing sql query and extracting information from the data table
        String sql="SELECT * FROM medicine";
        Statement st;
        try{
           st=con.createStatement();
           
           ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
               dtm.addRow(new Object[]{ rs.getInt("Sn"),rs.getString("Medicine"),rs.getString("Generic"),rs.getString("Company"),rs.getString("Price"),rs.getString("Group1"),rs.getString("weight")});
           
             
           }
               System.out.println("Data Displayed Successfully");                                                                                                                                                         
        }catch (Exception e){
            System.out.println("Data is not Displayed");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sn", "Medicine", "Generic", "Company", "Price(per tab)", "Group", "weight(mg)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.PNG"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/editdoc.png"))); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(37, 37, 37)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(462, 462, 462))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
           int noofselectedrows=jTable1.getSelectedRowCount();
        if(noofselectedrows==1){
             int rowno=jTable1.getSelectedRow();
             Object sid=jTable1.getValueAt(rowno,0);
             
             Statement st=DBConnection1.statementObject();
             String sql="DELETE FROM medicine WHERE Sn="+sid;
            int confirmdelete = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete","Confirm Delete", JOptionPane.YES_NO_CANCEL_OPTION);
       if(confirmdelete ==0){
        try{
                st.executeUpdate(sql);
                dtm.removeRow(rowno); //model lai row number diyera jtable bata delete gareko
        }catch(Exception h){
            System.out.println("Query Not executed");
            System.out.println(h);
        }
       }
            
        }else{
           JOptionPane.showMessageDialog(this,"Please select a row to delete","Alert",JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    int noofselectedrows=jTable1.getSelectedRowCount();
                if(noofselectedrows==1){
                    int rowno=jTable1.getSelectedRow();
                    Object sid=jTable1.getValueAt(rowno, 0);
                     Main_Frame.changePanel(new EditMedicine(sid));
                }else{
                JOptionPane.showMessageDialog(jButton1, "Select Only One Row");
                
                }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
