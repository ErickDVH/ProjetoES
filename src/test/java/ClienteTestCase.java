import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ClienteTestCase {
    @Test
    public void testCreateClient() {
        var cliente = new Cliente("David", "951236876", "912865792","david@hotmail.com","leiria");
        assertEquals("David", cliente.getNome());
        assertEquals("951236876", cliente.getNif());
        assertEquals("912865792", cliente.getContacto());
        assertEquals("david@hotmail.com",cliente.getEmail());
        assertEquals("leiria",cliente.getMorada());
    }
}
