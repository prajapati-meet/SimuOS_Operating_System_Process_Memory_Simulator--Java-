package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import model.Process;

public class ProcessCollection {

    private List<Process> processes = new ArrayList<>();

    public void addProcess(Process process) {
        processes.add(process);
    }

    public ProcessIterator getIterator() {
        return new ProcessIterator(processes);
    }

    public List<Process> getAllProcesses() {
        return processes;
    }
}