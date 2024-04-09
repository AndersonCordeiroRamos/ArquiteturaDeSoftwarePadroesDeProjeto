public class App {
    public static void main(String[] args) {
        Carro carro = new Carro.CarroBuilder()
            .setMarca("Ford")
            .setModelo("Mustang")
            .setAno(2023)
            .setCor("Vermelho")
            .build();

        
        System.out.println(carro.toString());
    }
}



