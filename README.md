#  SimuOS – Operating System Process & Memory Simulator (Java)


#  Overview

SimuOS is a Java-based simulation of core Operating System components designed to 
demonstrate Object-Oriented Design and Design Pattern implementation.

This System simulates : 

  - Process creation & lifecycle management
  - CPU scheduling algorithms
  - Memory allocation management
  - File system hierarchy
  - Resource monitoring

The project focuses on clean architecture, modular design, and design pattern
integration using pure Java.


# Tech Stack

  - Java
  - Object-Oriented Programming(OOPs) Concepts
  - Design Patterns 
  - Eclipse IDE
  - Github


# Key Features with Design Pattern :

  - Singleton – Kernel :
    Ensures only one OS kernel instance exists.
    
  - Factory – ProcessFactory :
    Encapsulates process creation logic.
    
  - State – Process Lifecycle :
    Encapsulates behavior for:
        1) Ready
        2) Running
        3) Waiting
        4) Terminated
    Removes conditional state handling.
    
  - Strategy – Scheduler :
    Allows switching between:
        1) FCFS
        2) Round Robin
    Without modifying Process class.
    
  - Observer – Resource Monitoring :
    Notifies CPU and Memory observers when:
        1)State changes
        2)Memory Allocation occurs

  - Composite – File System :
    Represents hierarchical structure of:
        1) Directories
        2) Files
    Uniform interface for both.
    
  - Flyweight – Memory Blocks :
    Reuses memory blocks of same size to reduce object creation.
    
  - Iterator – Process Traversal :
    Custom iterator for process queue.


#  Learning Outcomes

This project helped in understanding:

  - Operating System concepts (process scheduling, memory allocation)
  - Practical implementation of multiple design patterns in a single architecture
  - Modular project structuring using packages
  - Clean Object-Oriented system design
  - Git version control and project documentation

  
#  Project Structure

os-simulation/
│
├── docs/
│     └── architecture.png
├── core/
│     └── Kernel.java
│
├── model/
│     ├── Process.java
│     ├── MemoryBlock.java
│     ├── FileNode.java
│
├── creational/
│     ├── ProcessFactory.java
│     └── MemoryFactory.java
│
├── behavioral/
│     ├── state/
│     │     ├── ProcessState.java
│     │     ├── ReadyState.java
│     │     ├── RunningState.java
│     │     ├── WaitingState.java
│     │     └── TerminatedState.java
│     │
│     ├── strategy/
│     │     ├── SchedulerStrategy.java
│     │     ├── FCFSScheduler.java
│     │     └── RoundRobinScheduler.java
│     │
│     ├── observer/
│     │     ├── ResourceObserver.java
│     │     ├── ResourceMonitor.java
│     │     ├── CPUObserver.java
│     │     └── MemoryObserver.java
│     │
│     └── iterator/
│           ├── ProcessIterator.java
│           └── ProcessCollection.java
│
├── structural/
│     └── composite/
│           ├── FileComponent.java
│           ├── File.java
│           └── Directory.java
│
└── Main.java


# How to Run 
  1) Clone the repository
      -git clone https://github.com/prajapati-meet/SimuOS.git

  2) Open the project in Eclipse IDE
  3) Run:
       -Main.java


# Architecture Diagram

The system architecture UML diagram was generated using PlantUML.

![SimuOS UML Diagram](docs/architecture.png)

#  Author

Meet Prajapati
