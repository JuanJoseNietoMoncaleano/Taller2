package proxy;

public interface ServicioInventario {
    boolean verificarStock(String producto, int cantidad);
}