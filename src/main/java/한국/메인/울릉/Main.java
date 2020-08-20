package 한국.메인.울릉;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import 한국.메인.울릉.Antlr.ulleungLexer;
import 한국.메인.울릉.Antlr.ulleungParser;
import 한국.메인.울릉.리스너.울릉리스너;

import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {

        String filename = args[0];

        File inputUlnFile = new File(filename);
        File outputJavaFile = new File(filename+".java");

        File[] dokFiles = new File[args.length - 1];

        try{
            for(int i = 1; i < args.length; i++)
            {
                File tempFile = new File(args[i]);

                dokFiles[i-1] = tempFile;
            }

            FileOutputStream fos = new FileOutputStream(outputJavaFile);
            FileInputStream fis = new FileInputStream(inputUlnFile);

            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

            String code = br.lines().collect(Collectors.joining());

            //CharStream input = new CharStream(new FileInputStream(args[0]));

            CharStream input = CharStreams.fromString(code);


            ulleungLexer lexer = new ulleungLexer(input);
            ulleungParser parser = new ulleungParser(new CommonTokenStream(lexer));
            ParseTreeWalker.DEFAULT.walk(new 울릉리스너(fos, dokFiles), parser.program());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
