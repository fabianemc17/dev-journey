public class Gasto {
    private final double monto;
    private final String concepto;
    private final String lugar;

    public Gasto(double monto, String concepto, String lugar) {
        this.monto = monto;
        this.concepto = concepto;
        this.lugar = lugar;
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

    @Override
    public String toString() {
        return String.format("%s - %.2f € (%s)", concepto, monto, lugar);
    }
}
