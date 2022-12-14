package LanchoneteTresLanches;

public class Lanche extends Prato {

    //privado porque não terá mais subclasses
    private String pao;
    private String recheio;
    private String molho;

    public Lanche(String nome, double preco, String dataValidade, double peso,
                String pao, String recheio, String molho) {
        super(nome, preco, dataValidade, peso);
        this.pao = pao;
        this.recheio = recheio;
        this.molho = molho;
    }

    //informações do super mais desta classe
    @Override
    public String toString() {
        return "Lanche = " + super.toString()
                    + ", pao = " + this.pao
                    + ", recheio = " + this.recheio
                    + ", molho = " + this.molho + "\n";
    }
}
