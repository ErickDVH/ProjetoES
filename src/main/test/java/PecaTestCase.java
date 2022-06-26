import modelo.Peca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PecaTestCase {

    @Test
    public void testCriarPeca(){
        Peca peca = new Peca("Oleo 4w30", true, 10, 20, 15);

        assertEquals("Oleo 4w30", peca.getNome());
        assertTrue(peca.isConsumivel());
        assertEquals(10, peca.getMinFilial());
        assertEquals(20, peca.getMinSede());
        assertEquals(15, peca.getPreco());
    }
}
