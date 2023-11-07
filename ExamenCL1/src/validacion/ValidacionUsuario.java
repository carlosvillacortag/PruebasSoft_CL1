package validacion;

public class ValidacionUsuario {
	
	//longitud minimo 6
    private static int TamanioMin =6;
    //longitud maxima 25
    private static int TamanioMax =25;
    //caracteres validos
    private static String Permitidos ="^[A-Z0-9]+$";
    //caracteres tipo letra en minuscula
    private static String Minusculas = ".*[a-z].*";
    //caracteres solo numeros
    private static String Numeros ="[0-9]+";
    

    public static boolean esUsuarioValido(String usuario) {
        int tamanio = usuario.length();

        if (tamanio < TamanioMin || tamanio > TamanioMax) {
            return false;
        }

        if (!usuario.matches(Permitidos)) {
            return false;
        }

        if (usuario.matches(Minusculas)) {
            return false;
        }
        
        if (usuario.matches(Numeros)) {
            return false;
        }

        return true;
    }
}
