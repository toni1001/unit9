/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import unit5.CadenasAlumno;

/**
 *
 * @author Antonio
 */
public class CadenasAlumnoTest {
    
    /**
     * Test of sonIguales method, of class CadenasAlumno.
     */
    @Test
    public void testSonIgualesA() {
        System.out.println("sonIguales caso a)");
        String cadena1 = "entornos";
        String cadena2 = "ento";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = cadena1.equals(cadena2);
        boolean result = instance.sonIguales(cadena1, cadena2);
        assertEquals(expResult, result);
    }
    @Test
    public void testSonIgualesB() {
        System.out.println("sonIguales caso b)");
        String cadena1 = "ento";
        String cadena2 = "entornos";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = cadena1.equals(cadena2);
        boolean result = instance.sonIguales(cadena1, cadena2);
        assertEquals(expResult, result);
    }
    @Test
    public void testSonIgualesC() {
        System.out.println("sonIguales caso c)");
        String cadena1 = "entornos";
        String cadena2 = "sonrotne";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = cadena1.equals(cadena2);
        boolean result = instance.sonIguales(cadena1, cadena2);
        assertEquals(expResult, result);
    }
    @Test
    public void testSonIgualesD() {
        System.out.println("sonIguales caso d)");
        String cadena1 = "entornos";
        String cadena2 = "entornos";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = cadena1.equals(cadena2);
        boolean result = instance.sonIguales(cadena1, cadena2);
        assertEquals(expResult, result);
    }
   /**
     * Test of esMayor method, of class CadenasAlumno.
     */
    /*
    @Test
    public void testEsMayor() {
        System.out.println("esMayor");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.esMayor(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esMenor method, of class CadenasAlumno.
     */ /*
    @Test
    public void testEsMenor() {
        System.out.println("esMenor");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.esMenor(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparaIgnorandoMayusculas method, of class CadenasAlumno.
     */ /*
    @Test
    public void testComparaIgnorandoMayusculas() {
        System.out.println("comparaIgnorandoMayusculas");
        String cadena1 = "";
        String cadena2 = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.comparaIgnorandoMayusculas(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reemplazaTodos method, of class CadenasAlumno.
     */ /*
    @Test
    public void testReemplazaTodos() {
        System.out.println("reemplazaTodos");
        String cadena = "";
        String regla = "";
        String cambio = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.reemplazaTodos(cadena, regla, cambio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reemplazaPrimero method, of class CadenasAlumno.
     */ /*
    @Test
    public void testReemplazaPrimero() {
        System.out.println("reemplazaPrimero");
        String cadena = "";
        String regla = "";
        String cambio = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.reemplazaPrimero(cadena, regla, cambio);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
   
    /**
     * Test of convertirMayusculas method, of class CadenasAlumno.
     */ /*
    @Test
    public void testConvertirMayusculas() {
        System.out.println("convertirMayusculas");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.convertirMayusculas(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirMinusculas method, of class CadenasAlumno.
     */ /*
    @Test
    public void testConvertirMinusculas() {
        System.out.println("convertirMinusculas");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.convertirMinusculas(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitaEspacios method, of class CadenasAlumno.
     */ /*
    @Test
    public void testQuitaEspacios() {
        System.out.println("quitaEspacios");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        String expResult = "";
        String result = instance.quitaEspacios(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longitudCadena method, of class CadenasAlumno.
     */ /*
    @Test
    public void testLongitudCadena() {
        System.out.println("longitudCadena");
        String cadena = "";
        CadenasAlumno instance = new CadenasAlumno();
        long expResult = 0L;
        long result = instance.longitudCadena(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of empiezaCon method, of class CadenasAlumno.
     */ /*
    @Test
    public void testEmpiezaCon() {
        System.out.println("empiezaCon");
        String cadena = "";
        String prefijo = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.empiezaCon(cadena, prefijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acabaEn method, of class CadenasAlumno.
     */ /*
    @Test
    public void testAcabaEn() {
        System.out.println("acabaEn");
        String cadena = "";
        String sufijo = "";
        CadenasAlumno instance = new CadenasAlumno();
        boolean expResult = false;
        boolean result = instance.acabaEn(cadena, sufijo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posicionPrimeraCadena method, of class CadenasAlumno.
     */ /*
    @Test
    public void testPosicionPrimeraCadena() {
        System.out.println("posicionPrimeraCadena");
        String cadena = "";
        String letra = "";
        CadenasAlumno instance = new CadenasAlumno();
        long expResult = 0L;
        long result = instance.posicionPrimeraCadena(cadena, letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
}
