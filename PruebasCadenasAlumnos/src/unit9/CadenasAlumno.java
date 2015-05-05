/*
 *
 * Diseño de Aplicaciones Multiplataforma - Semipresencial Grupo B.
 * Ejercicios Tema 5 de Entornos de Desarrollo - Cadenas Alumno
 */
package unit9;

import static java.lang.System.out;
import java.util.ArrayList;

/**
 * La clase CadenaAlumno implementa los principales métodos de la clase String,
 * pero en este caso sin emplear los métodos propios de la clase. Se procesan
 * las cadenas carácter a carácter. El único método empleado es el que devuelve
 * la longitud de la cadena.
 *
 * @author Antonio Meseguer Giménez
 * @date 18-feb-2015
 */
public class CadenasAlumno {

    /**
     * Constructor por defecto clase CadenasAlumno.
     */
    public CadenasAlumno() {

    }

    /**
     * Método sonIguales: Compara las cadenas caracter a caracter.
     *
     * @param cadena1
     * @param cadena2
     * @return true si son iguales, false si no lo son.
     */
    public boolean sonIguales(String cadena1, String cadena2) {

        boolean iguales = true;

        if (cadena1.length() != cadena2.length()) {
            return false;
        } else {
            for (int i = 0; i < cadena1.length(); i++) {
                if (cadena1.charAt(i) != cadena2.charAt(i)) {
                    iguales = false;
                }
            }
            return iguales;
        }
    }

    /**
     * Método esMayor: Compara el valor de los caracteres correspondiente a la
     * tabla ASCII.
     *
     * @param cadena1
     * @param cadena2
     * @return true si la primera es mayor, false lo es la primera.
     */
    public boolean esMayor(String cadena1, String cadena2) {

        int i = 0;
        int min = Math.min(cadena1.length(), cadena2.length());     
        while (i < min) {
            if (cadena1.charAt(i) < cadena2.charAt(i)) {
                return true;
            } else if (cadena1.charAt(i) > cadena2.charAt(i)) {
                return false;
            } else {
                i++;
            }
        }
        return false;
    }

    /**
     * Método esMenor: Compara el valor de los caracteres correspondiente a la
     * tabla ASCII.
     *
     * @param cadena1
     * @param cadena2
     * @return true si la cadena1 es menor, false si lo es cadena2.
     */
    public boolean esMenor(String cadena1, String cadena2) {

        int i = 0;
        int min = Math.min(cadena1.length(), cadena2.length());     
        
        while (i < min) {
            if (cadena1.charAt(i) > cadena2.charAt(i)) {
                return true;
            } else if (cadena1.charAt(i) < cadena2.charAt(i)) {
                return false;
            } else {
                i++;
            }
        }
        return false;
    }

    /**
     * Metodo comparaIgnorandoMayusculas: Realiza la comparación commo en casos
     * anteriores pero ignorando si son mayúsculas o minúsculas.
     *
     * @param cadena1
     * @param cadena2
     * @return true si es mayor cadena1, false si lo es cadena2
     */
    public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2) {

        
        int i = 0;
        String cadenaConv1;
        String cadenaConv2;
        boolean minuscula;
        int num;
        int min = Math.min(cadena1.length(), cadena2.length());     
        
        cadenaConv1 = convertirMayusculas(cadena1);
        cadenaConv2 = convertirMayusculas(cadena2);

        while (i < min) {
            if (cadenaConv1.charAt(i) < cadenaConv2.charAt(i)) {
                return true;
            } else if (cadenaConv1.charAt(i) > cadenaConv2.charAt(i)) {
                return false;
            } else {
                i++;
            }
        }
        return false;
    }

    /**
     * Método remplazaTodos: Reemplaza todas las ocurrencias del String regla
     * por el String cambio.
     *
     * @param cadena
     * @param regla
     * @param cambio
     * @return cadena modificada.
     */
    public String reemplazaTodos(String cadena, String regla, String cambio) {

        String cadenaModificada = "";
        boolean coincide;
        int limite = cadena.length() - (regla.length() - 1);

        for (int i = 0; i < limite; i++) {
            coincide = true;
            for (int j = 0; j < regla.length(); j++) {
                if (cadena.charAt(i + j) != regla.charAt(j)) {
                    coincide = false;
                }
            }
            if (coincide) {
                for (int k = 0; k < cambio.length(); k++) {
                    cadenaModificada += cambio.charAt(k);
                }
                i += regla.length() - 1;
            } else {

                cadenaModificada += cadena.charAt(i);
            }
        }
        if (cadena.length() != cadenaModificada.length()) {
            for (int i = (cadena.length() - (regla.length() - 1)); i < cadena.length(); i++) {
                cadenaModificada += cadena.charAt(i);
            }
        }
        return cadenaModificada;
    }
    
    
    
    
    /**
     * Método reemplazaPrimero: En este caso solo reemplaza la primera
     * ocurrencia de regla, por el String cambio.
     *
     * @param cadena
     * @param regla
     * @param cambio
     * @return la cadena modificada.
     */
    public String reemplazaPrimero(String cadena, String regla, String cambio) {

        String cadenaModificada = "";
        boolean coincide, cambiado;
        cambiado = false;
        for (int i = 0; i < cadena.length() - (regla.length() - 1); i++) {
            coincide = true;
            for (int j = 0; j < regla.length(); j++) {
                if (cadena.charAt(i + j) != regla.charAt(j)) {
                    coincide = false;
                }
            }
            if (coincide && !cambiado) {
                for (int k = 0; k < cambio.length(); k++) {
                    cadenaModificada += cambio.charAt(k);
                }
                cambiado = true;
            } else {
                cadenaModificada += cadena.charAt(i);
            }
        }
        return cadenaModificada;
    }

    /**
     * Método muestraSplitLimite: Muetra por pantalla, fragmentos de cadena
     * delimitados por el String regla, el númeto de veces marcado por limite.
     *
     * @param cadena
     * @param regla
     * @param limite
     */
    public void muestraSplitLimite(String cadena, String regla, int limite) {

        String cadenaModificada = "";
        boolean coincide;

        for (int i = 0; i < cadena.length() - (regla.length() - 1); i++) {
            coincide = true;
            for (int j = 0; j < regla.length(); j++) {
                if (cadena.charAt(i + j) != regla.charAt(j)) {
                    coincide = false;
                }
            }
            if (coincide && limite > 1) {
                out.println(cadenaModificada);
                cadenaModificada = "";
                limite--;
            } else {

                cadenaModificada += cadena.charAt(i);
            }
        }
        out.println(cadenaModificada);
    }

    /**
     * Método muestraSplit: Muestra por pantalla todos los fragmentos de cadena
     * delimitados por regla.
     *
     * @param cadena
     * @param regla
     */
    public void muestraSplit(String cadena, String regla) {

        String cadenaModificada = "";
        boolean coincide;

        for (int i = 0; i < cadena.length() - (regla.length() - 1); i++) {
            coincide = true;
            for (int j = 0; j < regla.length(); j++) {
                if (cadena.charAt(i + j) != regla.charAt(j)) {
                    coincide = false;
                }
            }
            if (coincide) {
                out.println(cadenaModificada);
                cadenaModificada = "";
            } else {
                cadenaModificada += cadena.charAt(i);
            }
        }
        out.println(cadenaModificada);
    }

    /**
     * Método convertirMayusculas: Convierte a mayúscula la cadena introducida
     * como argumento, modificando el valor de cada caracter, segun tabla ASCII.
     *
     * @param cadena
     * @return cadena convertida a mayúsculas.
     */
    public String convertirMayusculas(String cadena) {

        String cadenaConv = "";
        boolean minuscula;
        int num;

        for (int i = 0; i < cadena.length(); i++) {
            minuscula = cadena.charAt(i) > 96 && cadena.charAt(i) < 123;
            if (minuscula) {
                num = cadena.charAt(i) - 32;
                cadenaConv += (char) num;
            } else {
                cadenaConv += cadena.charAt(i);
            }
        }
        return cadenaConv;
    }

    /**
     * Método convertirMinusculas: Convierte a minúsculas la cadena introducida
     * como argumento, modificando el valor de cada caracter, según tabla ASCII.
     *
     * @param cadena
     * @return cadena convertida a minúsculas.
     */
    public String convertirMinusculas(String cadena) {

        String cadenaConv = "";
        boolean mayuscula;
        int num;

        for (int i = 0; i < cadena.length(); i++) {
            mayuscula = cadena.charAt(i) > 64 && cadena.charAt(i) < 91;
            if (mayuscula) {
                num = cadena.charAt(i) + 32;
                cadenaConv += (char) num;
            } else {
                cadenaConv += cadena.charAt(i);
            }
        }
        return cadenaConv;
    }

    /**
     * Método quitaEspacios: Elimina los espacios iniciales y/o finales de la
     * cadena introducida como argumento
     *
     * @param cadena
     * @return cadena sin espacios al principio o al final.
     */
    public String quitaEspacios(String cadena) {

        String cadenaSinBlancos = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                cadenaSinBlancos += cadena.charAt(i);
            }
        }
        return cadenaSinBlancos;
    }

    /**
     * Método longuitudCadena: Devuleve un entero long, con la cantidad de la
     * cadena introducida como argumento
     *
     * @param cadena
     * @return longuitud de la cadena
     */
    public long longitudCadena(String cadena) {

        return cadena.length();
    }

    /**
     * Método empiezaCon: Comprueba si cadena comienza por prefijo.
     *
     * @param cadena
     * @param prefijo
     * @return true si es cierto, false si no lo es.
     */
    public boolean empiezaCon(String cadena, String prefijo) {

        boolean coincide = true;

        if (cadena.length() < prefijo.length()) {
            return false;
        }
        for (int i = 0; i < prefijo.length(); i++) {
            if (cadena.charAt(i) != prefijo.charAt(i)) {
                coincide = false;
            }
        }
        return coincide;
    }

    /**
     * Método acabaEn: Comprueba si cadena acaba por sufijo.
     *
     * @param cadena
     * @param sufijo
     * @return true si es cierto, false si no lo es.
     */
    public boolean acabaEn(String cadena, String sufijo) {

        boolean coincide = true;

        if (cadena.length() < sufijo.length()) {
            return false;
        }
        for (int i = cadena.length()-sufijo.length(); i < cadena.length()-1; i++) {
            coincide = true;
            for (int j = 0; j < sufijo.length(); j++) {
                if (cadena.charAt(i + j) != sufijo.charAt(j)) {
                    coincide = false;
                }
            }
        }
        return coincide;
    }
    

    /**
     * Método poscion primeraCadena: Devuelve la posicion de la primera
     * ocurrencia de la cadena letra
     *
     * @param cadena
     * @param letra
     * @return un entero tipo long.
     */
    public long posicionPrimeraCadena(String cadena, String letra) {

        boolean coincide = true;

        for (int i = 0; i < cadena.length() - (letra.length() - 1); i++) {
            for (int j = 0; j < letra.length(); j++) {
                if (cadena.charAt(i + j) != letra.charAt(j)) {
                    coincide = false;
                }
            }
            if (coincide) {
                return i;
            } else {
                coincide = true;
            }
        }
        return -1;
    }

    /**
     * Método extraerSubtring: Extrae fragmento de cadena, a partir de
     * posicionInicio.
     *
     * @param cadena
     * @param posicionInicio
     * @return String con el fragmento de cadena.
     */
    public String extraerSubstring(String cadena, int posicionInicio) {

        String substring = "";

        for (int i = posicionInicio + 1; i < cadena.length(); i++) {
            substring += cadena.charAt(i);
        }
        return substring;
    }

    /**
     * Método extraerSubstring: Extrae fragmento de cadena, a partir de
     * posicionInicio hasta posicionFinal.
     *
     * @param cadena
     * @param posicionInicio
     * @param posicionFinal
     * @return Sting con el fragmento de cadena.
     */
    public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal) {

        String substring = "";

        if (posicionFinal > cadena.length()) {
            System.err.println("Error: La posicion final excede la longitud de la cadena.");
            posicionFinal = cadena.length();
        }
        for (int i = posicionInicio + 1; i < posicionFinal; i++) {
            substring += cadena.charAt(i);
        }
        return substring;
    }

    /**
     * Método concatenaCadenas: Une las dos cadenas introducidas como argumento.
     *
     * @param cadena1
     * @param cadena2
     * @return String con cadena1+cadena2.
     */
    public String concatenaCadenas(String cadena1, String cadena2) {

        String cadenaConcatenada = "";

        for (int i = 0; i < cadena1.length(); i++) {
            cadenaConcatenada += cadena1.charAt(i);
        }
        for (int i = 0; i < cadena2.length(); i++) {
            cadenaConcatenada += cadena2.charAt(i);
        }
        return cadenaConcatenada;
    }

    public static void main(String[] args) {
        String cadena1 = "Entornos";
        String cadena2 = "desarrollo";
        boolean resultado;
        CadenasAlumno miCadena = new CadenasAlumno();
        System.out.println(miCadena.acabaEn(cadena1, "os"));
        
    }
}
