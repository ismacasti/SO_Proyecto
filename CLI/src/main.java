import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

/**
 * Created by ismael on 2/15/16.
 */
public class main {
    public static void main(String[] args) throws IOException{
        if (args.length == 1) {
            Parser p = new Parser(args[0]);
            LinkedList<ProcessParsed> procs = p.parse();
            System.out.println("thanks");
        } else {
            System.out.println("Use only 1 parameter, the path for the input file");
            System.exit(-1);
        }
    }
}
