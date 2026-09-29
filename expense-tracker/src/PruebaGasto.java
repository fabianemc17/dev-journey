public class PruebaGasto {
    public static void main(String[] args) {
        Gasto compra = new Gasto(45.30, "Compra semanal", "Lidl");
        Gasto cafe = new Gasto(3.50, "Café", "Aeropuerto");
        Gasto ropa = new Gasto(45.90, "Ropa de futbol", "Decathlon");

        System.out.println(compra);
        System.out.println(cafe);
        System.out.println(ropa);
        System.out.println(ropa.getLugar());
        System.out.println(ropa.getConcepto());
        System.out.println(ropa.getMonto());
    }
}

