public class TesteReescritaMetodo {
    public static void main(String[] args) {
        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Amarela");
        caminhonete.setModelo("Strada");
        caminhonete.setVelocidadeMaxima(120);
        caminhonete.acelera(100);

        Jipe jipe = new Jipe();
        jipe.setCor("Preta");
        jipe.setModelo("Compass");
        jipe.setVelocidadeMaxima(120);
        jipe.setEh4x4(true);

        /* Embora o jipe tenha a mesma velocidade maxima da caminhonete e mesma aceleracao
        se ele for 4x4
        sua aceleracao e maior em funcao da reescrita do metodo acelera da classe mae Automovel
         */
        jipe.acelera(100);
        System.out.println("A caminhonete acelera: " + caminhonete.getVelocidadeAtual());
        System.out.println("O jipe acelera: " + jipe.getVelocidadeAtual());

    }
}
