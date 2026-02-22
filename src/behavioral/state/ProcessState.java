package behavioral.state;

import model.Process;

public interface ProcessState 
{
    void handle(Process process);
}
