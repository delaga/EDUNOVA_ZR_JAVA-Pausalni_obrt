/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.view;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.apache.commons.validator.routines.EmailValidator;
import org.mindrot.jbcrypt.BCrypt;
import zavrsnirad.controller.ObradaKorisnik;
import zavrsnirad.model.Korisnik;
import zavrsnirad.utility.Utils;

/**
 *
 * @author mirza
 */
public class ViewAutorizacija extends javax.swing.JFrame {

    public ObradaKorisnik obrada;
    public Korisnik trenutniKorisnik;

    /**
     * Creates new form Autorizacija
     */
    public ViewAutorizacija() {
        initComponents();
        if (Utils.isDev()) {
            txtEmail.setText("mirza@ping.com.hr");
            psvLozinka.setText("123");
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

        txtEmail = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        psvLozinka = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autorizacija");

        txtEmail.setText("korisničko ime");

        btnSubmit.setText("OK");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        psvLozinka.setText("jPasswordField1");

        jLabel1.setText("e-mail korisnika:");

        jLabel2.setText("lozinka:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(psvLozinka)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(psvLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (txtEmail.getText().trim().length() == 0) {
            greska(txtEmail, "Email obavezan");
            return;
        }
        //factory pattern
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(txtEmail.getText())) {
            greska(txtEmail, "Obavezan unos valjane email adrese");
            return;
        }

        txtEmail.setBackground(Color.WHITE);
        txtEmail.setForeground(Color.BLACK);

        if (psvLozinka.getPassword().length == 0) {
            greska(psvLozinka, "Lozinka obavezno");
            return;
        }

        psvLozinka.setBackground(Color.WHITE);
        psvLozinka.setForeground(Color.BLACK);
        ObradaKorisnik obrada=new ObradaKorisnik();
           Korisnik trenutniKorisnik= obrada.getKorisnik(txtEmail.getText());
           
        

       
//        if(!BCrypt.checkpw(new String(psvLozinka.getPassword()),trenutniKorisnik.getLozinka())){
//            JOptionPane.showMessageDialog(null,"Kombinacija email i lozinka ne odgovara");
//            psvLozinka.requestFocus();
//            return;
//        }

        new ViewGlavni().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    private void greska(JComponent komponenta, String poruka) {
        JOptionPane.showMessageDialog(null, poruka);
        komponenta.setBackground(Color.RED);
        komponenta.setForeground(Color.WHITE);
        komponenta.requestFocus();
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField psvLozinka;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
