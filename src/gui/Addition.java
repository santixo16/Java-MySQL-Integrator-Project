/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author Santiago
 */
public class Addition extends javax.swing.JFrame {

    /**
     * Creates new form Adition
     */
    public Addition() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(680,480);
        this.setTitle("ADICIONAR");
    }

    public void showAdditionClientWindow(){
        AdicionarCliente clienteWindow = new AdicionarCliente();
        clienteWindow.setVisible(true);
        this.setVisible(false);
    }
    
    public void showAdditionEmployeeWindow(){
        AdicionarEmpleado empleadoWindow = new AdicionarEmpleado();
        empleadoWindow.setVisible(true);
        this.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        additionEmployee_btn = new javax.swing.JButton();
        additionClient_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 480));
        setPreferredSize(new java.awt.Dimension(680, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        additionEmployee_btn.setText("EMPLEADO");
        additionEmployee_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionEmployee_btnActionPerformed(evt);
            }
        });
        getContentPane().add(additionEmployee_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 111, 49));

        additionClient_btn.setText("CLIENTE");
        additionClient_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionClient_btnActionPerformed(evt);
            }
        });
        getContentPane().add(additionClient_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 111, 49));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("¿QUE DESEA ADICIONAR?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void additionEmployee_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionEmployee_btnActionPerformed
        showAdditionEmployeeWindow();
    }//GEN-LAST:event_additionEmployee_btnActionPerformed

    private void additionClient_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionClient_btnActionPerformed
        showAdditionClientWindow();
    }//GEN-LAST:event_additionClient_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionClient_btn;
    private javax.swing.JButton additionEmployee_btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
