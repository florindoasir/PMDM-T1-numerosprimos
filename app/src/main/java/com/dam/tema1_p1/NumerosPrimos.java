package com.dam.tema1_p1;

import java.util.HashMap;
import java.util.Map;

public class NumerosPrimos {

    private Map<Integer,Integer> primosCalculados;

    public NumerosPrimos() {
        this.primosCalculados = new HashMap<Integer, Integer>();
    }

    public Integer calcularNumeroPrimo(Integer numeroACalcular){
        Integer resultado = 10;
        if(this.primosCalculados.containsKey(numeroACalcular)){
            resultado = this.primosCalculados.get(numeroACalcular);
        }else{
            resultado = numeroACalcular * 7;
            this.primosCalculados.put(numeroACalcular, resultado);
        }
        return resultado;
    }

}
