package behavioral.strategy;

import java.util.List;
import model.Process;

public class RoundRobinScheduler implements SchedulerStrategy {

    @Override
    public void schedule(List<Process> processes) {

        System.out.println("\n[Scheduler] Round Robin Scheduling Started");

        for (Process p : processes) {
            p.moveToRunning();
            p.execute();
            p.moveToWaiting();
            p.execute();
        }
    }
}