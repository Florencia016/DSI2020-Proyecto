package Despacho;

import Clases.GuardarDatos;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class testUnitario {
    
    public testUnitario() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testValidarIdVenta() throws Exception {
        System.out.println("validarIdVenta");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.idVentaEsCorrecto();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarNombre() throws Exception {
        System.out.println("validarNombre");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.esNombreValido();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarApellido() throws Exception {
        System.out.println("validarApellido");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.esApellidoValido();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarDNI() throws Exception {
        System.out.println("validarDNI");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.esDniValido();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarDomicilio() throws Exception {
        System.out.println("validarDomicilio");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.esDomicilioValido();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarLocalidad() throws Exception {
        System.out.println("validarLocalidad");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.esLocalidadValida();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarProvincia() throws Exception {
        System.out.println("validarProvincia");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.esProvinciaValida();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarIdProducto() throws Exception {
        System.out.println("validarIdProducto");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.idProductoEsValido();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarNombreProducto() throws Exception {
        System.out.println("validarNombreProducto");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.nombreProductoEsValido();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarMarcaProducto() throws Exception {
        System.out.println("validarMarcaProducto");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.marcaProductoEsValida();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarDescripcionProducto() throws Exception {
        System.out.println("validarDescripcionProducto");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.descripcionProductoEsValida();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarPrecioProducto() throws Exception {
        System.out.println("validarPrecioProducto");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.precioProductoEsValido();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarCantidadProducto() throws Exception {
        System.out.println("validarCantidadProducto");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.cantidadProductoEsValida();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarPrecioTotal() throws Exception {
        System.out.println("validarPrecioTotal");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.precioTotalEsValido();
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarConfirmacionPago() throws Exception {
        System.out.println("validarConfirmacionPago");
        GuardarDatos instance = new GuardarDatos();
        boolean expResult = true;
        boolean result = instance.confirmacionPagoEsValida();
        assertEquals(expResult, result);
    }   

    private void assertEquals(boolean expResult, boolean result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
