package behavioral.strategy;

import java.util.List;
import model.Process;

public interface SchedulerStrategy 
{
    void schedule(List<Process> processes);
}