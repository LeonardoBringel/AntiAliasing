package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import model.Cor;

public class FormPrincipal extends javax.swing.JFrame {

    BufferedImage biOriginal;
    BufferedImage biNovo;
    
    public FormPrincipal() {
        initComponents();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAntiAliasing = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        lblArquivo = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnBuscarImagem = new javax.swing.JButton();
        btnAplicarFiltro = new javax.swing.JButton();
        btnPasta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AntiAliasing");

        lblAntiAliasing.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblAntiAliasing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAntiAliasing.setText("AntiAliasing");

        lblArquivo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblArquivo.setText("Arquivo");

        txtArquivo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtArquivo.setText("imagem.bmp");

        btnBuscarImagem.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnBuscarImagem.setText("Buscar Imagem");
        btnBuscarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarImagemActionPerformed(evt);
            }
        });

        btnAplicarFiltro.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnAplicarFiltro.setText("Aplicar filtro");
        btnAplicarFiltro.setEnabled(false);
        btnAplicarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarFiltroActionPerformed(evt);
            }
        });

        btnPasta.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        btnPasta.setText("Pasta");
        btnPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAplicarFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(lblAntiAliasing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separator)
                    .addComponent(txtArquivo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAntiAliasing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArquivo)
                    .addComponent(btnPasta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarImagem)
                .addGap(18, 18, 18)
                .addComponent(btnAplicarFiltro)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarImagemActionPerformed

        try {
            biOriginal = ImageIO.read(
                    new File(".\\imagens\\" + txtArquivo.getText()));
            
            biNovo = new BufferedImage(
                    biOriginal.getWidth(), biOriginal.getHeight(), BufferedImage.TYPE_INT_RGB);

            JOptionPane.showMessageDialog(
                    null,
                    "Imagem encontrada!",
                    "",
                    JOptionPane.INFORMATION_MESSAGE
            );
            btnAplicarFiltro.setEnabled(true);
            txtArquivo.setEditable(false);
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Imagem não encontrada!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            txtArquivo.setText("imagem.bmp");
        }
    }//GEN-LAST:event_btnBuscarImagemActionPerformed

    private void btnAplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarFiltroActionPerformed
        
        for(int x = 0; x <= biOriginal.getWidth()-1; x++) {
            for(int y = 0; y <= biOriginal.getHeight()-1; y++) {
                
                List<Cor> cores = new ArrayList<>();
                
                cores.add(new Cor(biOriginal.getRGB(x, y)));
                
                if(y-1 >= 0) {
                    cores.add(new Cor(biOriginal.getRGB(x, y-1)));
                }
                
                if(y+1 <= biOriginal.getHeight()-1) {
                    cores.add(new Cor(biOriginal.getRGB(x, y+1)));
                }
                
                if(x+1 <= biOriginal.getWidth()-1) {
                    cores.add(new Cor(biOriginal.getRGB(x+1, y)));
                }
                
                if(x-1 >= 0) {
                    cores.add(new Cor(biOriginal.getRGB(x-1, y)));
                }
                
                Cor corResultado = new Cor();
                cores.forEach((Cor cor) -> {
                    corResultado.somaRed(cor.getRed());
                    corResultado.somaGreen(cor.getGreen());
                    corResultado.somaBlue(cor.getBlue());
                });
                
                corResultado.setRed(corResultado.getRed()/cores.size());
                corResultado.setGreen(corResultado.getGreen()/cores.size());
                corResultado.setBlue(corResultado.getBlue()/cores.size());
                
                biNovo.setRGB(x, y, corResultado.getRGB());
            }
        }
        
        try {
            ImageIO.write(biNovo, "bmp", new File(".\\imagens\\novo_" + txtArquivo.getText()));
            
            JOptionPane.showMessageDialog(
                    null,
                    "Filtro aplicado com sucesso!",
                    "",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Falha ao aplicar o filtro",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        
        btnAplicarFiltro.setEnabled(false);
    }//GEN-LAST:event_btnAplicarFiltroActionPerformed

    private void btnPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastaActionPerformed
        try {
            Runtime.getRuntime().exec("explorer .\\imagens");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Não foi possível abrir o explorador de arquivos",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        this.dispose();
    }//GEN-LAST:event_btnPastaActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarFiltro;
    private javax.swing.JButton btnBuscarImagem;
    private javax.swing.JButton btnPasta;
    private javax.swing.JLabel lblAntiAliasing;
    private javax.swing.JLabel lblArquivo;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables
}
