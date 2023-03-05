public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada ? " + smartTV.ligada);
        System.out.println("canal atual : " + smartTV.canal);
        System.out.println("Volume Atual : " + smartTV.volume + "\n");

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume Atual : " + smartTV.volume + "\n");


        smartTV.mudarCanal(13);
        System.out.println("canal atual : " + smartTV.canal + "\n");


        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTV.ligada);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTV.ligada);


    }

}