/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;


public enum TipoTarjeta {
    Visa("Visa"),
    Mastercard("Master Card");
    private String TipoTarjeta;
    
    public String getTipoTarjeta() {
        return TipoTarjeta;
    }
    
    private TipoTarjeta(String tipoTarjeta){
    TipoTarjeta = tipoTarjeta;
    }
}
