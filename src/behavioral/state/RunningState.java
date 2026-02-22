package behavioral.state;

import model.Process;

public class RunningState implements ProcessState {

    @Override
    public void handle(Process process) {
        System.out.println("Process " + process.getName() + " is RUNNING.");
    }
}
