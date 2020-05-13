
package view;

import negocio.CamaraTermica;

/**
 *
 * @author dreis
 */
public class Principal {

    public static void main(String[] args) {
        CamaraTermica objCamaraFria = new CamaraTermica(-8, -3);
        
        System.out.println(String.format("Temperatura de operação de câmara fria: \n" +
                "min: %.2fºC; máx: %.2fºC\nmin: %.2fºF; máx: %.2fºF",
                objCamaraFria.getTemperaturaMinima().getGrausCelsius(),
                objCamaraFria.getTemperaturaMaxima().getGrausCelsius(),
                objCamaraFria.getTemperaturaMinima().getGrausFahrenheit(),
                objCamaraFria.getTemperaturaMaxima().getGrausFahrenheit()));
        
    }
    
}
