import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ismael on 2/15/16.
 */
public class main {
    public static void main(String [ ] args){
        CutreOS kernel = new CutreOS();
        kernel.newProcess("Word", 0, 30, 1);
        kernel.newProcess("Spotify", 3, 23, 2);

        for(Iterator<String> i = kernel.getProcesses().iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
