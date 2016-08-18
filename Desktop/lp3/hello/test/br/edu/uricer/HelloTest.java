package br.edu.uricer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class HelloTest {
    
    @Test
    public void testRetornarHelloNomeSePassarNome() {
         Hello hello = new Hello ("Gabriel");
         assertEquals("Hello Gabriel",hello.getMessage());
    }
    
    @Test
    public void testRetornarHelloSemNome(){
        Hello hello = new Hello();
        assertEquals("Hello",hello.getMessage());
    }
}
