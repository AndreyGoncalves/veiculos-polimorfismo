package veiculos;

public class Pampa extends Veiculo implements TracaoIntegral {

    private boolean cacambaFechada;
    private boolean tracaoIntegral;

    public Pampa(String n) {
        super(n);
        cacambaFechada = true;
        tracaoIntegral = false;
    }

    @Override
    public boolean ativarDesativarTracao() {
        if(velocidade_atual==0) {
            tracaoIntegral = !tracaoIntegral;
            System.out.println("Tração integral da pampa: " + nome + " está : " + tracaoIntegral);
            return tracaoIntegral;
        }
        System.out.println("Não foi possível Ativar/Desativar a tração: " + tracaoIntegral);
        return false;
    }

    @Override
    public void frear(int i) {
        velocidade_atual -= i;

        System.out.println("Pampa "+ nome +" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        velocidade_atual += i;

        System.out.println("Pampa "+ nome+" acelerando com intensidade " + i);
    }

    public boolean abrirCacamba(){
        if(velocidade_atual == 0) {
            if (cacambaFechada) {
                System.out.println("Abrindo caçamba da pampa " + nome);
                cacambaFechada = false;
                return true;
            }else{
                System.out.println("Caçamba já estava aberta da pampa "+ nome);
            }
            return false;

        }else{
            System.out.println("Não é possível abrir a cacamba com o carro em movimento ");
            return false;
        }

    }


}