public enum Categoria {
    COMIDA("Comida"),
    TRANSPORTE("Transporte"),
    HOGAR("Hogar"),
    OCIO("Ocio"),
    SALUD("Salud"),
    OTROS("Otros");

    private final String nombre;

    Categoria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}