public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - TV Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status - Volume Atual : " + smartTv.volume);

        smartTv.escolherCanal(10);
        smartTv.diminuirCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo Status - Canal Atual : "  + smartTv.canal);


    }
}
