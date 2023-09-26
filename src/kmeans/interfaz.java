/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;
import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.JFrame;
import org.math.plot.Plot2DPanel;
import kmeans.Pract2;
/**
 *
 * @author Bacs
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
        plot = new Plot2DPanel();
        //EventoPlot click=new EventoPlot();
        //plot.addMouseListener(click);
        jPanel1.add(plot,BorderLayout.CENTER);
        p= new Pract2();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    public Plot2DPanel plot ;
    Pract2 p;
    double[][] puntos;
    int Np,Na;
    double [] arrayX,arrayY;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtPuntos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbIter = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCla = new javax.swing.JButton();
        txtClas = new javax.swing.JTextField();
        lblcomp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.BorderLayout(2, 0));

        txtPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntosActionPerformed(evt);
            }
        });

        jLabel4.setText("No. de Puntos");

        btnGra.setText("Graficar");
        btnGra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraActionPerformed(evt);
            }
        });

        jLabel3.setText("No. de Clases");

        lbIter.setText("0000000000000000");

        jLabel1.setText("No. de Iteraciones:");

        btnCla.setText("Clasificar");
        btnCla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaActionPerformed(evt);
            }
        });

        lblcomp.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtPuntos)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGra)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCla)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtClas)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIter, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblcomp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGra)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(txtClas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCla)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbIter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblcomp, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntosActionPerformed

    private void btnGraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraActionPerformed
        plot.removeAllPlots();
        Np=Integer.parseInt(txtPuntos.getText());
        p.limite=1000;
        puntos=p.aleatorios(Np);
        arrayX=p.cord(puntos,Np,0);        
        arrayY=p.cord(puntos,Np,1);
        plot.addScatterPlot("clase"+puntos[0][2],arrayX, arrayY);
    }//GEN-LAST:event_btnGraActionPerformed

    private void btnClaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaActionPerformed
        double[][] atractores;
        Na=Integer.parseInt(txtClas.getText());
        atractores=p.calc_atrac(Na);
        Actuliza hilo= new Actuliza();
        hilo.comp_atrac(atractores,puntos);
        hilo.start();
        
    }//GEN-LAST:event_btnClaActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //System.out.println(""+ plot.getMousePosition());
        System.out.println("a");
    }//GEN-LAST:event_jPanel1MouseClicked
 
     /*public class EventoPlot implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent arg0) {
            
            Point punto;
            punto=plot.getMousePosition();
            System.out.println("a");
                  
        }

        @Override
        public void mousePressed(MouseEvent arg0) {
               System.out.println("a"); 
        }

        @Override
        public void mouseReleased(MouseEvent arg0) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent arg0) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent arg0) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
     }*/
    
    public void recurso(double[][] atractores,double[][] puntpss){
        double[][] centroides,temp;
        int i=0;
        lbIter.setText(""+i);
        lblcomp.setText("");
        do{
            plot.removeAllPlots();
            lbIter.setText((Integer.parseInt(lbIter.getText().toString())+i)+"");
            temp=atractores;
            arrayX=p.cord(atractores,Na,0);
            arrayY=p.cord(atractores,Na,1);
            plot.addScatterPlot("Atractores",arrayX, arrayY);
            plot.repaint();
            double[][] punt_clas=new double[Np][3];
            punt_clas=p.clasifica(puntos, atractores);
            
            centroides=p.calc_centros(punt_clas, Na);
            arrayX=p.cord(centroides,Na,0);
            arrayY=p.cord(centroides,Na,1);
            atractores=centroides;
            plot.addScatterPlot("Centroides",arrayX, arrayY);
            plot.repaint();
            mostrar__punto(punt_clas);
            delay(2000);
            
            i++;
        }while(comprobar(temp, atractores));
        lblcomp.setText("Completado");
    }
    public boolean comprobar(double [][] temp,double[][] centroides){
        
        for(int i=0;i<temp.length;i++){
            if(temp[i][0]==centroides[i][0])
                if(temp[i][1]==centroides[i][1]){
                    if(i==temp.length-1){
                        return false;
                    }
                }
        }
        return true;
    }
    
    private void delay(long milis){
        try {
                Thread.sleep(milis);
        } catch (InterruptedException e) {
        }
    }
    
    public void mostrar__punto(double[][] punt_clas){
        double[][] punt=new double[Np][3];
        for(int cl=0;cl<Na;cl++){
            punt= p.agregar_clase(punt_clas, cl);
            int Ni=punt.length;
            if(Ni!=0){
                arrayX=p.cord(punt,Ni,0);
                arrayY=p.cord(punt,Ni,1);
                plot.addScatterPlot("Datos"+cl,arrayX, arrayY);
                plot.repaint();
                
            }
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new interfaz().setVisible(true);
                }
            });
        } catch (Exception e) {
            System.out.println("");
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCla;
    private javax.swing.JButton btnGra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbIter;
    private javax.swing.JLabel lblcomp;
    private javax.swing.JTextField txtClas;
    private javax.swing.JTextField txtPuntos;
    // End of variables declaration//GEN-END:variables
    
    
    public class Actuliza extends Thread{
        double[][] atractor,punto;
        @Override
        public void run(){
            recurso(atractor,punto);
        }
        
        public void comp_atrac(double[][] centros,double[][] punt){
            
            this.atractor=centros;
            this.punto=punt;
                    
        }
    }
        
}
