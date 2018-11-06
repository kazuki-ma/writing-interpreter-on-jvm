import com.github.kazukima.Lexer
import org.junit.Test
import org.slf4j.LoggerFactory

class LexerTest {
    val log = LoggerFactory.getLogger(LexerTest::class.java)
    @Test
    fun tokenize() {
        val lexer = Lexer("TEST");

        log.info("{}", lexer.tokenize().toArray())
    }
}
