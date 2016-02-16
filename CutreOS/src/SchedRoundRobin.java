import java.util.LinkedList;
import java.util.List;

/**
 * Created by ismael on 2/15/16.
 */
public class SchedRoundRobin implements SchedAlgorithm {
    private LinkedList<Process> ready;
    private LinkedList<Process> blocked;
    private Process running;

    private int quantum;

    @Override
    public Process getRunning() {
        return running;
    }

    @Override
    public void tick() {

    }

    @Override
    public String getName() {
        return "Round Robin";
    }



    @Override
    public int newProcess(Process P) {
        this.ready.addLast(P);
        return (P.getPid());
    }

    @Override
    public int getQuantum() {
        return this.quantum;
    }

    @Override
    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    @Override
    public LinkedList<Process> getReady() {
        return this.ready;
    }

    @Override
    public LinkedList<Process> getBlocked() {
        return this.blocked;
    }
}
