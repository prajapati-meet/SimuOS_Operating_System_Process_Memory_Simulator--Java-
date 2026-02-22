package behavioral.iterator;

import java.util.List;
import model.Process;

public class ProcessIterator {

    private List<Process> processes;
    private int position = 0;

    public ProcessIterator(List<Process> processes) {
        this.processes = processes;
    }

    public boolean hasNext() {
        return position < processes.size();
    }

    public Process next() {
        return processes.get(position++);
    }
}