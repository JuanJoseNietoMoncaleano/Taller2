package adaptador;

public class AdaptadorPago implements ProcesadorPago {
    private final ServicioPagoExterno servicioExterno;

    public AdaptadorPago(ServicioPagoExterno servicioExterno) {
        this.servicioExterno = servicioExterno;
    }

    @Override
    public void procesarPago(double monto) {
        this.servicioExterno.realizarTransaccion(monto);
    }
}