/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikonversisuhu;

import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author irhas
 */
public class KonversiSuhu extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhu
     */
    public KonversiSuhu() {
        initComponents();
        suhuA.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validasiAngka(evt);
            }
        });
        suhuB.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validasiAngka(evt);
            }
        });
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
        jLabel1 = new javax.swing.JLabel();
        suhuA = new javax.swing.JTextField();
        pilsuhuA = new javax.swing.JComboBox<>();
        pilsuhuB = new javax.swing.JComboBox<>();
        suhuB = new javax.swing.JTextField();
        invertOpt = new javax.swing.JRadioButton();
        convertBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        suhuA.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        suhuA.setText("0");
        suhuA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                suhuAKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                suhuAKeyTyped(evt);
            }
        });

        pilsuhuA.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pilsuhuA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CELCIUS", "FAHRENHEIT", "KELVIN", "REAMUR" }));
        pilsuhuA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilsuhuAItemStateChanged(evt);
            }
        });
        pilsuhuA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilsuhuAActionPerformed(evt);
            }
        });

        pilsuhuB.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        pilsuhuB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CELCIUS", "FAHRENHEIT", "KELVIN", "REAMUR" }));
        pilsuhuB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilsuhuBItemStateChanged(evt);
            }
        });

        suhuB.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        suhuB.setText("0");
        suhuB.setEnabled(false);
        suhuB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suhuBActionPerformed(evt);
            }
        });
        suhuB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                suhuBKeyReleased(evt);
            }
        });

        invertOpt.setText("⇅");
        invertOpt.setAlignmentX(1.0F);
        invertOpt.setAlignmentY(1.0F);
        invertOpt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        invertOpt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                invertOptItemStateChanged(evt);
            }
        });
        invertOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertOptActionPerformed(evt);
            }
        });

        convertBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        convertBtn.setText("Konversi");
        convertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clearBtn.setText("Bersihkan");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("MUHAMMAD IRHASH FURQAN - 2410010596");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(clearBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(convertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pilsuhuB, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pilsuhuA, 0, 272, Short.MAX_VALUE)
                                .addComponent(suhuA)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(suhuB, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invertOpt)))
                .addGap(13, 13, 13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(suhuA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pilsuhuA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(suhuB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(invertOpt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pilsuhuB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invertOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertOptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invertOptActionPerformed

    private void convertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBtnActionPerformed
        
    }//GEN-LAST:event_convertBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        suhuA.setText("");
        suhuB.setText("");
        if (!invertOpt.isSelected()) {
            suhuA.requestFocus();
        }else{
            suhuB.requestFocus();
        }

    }//GEN-LAST:event_clearBtnActionPerformed

    private void suhuAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suhuAKeyTyped
        

    }//GEN-LAST:event_suhuAKeyTyped

    private void suhuAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suhuAKeyReleased
        if (!invertOpt.isSelected()) {
            updateHasilKonversi();
        }

    }//GEN-LAST:event_suhuAKeyReleased

    private void pilsuhuAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilsuhuAItemStateChanged
            updateHasilKonversi();
    }//GEN-LAST:event_pilsuhuAItemStateChanged

    private void pilsuhuBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilsuhuBItemStateChanged
            updateHasilKonversi();
    }//GEN-LAST:event_pilsuhuBItemStateChanged

    private void invertOptItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_invertOptItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
        suhuA.setEnabled(false); // Disable suhuA, enable suhuB
        suhuB.setEnabled(true);
    } else {
        suhuA.setEnabled(true);  // Enable suhuA, disable suhuB
        suhuB.setEnabled(false);
    }
    updateHasilKonversi(); // Update hasil saat status invert berubah
    }//GEN-LAST:event_invertOptItemStateChanged

    private void suhuBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suhuBActionPerformed
        
    }//GEN-LAST:event_suhuBActionPerformed

    private void suhuBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suhuBKeyReleased
        if (invertOpt.isSelected()) {
            updateHasilKonversi();
        }
    }//GEN-LAST:event_suhuBKeyReleased

    private void pilsuhuAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilsuhuAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilsuhuAActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
        
    }
    
    private void updateHasilKonversi() {
        try {
            double suhuAwal;
            String namasuhuAwal, namasuhuTujuan;

            // Tentukan sumber input berdasarkan invertOpt
            if (invertOpt.isSelected()) {
                suhuAwal = Double.parseDouble(suhuB.getText());
                namasuhuAwal = (String) pilsuhuB.getSelectedItem();
                namasuhuTujuan = (String) pilsuhuA.getSelectedItem();
            } else {
                suhuAwal = Double.parseDouble(suhuA.getText());
                namasuhuAwal = (String) pilsuhuA.getSelectedItem();
                namasuhuTujuan = (String) pilsuhuB.getSelectedItem();
            }

            SatuanSuhu satuanAwal = SatuanSuhu.valueOf(namasuhuAwal.toUpperCase());
            SatuanSuhu satuanTujuan = SatuanSuhu.valueOf(namasuhuTujuan.toUpperCase());

            Double hasil = convertSuhu(suhuAwal, satuanAwal, satuanTujuan);

            // Set hasil konversi pada output yang sesuai
            if (invertOpt.isSelected()) {
                suhuA.setText(hasil.toString());
            } else {
                suhuB.setText(hasil.toString());
            }
        } catch (NumberFormatException ex) {
            // Set error message pada field output jika input tidak valid
//            double suhuAwal = 0.0;
            suhuA.setText("0");
            if (invertOpt.isSelected()) {
                suhuA.setText("Inputan Salah");
            } else {
                suhuB.setText("Inputan Salah");
            }
        }
    }

    
    private void validasiAngka(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '\b') {
            evt.consume(); // Batalkan input
            JOptionPane.showMessageDialog(this, 
                "Hanya angka yang diperbolehkan!", 
                "Error Input", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    private void addClearOnFocus(JTextField textField) {
    textField.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            textField.setText(""); // Kosongkan saat mendapatkan fokus
        }
        });
    }
    
    
    public enum SatuanSuhu {
        CELCIUS, FAHRENHEIT, KELVIN, REAMUR
    }

    private double convertSuhu(double suhuAwal, SatuanSuhu satuanAwal, SatuanSuhu satuanTujuan) {
        switch (satuanAwal) {
            case CELCIUS:
                switch (satuanTujuan) {
                    case FAHRENHEIT:
                        return (suhuAwal * 9.0 / 5) + 32;
                    case KELVIN:
                        return suhuAwal + 273.15;
                    case REAMUR:
                        return suhuAwal * 4.0 / 5;
                    default:
                        return suhuAwal;
                }
            case FAHRENHEIT:
                switch (satuanTujuan) {
                    case CELCIUS:
                        return (suhuAwal - 32) * 5.0 / 9;
                    case KELVIN:
                        return (suhuAwal + 459.67) * 5.0 / 9;
                    case REAMUR:
                        return (suhuAwal - 32) * 4.0 / 9;
                    default:
                        return suhuAwal;
                }
            case KELVIN:
                switch (satuanTujuan) {
                    case CELCIUS:
                        return suhuAwal - 273.15;
                    case FAHRENHEIT:
                        return (suhuAwal * 9.0 / 5) - 459.67;
                    case REAMUR:
                        return (suhuAwal - 273.15) * 4.0 / 5;
                    default:
                        return suhuAwal;
                }
            case REAMUR:
                switch (satuanTujuan) {
                    case CELCIUS:
                        return suhuAwal * 5.0 / 4;
                    case FAHRENHEIT:
                        return (suhuAwal * 9.0 / 4) + 32;
                    case KELVIN:
                        return (suhuAwal * 5.0 / 4) + 273.15;
                    default:
                        return suhuAwal;
                }
            default:
                throw new IllegalArgumentException("Satuan awal tidak valid");
        }
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton convertBtn;
    private javax.swing.JRadioButton invertOpt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> pilsuhuA;
    private javax.swing.JComboBox<String> pilsuhuB;
    private javax.swing.JTextField suhuA;
    private javax.swing.JTextField suhuB;
    // End of variables declaration//GEN-END:variables
}
