import java.util.LinkedList;
import java.util.List;

/**
 * Created by ismael on 2/14/16.
 */
public class Scheduling {
    public LinkedList<Process> getAllProcesses() {
        return allProcesses;
    }

    private LinkedList<Process> allProcesses = new LinkedList<Process>();

    private Process running;

    public String getCurrentSched() {
        return this.currentSched.getName();
    }

    public Process newProcess(String name, int arriveTime, int expectedRuntime, Process.Status status){
        Process p = new Process(name, expectedRuntime, allProcesses.size()+1);
        p.setArriveTime(arriveTime);
        p.setCurrent(Process.Status.NEW);
        p.setNext(status);
        allProcesses.addLast(p);
        return p;
    }

    private SchedAlgorithm currentSched;

    private int procCounter = 0;


    public void Scheduling(){

    }


}
