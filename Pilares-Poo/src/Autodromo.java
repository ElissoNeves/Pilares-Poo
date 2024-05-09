public class Autodromo {
    
    public static void main(String[] args) {
        Carro Ferrari = new Carro();
        Ferrari.setChassi("123456");
        Ferrari.ligar();

        Motocicleta Kawazaki = new Motocicleta();
        Kawazaki.setChassi("456123");
        Kawazaki.ligar();
    }
}
