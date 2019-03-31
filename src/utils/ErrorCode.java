/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Map;

/**
 *
 * @author gbarron
 */
public enum ErrorCode {
    
    DATA_TOO_LONG(1406, "DATO DEMASIADO LARGO"),
    ER_BAD_NULL_ERROR(10148, "LA COLUMNA NO PUEDE SER NULA");
    
    private static Map<Integer, ErrorCode> valorTexto;

    private final Integer value;
    private final String texto;

    private ErrorCode(Integer value, String texto) {
        this.value = value;
        this.texto = texto;
    }

    public Integer getValue() {
        return value;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return "ErrorCode{" + "value=" + value + ", texto=" + texto + '}';
    }
    
    
    
}
