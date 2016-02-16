import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ismael on 2/15/16.
 */
public class SchedFCFS implements SchedAlgorithm{

    LinkedList<Process> ready;
    LinkedList<Process> blocked;
    LinkedList<Process> allProcess;

    Process running;

    @Override
    public Process getRunning() {
        return this.running;
    }

    @Override
    public void tick() {
        if (this.running.getExpected_runtime() == this.running.getRunning_time()){
            this.running.finishProcess();
        }



    }

    private void updateTimes(){
        for(Iterator<Process> i = this.allProcess.iterator(); i.hasNext();){
            Process p = i.next();
            switch(p.getCurrent()){
                case FINISHED:   break;//nada
                case READY: p.setReady_time(p.getReady_time()+1);
                    break;
                case BLOCKED: p.setBlocked_time(p.getBlocked_time()+1);
                    break;

            }
        }
    }

    public SchedFCFS(LinkedList<Process> allProcess) {
        this.allProcess = allProcess;
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
