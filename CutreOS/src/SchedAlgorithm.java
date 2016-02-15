import java.util.LinkedList;
import java.util.List;

/**
 * Created by ismael on 2/15/16.
 */
public interface SchedAlgorithm {
    public String getName();

    void tick(); //here all the scheduling happens

    public int newProcess (Process P);

    public int getQuantum();
    public void setQuantum(int quantum);

    public List<Process> getReady();
    public List<Process> getBlocked();

    public Process getRunning();





}
