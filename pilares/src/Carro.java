public class Carro extends Veiculo {
    public void ligar(){
        /* Encapusular os métodos */
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("conferindo cambio em P");
    }
}
