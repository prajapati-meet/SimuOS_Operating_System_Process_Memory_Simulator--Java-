package behavioral.state;

import model.Process;

public class ReadyState implements ProcessState {

    @Override
    public void handle(Process process) {
        System.out.println("Process " + process.getName() + " is READY.");
    }
}
