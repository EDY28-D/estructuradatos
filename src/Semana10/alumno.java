/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana10;

/**
 *
 * @author chris
 */
public class alumno {
    String name;
    int old;
    char sex;

    alumno(String n, int o, char s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public alumno(int name) {
        this.name = name;
        this.old = old;
        this.sex = sex;
    }
    String informacion(){
        return "Nombre: "+this.getName()+"\nEdad: "+this.getOld()+"\nSexo: "+this.getSex()+"\n\n";
    }
}
