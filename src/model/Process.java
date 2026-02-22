package model;

//import behavioral.state.ProcessState;
import behavioral.state.*;


public class Process {

    private int pid;
    private String name;
    private ProcessState state;

    public Process(int pid, String name, ProcessState state) {
        this.pid = pid;
        this.name = name;
        this.state = state;
    }

//    public void setState(ProcessState state) {
//        this.state = state;
//    }

    public void moveToReady() {
        this.state = new ReadyState();
    }

    public void moveToRunning() {
        this.state = new RunningState();
    }

    public void moveToWaiting() {
        this.state = new WaitingState();
    }

    public void moveToTerminated() {
        this.state = new TerminatedState();
    }
    
    public void execute() {
        state.handle(this);
    }


    public int getPid() {
        return pid;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "PID: " + pid + " | Name: " + name;
    }
}
