package veiculos;


public class Ferrari extends Veiculo implements Conversivel {

    private boolean capotaAberta;
    private boolean farolNeblina;

    public Ferrari(String n) {
        super(n);
        capotaAberta = false;
        farolNeblina = false;
    }

    @Override
    public boolean abrirCapota() {
        if (velocidade_atual < 20) {
            if (capotaAberta) {
                System.out.println("capota já estava aberta da ferrari " + nome);
                return false;
            } else {
                capotaAberta = true;
                System.out.println("abrindo capota da ferrari " + nome);
                return true;
            }
        } else {
            System.out.println("velocidade maior que 20Km/h");
            return false;
        }
    }
    @Override
    public boolean fecharCapota(){
        if(velocidade_atual < 20) {
            if (capotaAberta) {
                System.out.println("fechando capota da ferrari " + nome);
                capotaAberta = false;
                return true;
            } else {
                System.out.println("capota da ferrari " + nome + " já estava fechada");
                return false;
            }
        }else return false;
    }

    @Override
    public void frear(int i) {
        velocidade_atual -= i;

        System.out.println("Ferrari "+ nome+" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        System.out.println("Ferrari "+ nome + " acelerando com intensidade " + i);
        velocidade_atual += i;
    }

    public boolean ligarFarolNeblina(){
        if (farolNeblina){
            System.out.println("Farol já estava ligado da ferrari " + nome);
            return false;
        }
        System.out.println("Ligando farol de neblina da ferrari " + nome);
        farolNeblina = true;
        return true;
    }
}