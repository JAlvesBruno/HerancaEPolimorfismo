/* Automovel esta no topo da herança
   Abaixo do automovel tem o Carro, Jipe e Caminhonete
 */
public class Automovel {
    private String cor;
    private String modelo;
    /* proteger variavel: encapsular */
    /* Encapsular é só mostrar os métodos para quem se utiliza da classe */
    /* Isso se chama interface da classe */
    /* Atributos e corpo dos métodos ninguém consegue ver fora da classe */
    /* Isso faz parte da implementação */
    protected double velocidadeAtual;
    protected double velocidadeMaxima;

    public Automovel(String cor, String modelo, double velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        System.out.println("Criando um automovel.");
    }

    /* Posso ter mais de um construtor */
    public Automovel() {
        System.out.println("Criando um automovel.");
    }

    public void ligar() {
        System.out.println("automovel ligado");
    }

    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;
        if(verificaVelocidadeMaxima(velocidade)) {
            this.velocidadeAtual = novaVelocidade;
        } else {
            this.velocidadeAtual = velocidadeMaxima;
        }
    }

    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /* protected: pode reutilizar o metodo nas classes filhas */
    protected boolean verificaVelocidadeMaxima(double velocidade) {
        return velocidade < velocidadeMaxima;
    }



}
