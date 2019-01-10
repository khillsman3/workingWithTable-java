/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indra
 */
public class TableAdd extends javax.swing.JFrame {

    /**
     * Creates new form TableAdd
     */
    public TableAdd() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        toggle = new javax.swing.JToggleButton();
        value = new javax.swing.JLabel();
        addRow = new javax.swing.JButton();
        addColumn = new javax.swing.JButton();
        deleteRow = new javax.swing.JButton();
        deleteColumn = new javax.swing.JButton();
        addValue = new javax.swing.JButton();
        addValue1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Hari", "Ram", "New", "9898"},
                {"2", "ram", "hari", "old", null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.N", "FName", "LName", "Address", "Phone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        toggle.setText("Toggle");
        toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleActionPerformed(evt);
            }
        });

        value.setText("Values");

        addRow.setText("Add Row");
        addRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowActionPerformed(evt);
            }
        });

        addColumn.setText("Add Column");
        addColumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addColumnActionPerformed(evt);
            }
        });

        deleteRow.setText("Delete Row");
        deleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRowActionPerformed(evt);
            }
        });

        deleteColumn.setText("Delete Column");

        addValue.setText("Add vaue from Array");
        addValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addValueActionPerformed(evt);
            }
        });

        addValue1.setText("Add vaue from Array Manual");
        addValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addValue1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toggle)
                                .addGap(18, 18, 18)
                                .addComponent(addRow))
                            .addComponent(value))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addValue1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addColumn)
                                .addGap(31, 31, 31)
                                .addComponent(deleteRow)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addValue, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteColumn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toggle)
                        .addComponent(addRow)
                        .addComponent(addColumn)
                        .addComponent(deleteRow))
                    .addComponent(deleteColumn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(value)
                    .addComponent(addValue)
                    .addComponent(addValue1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleActionPerformed
        // TODO add your handling code here:
        if(toggle.isSelected()){
            toggle.setBackground(Color.CYAN);
            value.setForeground(Color.red);
            value.setText("Your Name is "+jTable1.getValueAt(0,1));
            
        }
        else{
            toggle.setBackground(Color.BLUE);
            value.setForeground(Color.YELLOW);
            value.setText("Toggle Now");
        }
    }//GEN-LAST:event_toggleActionPerformed

    private void addRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_addRowActionPerformed

    private void deleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRowActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try{
            int SelectedRowIndex = jTable1.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
     
        
        
    }//GEN-LAST:event_deleteRowActionPerformed

    private void addColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addColumnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addColumn("Email");
    }//GEN-LAST:event_addColumnActionPerformed

    private void addValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValueActionPerformed
        // TODO add your handling code here:
        String[] val={"1", "Tony", "Blair", "New Road", "985898589"};
        int rowCount = jTable1.getRowCount();
        int columnCount = jTable1.getColumnCount();
        int nextRow = 0;
        boolean emptyRowFlag = false;
        String s;
        
        if(rowCount!=0){
            do {
                s= jTable1.getValueAt(nextRow, 0).toString();
                System.out.println(s);
                if(s!=null && s.length() !=0){
                    nextRow++;
                }
                else{
                    emptyRowFlag = true;
                }
            }
            while(nextRow < rowCount && !emptyRowFlag);
        }
        
        DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
        temp.addRow(new Object[]{});
        for(int i=0; i<columnCount; i++){
            jTable1.setValueAt(val[i], nextRow, i);
        }
        
    }//GEN-LAST:event_addValueActionPerformed

    private void addValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValue1ActionPerformed
        // TODO add your handling code here:
        String[] val={"3", "Tony", "Blair", "New Road", "985898589"};
        DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
        jTable1.setValueAt(val[0],2,0);
        jTable1.setValueAt(val[1],2,1);
        jTable1.setValueAt(val[2],2,2);
        jTable1.setValueAt(val[3],2,3);
        jTable1.setValueAt(val[4],2,4);
    }//GEN-LAST:event_addValue1ActionPerformed

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
            java.util.logging.Logger.getLogger(TableAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addColumn;
    private javax.swing.JButton addRow;
    private javax.swing.JButton addValue;
    private javax.swing.JButton addValue1;
    private javax.swing.JButton deleteColumn;
    private javax.swing.JButton deleteRow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton toggle;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}