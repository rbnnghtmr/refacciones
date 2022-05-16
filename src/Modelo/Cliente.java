/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private int id;
    private String rfc;
    private String nombre;
    private String mail;
    private String telefono;
    private String direccion;
    private String ultima;

    public Cliente() {
    }

    public Cliente(int id, String rfc, String nombre, String mail, String telefono, String direccion, String ultima) {
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ultima = ultima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getMail(){
        return mail;
    }
    
    public void setMail(String mail){
        this.mail = mail;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUltima() {
        return ultima;
    }

    public void setUltima(String ultima) {
        this.ultima = ultima;
    }
    
    
}
