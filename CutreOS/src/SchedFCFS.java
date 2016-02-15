import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ismael on 2/15/16.
 */
public class SchedFCFS implements SchedAlgorithm{

    LinkedList<Process> ready;
    LinkedList<Process> blocked;

    Process running;

    @Override
    public Process getRunning() {
        return this.running;
    }

    @Override
    public void tick() {

    }


    @Override
    public String getName() {
        return "FCFS (FIFO)";
    }



    @Override
    public int newProcess(Process P) {
        this.ready.addLast(P);
        return (P.getPid());
    }

    @Override
    public int getQuantum() {
        return 0;
    }

    @Override
    public void setQuantum(int quantum) {
        //no quantum in FCFS
    }



    @Override
    public List<Process> getReady() {
        return this.ready;
    }

    @Override
    public List<Process> getBlocked() {
        return this.blocked;
    }
}
