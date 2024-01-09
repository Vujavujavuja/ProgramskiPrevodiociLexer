import lexer.LexerImpl;
import lexer.Word;
import loader.FileLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String code1 = FileLoader.getFileLoader().load("src/codes/code1.vuja");
        String code2 = FileLoader.getFileLoader().load("src/codes/code2.vuja");
        String code3 = FileLoader.getFileLoader().load("src/codes/code3.vuja");
        String code4 = FileLoader.getFileLoader().load("src/codes/code4.vuja");
        String code5 = FileLoader.getFileLoader().load("src/codes/code5.vuja");
        String code6 = FileLoader.getFileLoader().load("src/codes/code6.vuja");
        String code7 = FileLoader.getFileLoader().load("src/codes/code7.vuja");
        String code8 = FileLoader.getFileLoader().load("src/codes/code8.vuja");
        String code9 = FileLoader.getFileLoader().load("src/codes/code9.vuja");
        String code10 = FileLoader.getFileLoader().load("src/codes/code10.vuja");
        String code11 = FileLoader.getFileLoader().load("src/codes/code11.vuja");
        String code12 = FileLoader.getFileLoader().load("src/codes/code12.vuja");
        String code13 = FileLoader.getFileLoader().load("src/codes/code13.vuja");
        String code14 = FileLoader.getFileLoader().load("src/codes/code14.vuja");
        String code15 = FileLoader.getFileLoader().load("src/codes/code15.vuja");
        String code16 = FileLoader.getFileLoader().load("src/codes/code16.vuja");
        String code17 = FileLoader.getFileLoader().load("src/codes/code17.vuja");
        String code18 = FileLoader.getFileLoader().load("src/codes/code18.vuja");
        String code19 = FileLoader.getFileLoader().load("src/codes/code19.vuja");
        String code20 = FileLoader.getFileLoader().load("src/codes/code20.vuja");
        String code21 = FileLoader.getFileLoader().load("src/codes/code21.vuja");

        List<Word> words;
        words = LexerImpl.getLexer().lex(code21);
        for (Word w : words)
            System.out.println(w);
    }
}