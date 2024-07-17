/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Martinez
 */
public enum Planeta {

    Mercurio(0,3.303, 23,2.4397, 6),
    Venus (0,4.869,24,6.051, 6),
    Tierra (0,5.976, 24,6.3781, 6),
    Marte (0,6.421, 23,3.3972, 6),
    Jupiter (4,1.9, 27,7.1492, 7),
    Saturno (12,5.688, 26,7.1492, 7),
    Urano (13,8.686, 25,2.5559, 7),
    Neptuno (6,1.024, 24,2.4746, 7);
    public final int anillos;
    public final double masa;
    public final double pow;
    public final double radio;
    public final double pow2;

    /**
     *
     */
    public final int e = 10;
    private Planeta (int anillos, double masa,double pow, double radio, double pow2){
        this.anillos = anillos;
        this.masa = masa;
        this.radio = radio;
        this.pow = pow;
        this.pow2 = pow2;
    }
    
    public String tipoPlaneta(){
        if(this.anillos>0){
            return "Planeta Gigante";
        }
        return "Planeta Rocoso";
    }

    
    public double gravedad(Planeta H){
        double G = 6.67300*Math.pow(e,-11);
        double g,r,r2,GT;
        
        g = H.masa*Math.pow(e, H.pow);
        r = H.radio*Math.pow(e, H.pow2);
        r2 = Math.pow(r, 2);
        GT = (G*g)/r2;
        return GT;
    }
    public double Peso(double masaObjeto, double gravedad){
        double W;
        
        W = gravedad*(masaObjeto);
        return W;
    }
    public double espacio(double h){
        h = h/9.81;
        return h;
    }
    
}
