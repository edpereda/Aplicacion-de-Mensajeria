/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac_3_messengerv2;

import java.net.ServerSocket;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author eddyp
 */
public class Servidor {
    public static void main (String [] args){
        ArrayList <usuario> lista_usuarios = new ArrayList <usuario> ();
        try{
            int pto=9000;
            ServerSocket s = new ServerSocket(pto);
            
            String ip, nickname, mensaje;
            Mensaje mensaje_recibido;
            
            System.out.println("Servicio iniciado, esperando clientes...");
            for(;;){
                Socket server= s.accept();
                System.out.println("Cliente conectado...");
                
                /*DataInputStream dis = new DataInputStream(cl.getInputStream());     //creamos el flujo para leer el nombre del archivo
                DataOutputStream dos = new DataOutputStream(cl.getOutputStream());
                
                String tipo_dato = dis.readUTF();                                   //con este leemos que tipo de dato llega
                dos.writeUTF("Hola");
                System.out.println("Dato: "+tipo_dato);
                
                dos.close();
                dis.close();*/
                
                ObjectInputStream ins = new ObjectInputStream(server.getInputStream());
                mensaje_recibido = (Mensaje) ins.readObject();
                
                System.out.println("IP: "+mensaje_recibido.getIp()+" Nick: "+mensaje_recibido.getNickname()+" Mensaje: "+mensaje_recibido.getMensaje());
                
                
                if (mensaje_recibido.getIp().contains("all")){                 //por si se quiere mandar a todos los usuarios
                    System.out.println("Comando All recibido");
                    for (int i = 0; i<lista_usuarios.size(); i++){
                        Socket s_envia= new Socket(lista_usuarios.get(i).getIp_usuario(),9090);
                        ObjectOutputStream outs = new ObjectOutputStream(s_envia.getOutputStream());
                        outs.writeObject(mensaje_recibido);
                        
                        outs.close();
                        s_envia.close();
                    }
                }else{
                    //aqui agregamos a la lista por si se desea enviar mensaje a todos los usuarios
                    if (!enlista(lista_usuarios,mensaje_recibido.getNickname())){
                        lista_usuarios.add(new usuario(mensaje_recibido.getNickname(), mensaje_recibido.getIp()));
                        System.out.println("Usuario añadido");
                    }
                    Socket s_envia= new Socket(mensaje_recibido.getIp(),9090);
                    ObjectOutputStream outs = new ObjectOutputStream(s_envia.getOutputStream());
                    outs.writeObject(mensaje_recibido);
                    
                    outs.close();
                    s_envia.close();
                }
                
                
                
                
                
                server.close();
                        
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static boolean enlista(ArrayList<usuario> lista_usuarios,String Nickname) {
        for (int i = 0; i<lista_usuarios.size(); i++){
            if (lista_usuarios.get(i).getNom_usuario().contains(Nickname))
                return true;
        }
        return false;
    }
}
