package decorador;

public class NotificacionBasica implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("  [Notificación Básica] " + mensaje);
    }
}