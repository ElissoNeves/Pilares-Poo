public class Carro extends Veiculo {
    
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado!\n");
    }

    public void confereCambio (){
        System.out.println("Crro: Câmbio conferido!");
    }

    private void confereCombustivel() {
        System.out.println("Carro: Combustível conferido!");
    }
}
