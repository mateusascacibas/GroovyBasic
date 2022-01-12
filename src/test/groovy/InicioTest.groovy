import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.api.Test
class InicioTest extends Inicio {
    @Test
    void testTabuada(){
        Assert.assertNotNull(tabuada(2))
    }
    @Test
    void testNumeroMaior(){
        Assert.assertNotNull(numeroMaior())
    }
    @Test
    void testSoma(){
        Assert.assertNotNull(somaNumeros())
    }

}
