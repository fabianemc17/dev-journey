import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Gasto {
    public static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

    private final double monto;
    private final String concepto;
    private final String lugar;
    private final Categoria categoria;
    private final LocalDate fecha;

    public Gasto(double monto, String concepto, String lugar, Categoria categoria, LocalDate fecha) {
        this.monto = monto;
        this.concepto = concepto;
        this.lugar = lugar;
        this.categoria = categoria;
        this.fecha = fecha;
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

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return String.format("%s | %s - %.2f € (%s) [%s]", fecha.format(FORMATO_FECHA), concepto, monto, lugar, categoria);
    }
}
