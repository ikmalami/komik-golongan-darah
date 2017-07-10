/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalpraktikum;

import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 *
 * @author Asus
 */
public class IsiGolongan extends javax.swing.JFrame {

    /**
     * Creates new form IsiGolongan
     */
    LinkedList<Golongan> mylinkedlist = new LinkedList<Golongan>();
    private int index = 0;

    public IsiGolongan(int myindex) {
        index=myindex;
        initComponents();
        isidata();
        tampil();
    }

    private void tampil(){
        jLabel1.setText(mylinkedlist.get(index).getJudul());
        jTextArea1.setText(mylinkedlist.get(index).getDeskripsi());
        
    
    ImageIcon image = new      
       ImageIcon(getClass().getResource(mylinkedlist.get(index).getLogo()));
       jLabel2.setIcon(image);
    
    }
    private void isidata(){
        mylinkedlist.add(new Golongan("Golongan Darah A","    Biasanya orang yang bergolongan darah A ini berkepala dingin, serius, sabar dan kalem atau cool, bahasa kerennya.\n" +
"    Orang yang bergolongan darah A ini mempunyai karakter yang tegas, bisa di andalkan dan dipercaya namun keras kepala.\n" +
"    Sebelum melakukan sesuatu mereka memikirkannya terlebih dahulu. Dan merencanakan segala sesuatunya secara matang. Mereka mengerjakan segalanya dengan sungguh-sungguh dan secara konsisten.\n" +
"    Mereka berusaha membuat diri mereka se wajar dan ideal mungkin.\n" +
"    Mereke bisa kelihatan menyendiri dan jauh dari orang-orang.\n" +
"    mereka mencoba menekan perasaan mereka dan karena sering melakukannya mereka terlihat tegar. Meskipun sebenarnya mereka mempunya sisi yang lembek seperti gugup dan lain sebagainya.\n" +
"    Mereka cenderung keras terhadap orang-orang yang tidak sependapat. Makanya mereka cenderung berada di sekitar orang-orang yang ber'temperamen' sama. ","/Gambar/A.png"));
        mylinkedlist.add(new Golongan("Golongan Darah B","    Orang yang bergolongan darah B ini cenderung penasaran dan tertarik terhadap segalanya.\n" +
"    Mereka juga cenderung mempunyai terlalu banyak kegemaran dan hobby. Kalau sedang suka dengan sesuatu biasanya mereka menggebu-gebu namun cepat juga bosan.\n" +
"    Tapi biasanya mereka bisa memilih mana yang lebih penting dari sekian banyak hal yang di kerjakannya.\n" +
"    Mereka cenderung ingin menjadi nomor satu dalam berbagai hal ketimbang hanya dianggap rata-rata. Dan biasanya mereka cenderung melalaikan sesuatu jika terfokus dengan kesibukan yang lain. Dengan kata lain, mereka tidak bisa mengerjakan sesuatu secara berbarengan.\n" +
"    Mereka dari luar terlihat cemerlang, riang, bersemangat dan antusias. Namun sebenarnya hal itu semua sama sekali berbeda dengan yang ada didalam diri mereka.\n" +
"    Mereka bisa dikatakan sebagai orang yang tidak ingin bergaul dengan banyak orang. ","/Gambar/bb.png"));
        mylinkedlist.add(new Golongan("Golongan Darah AB","    Orang yang bergolongan darah AB ini mempunyai perasaan yang sensitif, lembut.\n" +
"    Mereka penuh perhatian dengan perasaan orang lain dan selalu menghadapi orang lain dengan kepedulian serta kehati-hatian.\n" +
"    Disamping itu mereka keras dengan diri mereka sendiri juga dengan orang-orang yang dekat dengannya.\n" +
"    Mereka jadi cenderung kelihatan mempunyai dua kepribadian.\n" +
"    Mereka sering menjadi orang yang sentimen dan memikirkan sesuatu terlalu dalam.\n" +
"    Mereka mempunyai banyak teman, tapi mereka membutuhkan waktu untuk menyendiri untuk memikirkan persoalan-persoalan mereka. ","/Gambar/b.png"));
        mylinkedlist.add(new Golongan("Golongan Darah O","    Orang yang bergolongan darah O, mereka ini biasanya berperan dalam menciptakan gairah untuk suatu grup. Dan berperan dalam menciptakan suatu keharmonisan diantara para anggota grup tersebut.\n" +
"    Figur mereka terlihat sebagai orang yang menerima dan melaksakan sesuatu dengan tenang. Mereka pandai menutupi sesuatu sehingga mereka kelihatan selalu riang, damai dan tidak punya masalah sama sekali. Tapi kalau tidak tahan, mereka pasti akan mencari tempat atau orang untuk curhat (tempat mengadu).\n" +
"    Mereka biasanya pemurah (baik hati), senang berbuat kebajikan. Mereka dermawan dan tidak segan-segan mengeluarkan uang untuk orang lain.\n" +
"    Mereka biasanya di cintai oleh semua orang, \"loved by all\". Tapi mereka sebenarnya keras kepala juga, dan secara rahasia mempunyai pendapatnya sendiri tentang berbagai hal.\n" +
"    Dilain pihak, mereka sangat fleksibel dan sangat mudah menerima hal-hal yang baru.\n" +
"    Mereka cenderung mudah di pengaruhi oleh orang lain dan oleh apa yang mereka lihat dari TV.\n" +
"    Mereka terlihat berkepala dingin dan terpercaya tapi mereka sering tergelincir dan membuat kesalahan yang besar karena kurang berhati-hati. Tapi hal itu yang menyebabkan orang yang bergolongan darah O ini di cintai. ","/Gambar/o.png"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 728));

        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setMinimumSize(new java.awt.Dimension(800, 600));
        jTextArea1.setPreferredSize(new java.awt.Dimension(800, 600));
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Previous");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InfoGol anak = new InfoGol();
        anak.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        index++;
        if (index >= mylinkedlist.size()) {
            index = 0;
        }
        tampil();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        index--;
        if(index < 0){
            index = mylinkedlist.size()-1;
            
        }
        tampil();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(IsiGolongan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IsiGolongan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IsiGolongan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IsiGolongan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IsiGolongan(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
