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
public class CalcResParalelo {
    public int resParalelo(String r1, String r2, String r3){
        int serie = 1/
                    ((1/Integer.parseInt(r1))+
                    (1/Integer.parseInt(r2))+
                    (1/Integer.parseInt(r3)));
        return serie;
    }
    
}
