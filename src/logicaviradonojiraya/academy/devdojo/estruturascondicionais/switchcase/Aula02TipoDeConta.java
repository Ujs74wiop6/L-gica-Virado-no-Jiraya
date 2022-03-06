package logicaviradonojiraya.academy.devdojo.estruturascondicionais.switchcase;

/**
 *
 * @author Fabricio
 */
public class Aula02TipoDeConta {

    public static void main(String[] args) {
        String conta = "CONTA_CORRENTE";
        switch (conta) {
            case "CONTA_POUPANÇA":
                System.out.println("0.05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1%");
                break;
                default: 
        } 
    }
}
