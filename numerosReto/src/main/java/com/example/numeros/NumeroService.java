package com.example.numeros;

import java.util.ArrayList;
import java.util.List;

public class NumeroService {

    public Integer obtenerTotal(Integer n) {
        List<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < n; i++){
            numeros.add(i);
        }

        long cantidadNumerosSin13 = numeros.stream()
                .filter(numero -> !numero.toString().contains("13"))
                .count();

        n = (int) cantidadNumerosSin13;


        return n;
    }
}
