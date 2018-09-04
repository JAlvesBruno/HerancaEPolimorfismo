public class TestaPolimorfismo {

    public static void main(String[] args) {

        /*
        Jipe jipe = new Jipe();
        jipe.setCor("Preta");
        jipe.setModelo("Compass");
        jipe.setVelocidadeMaxima(120);
        jipe.setEh4x4(true);

        // E possivel guardar na variavel da classe mae uma instancia filha
        Automovel automovel = jipe;


        jipe.acelera(100);
        System.out.println("Jipe: ");
        System.out.println("V - atual: " + jipe.getVelocidadeAtual());

        automovel.acelera(100);
        System.out.println("Automovel: ");
        System.out.println("- V atual: " + automovel.getVelocidadeAtual());
        */

        Automovel[] frota = new Automovel[3];
        Jipe jipe = new Jipe();
        jipe.setCor("branco");
        jipe.setModelo("Compass");
        jipe.setVelocidadeMaxima(120);
        jipe.setEh4x4(true);

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Preta");
        caminhonete.setModelo("Strada");
        caminhonete.setVelocidadeMaxima(140);

        Carro carro = new Carro();
        carro.setCor("amarelo");
        carro.setModelo("bmw");
        carro.setVelocidadeMaxima(300);

        frota[0] = jipe;
        frota[1] = caminhonete;
        frota[2] = carro;

        for(Automovel automovel: frota) {
            automovel.acelera(100);
            System.out.println("Automovel " + automovel.getModelo());
            System.out.println("- Velocidade: " + automovel.getVelocidadeAtual());
            System.out.println();

        }






    }
}
