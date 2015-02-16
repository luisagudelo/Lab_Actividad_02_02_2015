/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_lab020215;
/**
 *
 * @author 8
 */
public class CalcHipotenusa {
    public double Hipotenusa(String co, String ca){
        double h;
        h = Math.sqrt  ((Math.pow(Double.parseDouble(co), 2)+
                Math.pow(Double.parseDouble(ca),2)));
        return h;
    }
}
