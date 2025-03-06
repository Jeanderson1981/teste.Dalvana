import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AvaliadorDeNotasTest {

    // Testa o caso em que a nota é alta o suficiente para ser classificada como "Excelente"
    @Test
    public void testClassificarAluno_Excelente() {
        AvaliadorDeNotas avaliador = new AvaliadorDeNotas(); // Instancia a classe AvaliadorDeNotas
        String resultado = avaliador.classificarAluno(90.0); // Classifica uma nota alta
        assertEquals("Excelente", resultado, "A classificação deveria ser Excelente."); // Valida que o retorno é "Excelente"
    }

    // Testa o caso em que a nota é suficiente para ser classificada como "Bom"
    @Test
    public void testClassificarAluno_Bom() {
        AvaliadorDeNotas avaliador = new AvaliadorDeNotas(); // Instancia a classe AvaliadorDeNotas
        String resultado = avaliador.classificarAluno(75.0); // Classifica uma nota moderada
        assertEquals("Bom", resultado, "A classificação deveria ser Bom."); // Valida que o retorno é "Bom"
    }

    // Testa o caso em que a nota é suficiente para ser classificada como "Satisfatório"
    @Test
    public void testClassificarAluno_Satisfatorio() {
        AvaliadorDeNotas avaliador = new AvaliadorDeNotas(); // Instancia a classe AvaliadorDeNotas
        String resultado = avaliador.classificarAluno(50.0); // Classifica uma nota média
        assertEquals("Satisfatório", resultado, "A classificação deveria ser Satisfatório."); // Valida que o retorno é "Satisfatório"
    }

    // Testa o caso em que a nota é baixa e deve ser classificada como "Insatisfatório"
    @Test
    public void testClassificarAluno_Insatisfatorio() {
        AvaliadorDeNotas avaliador = new AvaliadorDeNotas(); // Instancia a classe AvaliadorDeNotas
        String resultado = avaliador.classificarAluno(40.0); // Classifica uma nota baixa
        assertEquals("Insatisfatório", resultado, "A classificação deveria ser Insatisfatório."); // Valida que o retorno é "Insatisfatório"
    }
}

