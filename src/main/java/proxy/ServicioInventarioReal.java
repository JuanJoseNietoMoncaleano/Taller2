package proxy;

public class ServicioInventarioReal implements ServicioInventario {
    @Override
    public boolean verificarStock(String producto, int cantidad) {
        System.out.println("  [Inventario Real] Stock confirmado: " + cantidad + " unidad(es) de " + producto + ".");
        return true;
    }
}