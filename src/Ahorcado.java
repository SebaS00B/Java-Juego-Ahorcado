import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String palabraSecreta = "ecuador";

        int intentosMaximos = 5;
        int intentos = 0;
        boolean palabraAdivinada= false;
    
        char[] letraAdivinadas= new char[palabraSecreta.length()];

        for (int i = 0; i < letraAdivinadas.length; i++) {
            letraAdivinadas[i] = '_';
        } 
        
        while (!palabraAdivinada && intentos < intentosMaximos ) {
            System.out.println("Bienvenido al juego del Ahorcado");
            System.out.println("Listo, advina la palabra:  "+ String.valueOf(letraAdivinadas)+" ("+ palabraSecreta.length()+ " "+ "letras)");
            System.out.println("Introduce una letra por favor: ");

            char letra = Character.toLowerCase(teclado.next().charAt(0));
            boolean letraCorrecta = false; 
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i)== letra) {
                    letraAdivinadas[i]= letra;  
                    letraCorrecta= true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra Incorrecta, te quedan "+(intentosMaximos - intentos) + " intentos");
            }

            if(String.valueOf(letraAdivinadas).equals(palabraSecreta)){
                palabraAdivinada=true;
                System.out.println("Felicidades, Ganaste, Adivinaste la palabra secreta es :  "+ palabraSecreta);
                
            }
    }
     if (!palabraAdivinada) {
        System.out.println("Te has quedado sin intentos, GAME OVER ");
     }

     teclado.close();
}
}
