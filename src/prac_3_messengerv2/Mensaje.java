/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac_3_messengerv2;

import java.io.Serializable;

/**
 *
 * @author eddyp
 */
public class Mensaje implements Serializable{
    String ip, nickname, mensaje;

    public Mensaje(String ip, String nickname, String mensaje) {
        this.ip = ip;
        this.nickname = nickname;
        this.mensaje = mensaje;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
