public class Singleton {
  
    private static Singleton instance;
    private String valor;

    private Singleton(String valor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.valor = valor;
    }

    public static Singleton getInstance(String valor) {
        if (instance == null) {
            instance = new Singleton(valor);
        }
        return instance;
    }

    public String getValor() {
        return valor;
    }
}

