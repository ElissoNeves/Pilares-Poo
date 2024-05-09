public class Motocicleta extends Veiculo{
    
    public void ligar(){
        confereCombustivel();
        conferePneu();
        System.out.println("Moto ligada!");
    }

    private void confereCombustivel(){
        System.out.println("Moto: Combustível conferido!");
    }

    private void conferePneu(){
        System.out.println("Moto: Pneu conferido!");
    }
}
