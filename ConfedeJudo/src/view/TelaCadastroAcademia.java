/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Academia;
import model.dow.AcademiaDAO;

/**
 *
 * @author Luis Guilherme
 */
public class TelaCadastroAcademia extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroAcademia
     */
    public TelaCadastroAcademia() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeAc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomePf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGrad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtende = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome da Academia:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nome do Professor:");

        txtNomePf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePfActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Graduação do Professor:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Idade:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Endereço da Academia:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Sexo:");

        txtSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/accept.png"))); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel7))
                            .addComponent(txtNomeAc, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGrad)
                                    .addComponent(txtNomePf)
                                    .addComponent(txtende, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeAc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomePf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtende, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Academias/Professores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomePfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Academia ac = new Academia();
        AcademiaDAO dao = new AcademiaDAO();
        if (dao.verificaCampoVazio(ac)){
            JOptionPane.showMessageDialog(null, "Cadastrado nao foi possivel!");
            return;
        }else if (ac.getNomeAcademia().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome da academia!");
            return;
        }else if (ac.getNomeAcademia().equals("@#$%&")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome da academia");
            return;
        }else if (ac.getNomeAcademia().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome da academia");
            return;
        }
        ac.setNomeAcademia(txtNomeAc.getText());
        
        if (ac.getNomeProf().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome Professor!");
            return;
        }else if (ac.getNomeProf().equals("@#$%&")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome Professor!");
            return;
        }else  if (ac.getNomeProf().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome Professor!");
            return;
        }
        ac.setNomeProf(txtNomePf.getText());
        if (ac.getGraduacaoProf().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome graduação!");
            return;
        }else  if (ac.getGraduacaoProf().equals("@#$%&")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome graduação");
            return;
        }else if (ac.getGraduacaoProf().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o nome graduação");
            return;
        }
        ac.setGraduacaoProf(txtGrad.getText());
        
        if (idade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return;
        }else if (ac.getIdade() < 1){
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return;
        }else if (ac.getIdade() > 100){
            JOptionPane.showMessageDialog(null, "Digite Novamente a idade!");
            return ;
        }
        ac.setIdade(Integer.parseInt(idade.getText()));
        if (ac.getSexo().equals("M") || ac.getSexo().equals("F") || ac.getSexo().equals("Masculino") || ac.getSexo().equals("Feminino")) {
            return;
        }else if (ac.getSexo().equals("12345")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
            return;
        }else if (ac.getSexo().equals("@#$%&")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
            return ;
        }else if (ac.getSexo().equals("@#$1234")){
            JOptionPane.showMessageDialog(null, "Digite Novamente o sexo!");
            return;
        }
        ac.setSexo(txtSexo.getText());
        
        ac.setEnderco(txtende.getText());
        if (dao.verificaCampoVazio(ac) == false) {
            dao.cadastrarAcademia(ac);
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Cadastrado nao foi possivel!");
        }
        
        if(dao.verificaSexo(ac) == false){
            JOptionPane.showMessageDialog(null, "Digite Novamente!");
        }
           this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtGrad;
    private javax.swing.JTextField txtNomeAc;
    private javax.swing.JTextField txtNomePf;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtende;
    // End of variables declaration//GEN-END:variables

    private void dispose(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
