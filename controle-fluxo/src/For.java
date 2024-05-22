public class For {
    public static void main(String[] args) {
        //for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
        //{
        // comando que será executado até que a 
        // expressão de validação torne-se falsa 
        //}
        for(int carneirinhos = 0 ; carneirinhos <=20; carneirinhos ++) {
			if (carneirinhos <= 1) {
                System.out.println(carneirinhos + " Carneirinho");
            } else System.out.println(carneirinhos + " Carneirinhos");
		}
        System.out.println("Joãozinho dormiu");
    }
}
