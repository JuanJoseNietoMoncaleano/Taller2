package adaptador;

public class ServicioPagoExterno {
    public void realizarTransaccion(double valor) {
        System.out.println("  [ServicioPagoExterno] Transacción completada con éxito por: $" + valor);
    }
}