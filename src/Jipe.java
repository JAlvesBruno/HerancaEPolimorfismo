public class Jipe extends Automovel {
    private boolean eh4x4;

    @Override
    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;

        if(eh4x4) {
            novaVelocidade = novaVelocidade + (novaVelocidade*0.1);
        }


        if(verificaVelocidadeMaxima(velocidade)) {
            this.velocidadeAtual = novaVelocidade;
        } else {
            this.velocidadeAtual = velocidadeMaxima;
        }


    }

    // Para booleanos ao invés de get usar is
    public boolean isEh4x4() {
        return eh4x4;
    }


    public void setEh4x4(boolean eh4x4) {
        this.eh4x4 = eh4x4;
    }
}
