public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
        }
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue; //interrompe a iteração que for igual a 3
            
            System.out.println(numero);
        }
    }
}
