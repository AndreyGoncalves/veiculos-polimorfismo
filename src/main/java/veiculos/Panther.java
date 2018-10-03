package veiculos;

public class Panther extends Veiculo implements VeiculoAnfibio, TracaoIntegral, Conversivel {
    private boolean tracaoIntegral;
    private boolean capotaAberta;
    private boolean rodasRecolhidas;
    private int temperaturaRefrigerador;
    private double cap_lastro;

    public Panther(String n) {
        super(n);
        tracaoIntegral = false;
        capotaAberta = false;
        rodasRecolhidas = false;
        temperaturaRefrigerador = 15;
        cap_lastro = 0;
    }

    @Override
    public boolean abrirCapota() {
        if(velocidade_atual == 0) {
            if (capotaAberta) {
                System.out.println("capota já estava aberta do panther " + nome);
                return false;
            } else {
                capotaAberta = true;
                System.out.println("abrindo capota do panther " + nome);
                return true;
            }
        }return false;
    }

    @Override
    public boolean fecharCapota() {
        if (velocidade_atual == 0) {
            if (capotaAberta) {
                System.out.println("fechando capota do panther " + nome);
                capotaAberta = false;
                return true;
            } else {
                System.out.println("capota do panther " + nome + " já estava fechada");
                return false;
            }
        }
        return false;
    }


    @Override
    public boolean ativarDesativarTracao() {
        if(velocidade_atual == 0 && rodasRecolhidas == false) {
            tracaoIntegral = !tracaoIntegral;
            System.out.println("Tração integral do panther: " + nome + " está " + tracaoIntegral);
            return tracaoIntegral;
        }else{
            System.out.println("Não é trocar o estado de tração");
            return false;
        }
    }

    @Override
    public boolean recolherRodas() {
        if (rodasRecolhidas){
            System.out.println("rodas do panther "+ nome+" já estavam recolhidas");
            return false;
        }
        rodasRecolhidas = true;
        esvaziarLastro();
        System.out.println("recolhendo rodas do panther e esvaziando o Lastro"+ nome);
        return true;
    }

    @Override
    public boolean abrirRodas() {
        if (rodasRecolhidas){
            System.out.println("abrindo rodas do panther "+ nome);
            rodasRecolhidas = false;
            return true;
        }
        System.out.println("rodas do panther "+ nome+" já estavam abertas");
        return false;
    }

    @Override
    public void esvaziarLastro() {
        System.out.println("Esvaziando lastro do panther "+ nome);
        cap_lastro=0;
    }

    @Override
    public void frear(int i) {
        velocidade_atual -= i;
        System.out.println("Panther "+ nome+" freando com intensidade " + i);
    }

    @Override
    public void acelerar(int i) {
        velocidade_atual += i;
        System.out.println("Panther "+ nome+"acelerando com intensidade " + i);

    }

    public void setTempRefri(int temperaturaRefrigerador) {
        if ((temperaturaRefrigerador > 0) && (temperaturaRefrigerador < 20)){
            this.temperaturaRefrigerador = temperaturaRefrigerador;
        }
    }
}