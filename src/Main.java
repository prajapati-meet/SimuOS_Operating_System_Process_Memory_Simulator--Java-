import java.util.ArrayList;
import java.util.List;

import core.Kernel;
import creational.ProcessFactory;
import creational.MemoryFactory;
import behavioral.strategy.*;
import behavioral.iterator.*;
import behavioral.observer.*;
import model.Process;
import model.MemoryBlock;
import structural.composite.*;

public class Main {

    public static void main(String[] args) {

        // ---------------- Kernel ----------------
        Kernel.getInstance().boot();

        // ---------------- Observer Setup ----------------
        ResourceMonitor monitor = new ResourceMonitor();
        monitor.addObserver(new CPUObserver());
        monitor.addObserver(new MemoryObserver());

        // ---------------- Process Creation ----------------
        ProcessCollection collection = new ProcessCollection();

        collection.addProcess(ProcessFactory.createProcess("P1"));
        collection.addProcess(ProcessFactory.createProcess("P2"));
        collection.addProcess(ProcessFactory.createProcess("P3"));

        ProcessIterator iterator = collection.getIterator();
        List<Process> processList = new ArrayList<>();

        while (iterator.hasNext()) {
            processList.add(iterator.next());
        }

        // ---------------- Scheduling ----------------
        SchedulerStrategy scheduler = new FCFSScheduler();
        scheduler.schedule(processList);
        monitor.notifyObservers("FCFS Scheduling Completed");

        scheduler = new RoundRobinScheduler();
        scheduler.schedule(processList);
        monitor.notifyObservers("Round Robin Scheduling Completed");

        // ---------------- Memory ----------------
        MemoryBlock block = MemoryFactory.getMemoryBlock(256);
        block.allocate("P1");
        monitor.notifyObservers("256MB allocated to P1");

        // ---------------- File System (Composite) ----------------
        System.out.println("\n[File System Structure]");

        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory etc = new Directory("etc");

        File bash = new File("bash");
        File config = new File("config.txt");
        File readme = new File("readme.md");

        bin.add(bash);
        etc.add(config);

        root.add(bin);
        root.add(etc);
        root.add(readme);

        root.showDetails();
    }
}