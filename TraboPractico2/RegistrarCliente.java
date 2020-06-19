package trabajopractico2;
import java.util.ArrayList;

public class RegistrarCliente {

    public static ArrayList<Cliente> clientes = new ArrayList();

    public void RegistroCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void MostrarCliente() {
        for (Cliente clien : clientes) {
            System.out.print("- " + clien.getNombre() + " " + clien.getApellido());
        }
    }
}
