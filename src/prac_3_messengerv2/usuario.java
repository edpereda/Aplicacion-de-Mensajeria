/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac_3_messengerv2;

/**
 *
 * @author eddyp
 */
public class usuario {
    String nom_usuario;
    String ip_usuario;

    public usuario(String nom_usuario, String ip_usuario) {
        this.nom_usuario = nom_usuario;
        this.ip_usuario = ip_usuario;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public String getIp_usuario() {
        return ip_usuario;
    }

    public void setIp_usuario(String ip_usuario) {
        this.ip_usuario = ip_usuario;
    }
    
}
