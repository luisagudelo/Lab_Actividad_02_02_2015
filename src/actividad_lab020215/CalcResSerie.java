/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_lab020215;

/**
 *
 * @author 12
 */
public class CalcResSerie {
    public int resSerie(String res1, String res2, String res3){
        int serie = Integer.parseInt(res1)+
                    Integer.parseInt(res2)+
                    Integer.parseInt(res3);
        return serie;
    }
}
