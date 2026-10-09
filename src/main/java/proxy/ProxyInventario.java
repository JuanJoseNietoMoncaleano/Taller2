package proxy;

public class ProxyInventario implements ServicioInventario {
    private final ServicioInventarioReal inventarioReal;
    private final boolean usuarioAutorizado;

    public ProxyInventario(boolean usuarioAutorizado) {
        this.inventarioReal = new ServicioInventarioReal();
        this.usuarioAutorizado = usuarioAutorizado;
    }

    @Override
    public boolean verificarStock(String producto, int cantidad) {
        System.out.println("  [Proxy Inventario] Verificando permisos de acceso al servicio...");
        if (!usuarioAutorizado) {
            System.out.println("  [Proxy Inventario ERROR] Acceso denegado: Usuario no autorizado para consultar inventario.");
            return false;
        }
        return inventarioReal.verificarStock(producto, cantidad);
    }
}