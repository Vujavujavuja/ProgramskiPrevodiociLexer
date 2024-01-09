import lexer.LexerImpl;
import lexer.Word;

import java.util.List;

public class Lexer {
    private List<Word> lexedCode;
    private StringBuilder lexedCodeString;
    public Lexer(String code) {
        this.lexedCode = LexerImpl.getLexer().lex(code);
        for(Word w : lexedCode)
            this.lexedCodeString.append(w.toString());
    }
    public String getLexedCodeString() {
        return lexedCodeString.toString();
    }

}
