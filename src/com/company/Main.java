package com.company;

import DatosDe

public class Main {

    public static void main(String[] args) {
        DatosDeEntrada unaConsola = FactoriaDeEntrada.get(1);
        unaConsola.intruducirDatos();

        DatosDeSalida unaventana = FactoriasSalida.getProductoSalida(2);
        unaventana.visualizar();

        DatosDeSalida misalidat;
    }
}
