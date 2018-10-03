package veiculos;

public abstract class Veiculo {
    protected String nome;
    protected float velocidade_atual;

    public Veiculo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(float velocidade_atual) {
        this.velocidade_atual = velocidade_atual;
    }
}
