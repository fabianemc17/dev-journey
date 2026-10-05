public class Gasto {
    private final double monto;
    private final String concepto;
    private final String lugar;
    private final Categoria categoria;

    public Gasto(double monto, String concepto, String lugar, Categoria categoria) {
        this.monto = monto;
        this.concepto = concepto;
        this.lugar = lugar;
        this.categoria = categoria;
    }

    public double getMonto() {
        return monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public String getLugar() {
        return lugar;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f € (%s) [%s]", concepto, monto, lugar, categoria);
    }
}
