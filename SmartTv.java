    public class SmartTv {
            boolean ligada = true;
            int canal = 1;
            int volume = 25;

            //Parametros no método de mudar o canal 
            public void mudarCanal(int novoCanal) {
                canal = novoCanal;
            }
            public void aumentarCanal() {
                canal++;
            }
            public void diminuirCanal() {
                canal--;
            }

            public void aumentarVolume() {
                volume++;
                System.out.println("Aumentando o volume para: " + volume);
                //volume = volume + 1
                volume++;
            }

            public void diminuirVolume() {
                //volume = volume - 1
                volume--;
            }

            public void ligar() {
                ligada = true;
            }

            public void desligar() {
                ligada = false;
            }
    }