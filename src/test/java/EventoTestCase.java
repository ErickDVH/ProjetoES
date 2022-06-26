import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EventoTestCase {
    @Test
    public void testCreateEvent() {
        var evento = new Evento("Evento 2", "10h", "13h","50","pombal");
        assertEquals("Evento 2", evento.getNome());
        assertEquals("10h", evento.getInicioEvento());
        assertEquals("13h", evento.getFimEvento());
        assertEquals("50",evento.getNumeroVeiculos());
        assertEquals("pombal",evento.getLocal());
    }
}
