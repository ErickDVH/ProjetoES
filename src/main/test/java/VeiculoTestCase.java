import modelo.Veiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTestCase {

    @Test
    public void testCriarVeiculo(){
        Veiculo carro1 = new Veiculo("AE-12-DF", "Citroen", "AX",  2000,   "amarelo", 14,  "Leiria");

        assertEquals("AE-12-DF", carro1.getMatricula());
        assertEquals("Citroen", carro1.getMarca());
        assertEquals("AX", carro1.getModelo());
        //assertEquals("Daniel", carro1.getDono());
        //assertEquals("Alberto", carro1.getDonoAnterior());
        assertEquals(2000, carro1.getPreco());
        assertEquals(2, carro1.getNumDonos());
        assertEquals("amarelo", carro1.getCor());
        assertEquals(14, carro1.getJantes());
        assertEquals("Leiria", carro1.getLocal());
        assertFalse(carro1.isVendido());
        //assertEquals(0, carro1.getReparacoes().size());


    }
}
