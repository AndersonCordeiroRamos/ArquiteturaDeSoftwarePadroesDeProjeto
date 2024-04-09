public class App {
    public static void main(String[] args) {
        
        Singleton singleton = Singleton.getInstance("Singleton 1");
        System.out.println(singleton.getValor());

        Singleton outroSingleton = Singleton.getInstance("Singleton 2");
        System.out.println(outroSingleton.getValor()); 
    }
}

