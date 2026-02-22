package creational;

import behavioral.state.ReadyState;
import model.Process;

public class ProcessFactory {

    private static int counter = 1;

    public static Process createProcess(String name) {
        return new Process(counter++, name, new ReadyState());
    }
}
