import java.util.ArrayList;

public class GestorGastos {

    private final ArrayList<Gasto> gastos = new ArrayList<>();

    public void agregar(Gasto gasto) {
        gastos.add(gasto);
    }

    public boolean estaVacio() {
        return gastos.isEmpty();
    }

    public ArrayList<Gasto> obtenerGastos() {
        return new ArrayList<>(gastos);
    }

    public double calcularTotal() {
        double total = 0;
        for (Gasto gasto : gastos) {
            total += gasto.getMonto();
        }
        return total;
    }

    public double calcularPromedio() {
        if (gastos.isEmpty()) {
            return 0;
        }
        return calcularTotal() / gastos.size();
    }

    public Gasto obtenerMasAlto() {
        if (gastos.isEmpty()) {
            return null;
        }

        Gasto mayor = gastos.get(0);
        for (Gasto gasto : gastos) {
            if (gasto.getMonto() > mayor.getMonto()) {
                mayor = gasto;
            }
        }
        return mayor;
    }
}