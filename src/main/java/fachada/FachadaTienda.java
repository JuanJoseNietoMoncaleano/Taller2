package fachada;

import adaptador.ProcesadorPago;
import decorador.Notificacion;
import proxy.ServicioInventario;


public class FachadaTienda {
    private final ServicioInventario inventario;
    private final ProcesadorPago procesadorPago;
    private final Notificacion servicioNotificacion;

    public FachadaTienda(ServicioInventario inventario,
                         ProcesadorPago procesadorPago,
                         Notificacion servicioNotificacion) {
        this.inventario = inventario;
        this.procesadorPago = procesadorPago;
        this.servicioNotificacion = servicioNotificacion;
    }

    public boolean realizarCompra(String producto, int cantidad, double monto) {
        System.out.println("\n========== PROCESANDO COMPRA: " + producto + " ==========");


        if (!inventario.verificarStock(producto, cantidad)) {
            System.out.println("No fue posible completar la compra. Error en inventario.");
            return false;
        }


        procesadorPago.procesarPago(monto);


        servicioNotificacion.enviar("Compra confirmada para: " + cantidad + "x " + producto);

        System.out.println("========== COMPRA COMPLETADA CON ÉXITO ==========\n");
        return true;
    }
}