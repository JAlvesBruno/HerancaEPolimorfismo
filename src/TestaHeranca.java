public class TestaHeranca {
    public static void main (String[] args) {
        Carro carro = new Carro();
        carro.setCor("Branco");
        carro.setModelo("Uno");
        carro.setVelocidadeMaxima(100);
        carro.setEhConversivel(true);
        carro.ligar();

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Preta");
        caminhonete.setModelo("Strada");
        caminhonete.setVelocidadeMaxima(120);
        caminhonete.setCapacidadeDeCarga(500);
        caminhonete.ligar();

        Jipe jipe = new Jipe();
        jipe.setCor("Bege");
        jipe.setModelo("D6");
        jipe.setVelocidadeMaxima(110);
        jipe.setEh4x4(true);
        jipe.ligar();


    }
}
