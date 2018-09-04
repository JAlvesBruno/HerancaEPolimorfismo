public class Carro extends Automovel {
    private static int quantidadeDeCarros;
    private boolean ehConversivel;
    public static int getQuantidadeDeCarros() {
        return Carro.quantidadeDeCarros;
    }

    public boolean isEhConversivel() {
        return this.ehConversivel;
    }

    public void setEhConversivel(boolean ehConversivel) {
        this.ehConversivel = ehConversivel;
    }
}
