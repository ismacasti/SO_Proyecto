/**
 * Created by ismael on 2/14/16.
 */
public class Process {
    public enum Status{
        RUNNING, BLOCKED, READY, FINISHED
    }

    String name;
    int pid;

    int expected_runtime;
    int running_time;
    int blocked_time;
    int ready_time;

    int last_running_time;
    int last_blocked_time;
    int last_ready_time;



    Status current;


    public Process (String name, int expected_runtime){
        this.name = name;
        this.expected_runtime = expected_runtime;
    }
}
