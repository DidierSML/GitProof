public class GitProof {

    public static void main(String[] args) {
        System.out.println("- Hola soy una prueba usando Git desde IJ");//1ra

        String newMessage = "- Probando el -PUSH- desde la (rama Local-Master) hacia la (rama Remota Master)";//2da
        System.out.println(newMessage);

        String cl2;
        cl2 = "- Agregando una clase para prueba trabajada desde una (rama derivada de la rama local master -development)";//3ro
        System.out.println(cl2);

        String message = "- Seguimos probando cambios d(rl) -> m(rl), para despues subirlos a master github";//4to
        System.out.println(message);

        String masterLocal = "Cambio realizado directamente en m(rl), no se realizo en d(rl), se usa push para subir a gh";//5to
        System.out.println(masterLocal);
    }



}
