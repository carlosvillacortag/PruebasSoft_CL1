package validacion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidacionUsuarioTest {

		//validacion con usuario valido + assertTrue = verdadero
	 	@Test
	    public void testUsuarioValido() {
	        assertTrue(ValidacionUsuario.esUsuarioValido("2023CARLOS"));
	      }

	 	//los siguientes tests usuarios falsos + assertFalse = True
	 	//si se prueba con assertTrue arroja error por las condiciones de la clase ValidacionUsuario.java
	    @Test
	    public void testUsuarioCorto() {
	        assertFalse(ValidacionUsuario.esUsuarioValido("jvc"));
	    }

	    @Test
	    public void testUsuarioLargo() {
	        assertFalse(ValidacionUsuario.esUsuarioValido("carlosAlbertoVillacortaGamarraCibertec"));
	    }

	    @Test
	    public void testUsuarioCaracteresEspeciales() {
	        assertFalse(ValidacionUsuario.esUsuarioValido("carlos_v@gmail.com"));
	        assertFalse(ValidacionUsuario.esUsuarioValido("M@rce10##1"));
	    }

	    @Test
	    public void testUsuarioMinusculas() {
	        assertFalse(ValidacionUsuario.esUsuarioValido("CarlosGamarra"));
	        assertFalse(ValidacionUsuario.esUsuarioValido("MarceLO"));
	    }
	    
	    @Test
	    public void testUsuarioSoloNumeros() {
	        assertFalse(ValidacionUsuario.esUsuarioValido("64435345"));
	        assertFalse(ValidacionUsuario.esUsuarioValido("201411100"));
	    }

}
