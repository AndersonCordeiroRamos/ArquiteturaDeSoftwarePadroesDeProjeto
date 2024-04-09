public class ComAcucar {
    private Cafe cafe;

    public ComAcucar(Cafe cafe) {
        this.cafe = cafe;
    }

    public String preparar() {
        return cafe.preparar() + " com açúcar";
    }
}

