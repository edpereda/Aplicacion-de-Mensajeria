/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac_3_messengerv2;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextField;
import java.util.Date;
import java.awt.Font;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTMLDocument;
/**
 *
 * @author eddyp
 */
public class Cliente extends javax.swing.JFrame implements Runnable{
    File ruta_proyecto = new File(".");
    File ruta_emojis = new File(ruta_proyecto.getAbsolutePath()+"//emoji");
   
private DefaultListModel dlm;
private String fuentes[];
    /**
     * Creates new form Cliente
     */
    public Cliente() {
         dlm = new DefaultListModel();
        fuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        initComponents();
        lista.setModel(dlm);
        cargarComponentes();
         
        
         this.getContentPane().setBackground(new Color(114,145,185));
        this.setLocationRelativeTo( null );
        
    }
private void cargarComponentes(){
    for(int i=14; i<=30; i++){
        combo.addItem(i);
    }
    for(String fuente: fuentes){
    dlm.addElement(fuente);
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
        ep_chat = new javax.swing.JEditorPane();
        tf_mensaje = new javax.swing.JTextField();
        b_enviar_mensaje = new javax.swing.JButton();
        tf_ip = new javax.swing.JTextField();
        tf_nickname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<String>();
        combo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_angry = new javax.swing.JButton();
        b_happy = new javax.swing.JButton();
        b_love = new javax.swing.JButton();
        b_sad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Messenger");
        setBackground(new java.awt.Color(140, 140, 162));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(92, 88, 119));
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(ep_chat);

        b_enviar_mensaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b_enviar_mensaje.setForeground(new java.awt.Color(0, 0, 204));
        b_enviar_mensaje.setText("ENVIAR MENSAJE");
        b_enviar_mensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_enviar_mensajeActionPerformed(evt);
            }
        });

        tf_ip.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_ip.setText("127.0.0.1");
        tf_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ipActionPerformed(evt);
            }
        });

        tf_nickname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("IP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nickname");

        lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fuente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tamaño");

        b_angry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emoji/emoji_angry.png"))); // NOI18N
        b_angry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_angryActionPerformed(evt);
            }
        });

        b_happy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emoji/emoji_happy.png"))); // NOI18N
        b_happy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_happyActionPerformed(evt);
            }
        });

        b_love.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emoji/emoji_love.png"))); // NOI18N
        b_love.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loveActionPerformed(evt);
            }
        });

        b_sad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emoji/emoji_sad.png"))); // NOI18N
        b_sad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_enviar_mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_nickname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_angry, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_happy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_love, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_sad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nickname, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(tf_ip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(b_angry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_happy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_love, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_sad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_enviar_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_mensaje))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_enviar_mensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_enviar_mensajeActionPerformed
        ep_chat.setContentType("text/html");
                    
        ep_chat.setText(obtenerChat()+
                        "<b>YO: </b>" +
                        "<p>"+tf_mensaje.getText()+"</p><br>"        
                        );
        
        enviar_mensaje(tf_ip,tf_mensaje,tf_nickname);
    }//GEN-LAST:event_b_enviar_mensajeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Thread hilo_chat = new Thread (this);
        
        hilo_chat.start();
    }//GEN-LAST:event_formWindowActivated

    private void listaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaValueChanged
        Font f =tf_mensaje.getFont();
        tf_mensaje.setFont(new Font(String.valueOf(dlm.getElementAt(lista.getSelectedIndex())),Font.PLAIN, f.getSize()));
         
        
    }//GEN-LAST:event_listaValueChanged

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        Font f=tf_mensaje.getFont();
       tf_mensaje.setFont(new Font(f.getName(), Font.PLAIN,Integer.parseInt(String.valueOf(combo.getSelectedItem()))));
        
    }//GEN-LAST:event_comboItemStateChanged

    private void b_angryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_angryActionPerformed
        ep_chat.setContentType("text/html");                 
                        
            // Insertamos un texto
        ep_chat.setText(obtenerChat()+
                        "<b>YO: </b><br>" +
                        "<img src=\"file:C:/Users/eddyp/Desktop/6TO SEMESTRE/REDES 2/PRACTICAS/Prac_3_MessengerV4/emoji/emoji_angry.png\"></img><br>");
            
        enviar_emoji(tf_ip,tf_nickname,"emoji-angry");
    }//GEN-LAST:event_b_angryActionPerformed

    private void b_happyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_happyActionPerformed
        ep_chat.setContentType("text/html");                 
                        
            // Insertamos un texto
        ep_chat.setText(obtenerChat()+
                        "<b>YO: </b><br>" +
                        "<img src=\"file:C:/Users/eddyp/Desktop/6TO SEMESTRE/REDES 2/PRACTICAS/Prac_3_MessengerV4/emoji/emoji_happy.png\"></img><br>");
        
        enviar_emoji(tf_ip, tf_nickname, "emoji-happy");
    }//GEN-LAST:event_b_happyActionPerformed

    private void tf_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ipActionPerformed

    private void b_loveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_loveActionPerformed
        ep_chat.setContentType("text/html");                 
                        
            // Insertamos un texto
        ep_chat.setText(obtenerChat()+
                        "<b>YO: </b><br>" +
                        "<img src=\"file:C:/Users/eddyp/Desktop/6TO SEMESTRE/REDES 2/PRACTICAS/Prac_3_MessengerV4/emoji/emoji_love.png\"></img><br>");
        
        enviar_emoji(tf_ip, tf_nickname, "emoji-love");
    }//GEN-LAST:event_b_loveActionPerformed

    private void b_sadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sadActionPerformed
        ep_chat.setContentType("text/html");                 
                        
            // Insertamos un texto
        ep_chat.setText(obtenerChat()+
                        "<b>YO: </b><br>" +
                        "<img src=\"file:C:/Users/eddyp/Desktop/6TO SEMESTRE/REDES 2/PRACTICAS/Prac_3_MessengerV4/emoji/emoji_sad.png\"></img><br>");
        
        enviar_emoji(tf_ip, tf_nickname, "emoji-sad");
    }//GEN-LAST:event_b_sadActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_angry;
    private javax.swing.JButton b_enviar_mensaje;
    private javax.swing.JButton b_happy;
    private javax.swing.JButton b_love;
    private javax.swing.JButton b_sad;
    private javax.swing.JComboBox combo;
    private javax.swing.JEditorPane ep_chat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JTextField tf_ip;
    private javax.swing.JTextField tf_mensaje;
    private javax.swing.JTextField tf_nickname;
    // End of variables declaration//GEN-END:variables

    private void enviar_mensaje(JTextField tf_ip, JTextField tf_mensaje, JTextField tf_nickname) {
        try{
            int pto= 9000;
            String host="127.0.0.1";
            Socket cl = new Socket(host, pto);
            
            /*DataOutputStream dos = new DataOutputStream(cl.getOutputStream());
            DataInputStream dis = new DataInputStream(cl.getInputStream());
            
            dos.writeUTF("file");
            dos.flush();
            
            String cadena = dis.readUTF();
            System.out.println("Cadena recibida: "+cadena);
            
            dis.close();
            dos.close();*/
            
            Mensaje mensaje = new Mensaje(tf_ip.getText(), tf_nickname.getText(), tf_mensaje.getText());    //Creamos el mensaje
            
            ObjectOutputStream out = new ObjectOutputStream(cl.getOutputStream());
            out.writeObject(mensaje);
            
            
            cl.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try{
            ServerSocket servidor_cliente = new ServerSocket(9090);
            
            Socket cliente;
            
            Mensaje mensaje;
            
            System.out.println("Servidor de cliente iniciado...");
            
            while(true){
                
               
                cliente= servidor_cliente.accept();
                System.out.println("Cliente aceptado");
                ObjectInputStream ois = new ObjectInputStream(cliente.getInputStream());
                
                mensaje = (Mensaje) ois.readObject();
                
                if(mensaje.getMensaje().contains("emoji")){
                    System.out.println("Contiene emoji");
                    
                    if (mensaje.getMensaje().contains("angry")){
                        String chat="";
                        chat = ep_chat.getText();
                        System.out.println("Contiene angry");
                        /*ep_chat.setText(chat+" hola");*/
                        //Agregar imagen al texto
                        
                        // Marcamos el editor para que use HTML
                        ep_chat.setContentType("text/html");
                        
                        
                        // Insertamos un texto
                        ep_chat.setText(obtenerChat()+
                                        "<b>"+mensaje.getNickname()+": </b><br>" +
                                        "<img src=\"file:C:/Users/eddyp/Desktop/6TO SEMESTRE/REDES 2/PRACTICAS/Prac_3_MessengerV4/emoji/emoji_angry.png\"></img><br>");
                        //JOptionPane.showMessageDialog(null, ep_chat.getText());
                        //C:\Users\eddyp\Desktop\6TO SEMESTRE\REDES 2\PRACTICAS\Prac_3_MessengerV4\emoji
                    }
                    
                    if (mensaje.getMensaje().contains("happy")){
                        String chat="";
                        chat = ep_chat.getText();
                        System.out.println("Contiene happy");
                        /*ep_chat.setText(chat+" hola");*/
                        //Agregar imagen al texto
                        
                        // Marcamos el editor para que use HTML
                        ep_chat.setContentType("text/html");
                        
                        
                        // Insertamos un texto
                        ep_chat.setText(obtenerChat()+
                                        "<b>"+mensaje.getNickname()+": </b><br>" +
                                        "<img src=\"file:C:/Users/eddyp/Desktop/6TO SEMESTRE/REDES 2/PRACTICAS/Prac_3_MessengerV4/emoji/emoji_happy.png\"></img><br>");
                        //JOptionPane.showMessageDialog(null, ep_chat.getText());
                        //C:\Users\eddyp\Desktop\6TO SEMESTRE\REDES 2\PRACTICAS\Prac_3_MessengerV4\emoji
                    }
                    
                    if (mensaje.getMensaje().contains("love")){
                        String chat="";
                        chat = ep_chat.getText();
                        System.out.println("Contiene love");
                        /*ep_chat.setText(chat+" hola");*/
                        //Agregar imagen al texto
                        
                        // Marcamos el editor para que use HTML
                        ep_chat.setContentType("text/html");
                        
                        
                        // Insertamos un texto
                        ep_chat.setText(obtenerChat()+
                                        "<b>"+mensaje.getNickname()+": </b><br>" +
                                        "<img src=\"file:C:/Users/eddyp/Desktop/6TO SEMESTRE/REDES 2/PRACTICAS/Prac_3_MessengerV4/emoji/emoji_love.png\"></img><br>");
                        //JOptionPane.showMessageDialog(null, ep_chat.getText());
                        //C:\Users\eddyp\Desktop\6TO SEMESTRE\REDES 2\PRACTICAS\Prac_3_MessengerV4\emoji
                    }
                    
                    if (mensaje.getMensaje().contains("sad")){
                        String chat="";
                        chat = ep_chat.getText();
                        System.out.println("Contiene sad");
                        /*ep_chat.setText(chat+" hola");*/
                        //Agregar imagen al texto
                        
                        // Marcamos el editor para que use HTML
                        ep_chat.setContentType("text/html");
                        
                        
                        // Insertamos un texto
                        ep_chat.setText(obtenerChat()+
                                        "<b>"+mensaje.getNickname()+": </b><br>" +
                                        "<img src=\"file:C:/Users/eddyp/Desktop/6TO SEMESTRE/REDES 2/PRACTICAS/Prac_3_MessengerV4/emoji/emoji_sad.png\"></img><br>");
                        //JOptionPane.showMessageDialog(null, ep_chat.getText());
                        //C:\Users\eddyp\Desktop\6TO SEMESTRE\REDES 2\PRACTICAS\Prac_3_MessengerV4\emoji
                    }
                    
                }else{
                    //String ventana_chat = ep_chat.getText();
                    /*ep_chat.setForeground(new Color(26,70,126));
                    tf_mensaje.setForeground(new Color(26,70,126));
                    Font g =ep_chat.getFont();
                    ep_chat.setFont(new Font(String.valueOf(dlm.getElementAt(lista.getSelectedIndex())),Font.PLAIN, g.getSize()));
                    Font h=ep_chat.getFont();
                    ep_chat.setFont(new Font(h.getName(), Font.PLAIN,Integer.parseInt(String.valueOf(combo.getSelectedItem()))));
                    ventana_chat = ventana_chat + new Date() + "\n" + mensaje.getNickname() + ": " + mensaje.getMensaje() + "\n";
                    ep_chat.setText(ventana_chat);*/
                    
                    //JOptionPane.showMessageDialog(null, ventana_chat);
                    ep_chat.setContentType("text/html");
                    
                    ep_chat.setText(obtenerChat()+
                                    "<b>"+mensaje.getNickname()+": </b>" +
                                    "<p>"+mensaje.getMensaje()+"</p><br>"        
                                    );
                    
                }
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void enviar_emoji(JTextField tf_ip, JTextField tf_nickname, String emoji) {
        try{
            int pto= 9000;
            String host="127.0.0.1";
            Socket cl = new Socket(host, pto);
            
            Mensaje mensaje = new Mensaje(tf_ip.getText(), tf_nickname.getText(), emoji);    //Creamos el mensaje
            
            ObjectOutputStream out = new ObjectOutputStream(cl.getOutputStream());
            out.writeObject(mensaje);
            
            
            cl.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String obtenerChat(){
        String cadena_chat = ep_chat.getText();
        int indexfinalpagina = cadena_chat.indexOf("</body>");
        String chat_correcto = cadena_chat.substring(0, indexfinalpagina);
        return chat_correcto;
    }
}
