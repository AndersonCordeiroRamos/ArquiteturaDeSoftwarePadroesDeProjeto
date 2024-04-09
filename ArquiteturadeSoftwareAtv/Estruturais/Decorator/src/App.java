public class App {
    public static void main(String[] args) {
        ComAcucar cafeComAcucar = new ComAcucar(new Cafe());
        System.out.println(cafeComAcucar.preparar()); 
    }
}

