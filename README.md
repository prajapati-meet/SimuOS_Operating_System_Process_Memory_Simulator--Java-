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

  - Singleton – Kernel :<br>
    Ensures only one OS kernel instance exists.
    
  - Factory – ProcessFactory : <br>
    Encapsulates process creation logic.
    
  - State – Process Lifecycle :<br>
    Encapsulates behavior for:<br>
        &nbsp;&nbsp;&nbsp;&nbsp;1) Ready<br>
        &nbsp;&nbsp;&nbsp;&nbsp;2) Running<br>
        &nbsp;&nbsp;&nbsp;&nbsp;3) Waiting<br>
        &nbsp;&nbsp;&nbsp;&nbsp;4) Terminated<br>
    Removes conditional state handling.
    
  - Strategy – Scheduler :<br>
    Allows switching between:<br>
        &nbsp;&nbsp;&nbsp;&nbsp;1) FCFS<br>
        &nbsp;&nbsp;&nbsp;&nbsp;2) Round Robin<br>
    Without modifying Process class.
    
  - Observer – Resource Monitoring :<br>
    Notifies CPU and Memory observers when:<br>
        &nbsp;&nbsp;&nbsp;&nbsp;1)State changes<br>
        &nbsp;&nbsp;&nbsp;&nbsp;2)Memory Allocation occurs<br>

  - Composite – File System :<br>
    Represents hierarchical structure of:<br>
        &nbsp;&nbsp;&nbsp;&nbsp;1) Directories<br>
        &nbsp;&nbsp;&nbsp;&nbsp;2) Files<br>
    Uniform interface for both.
    
  - Flyweight – Memory Blocks :<br>
    Reuses memory blocks of same size to reduce object creation.
    
  - Iterator – Process Traversal :<br>
    Custom iterator for process queue.


#  Learning Outcomes

This project helped in understanding:

  - Operating System concepts (process scheduling, memory allocation)
  - Practical implementation of multiple design patterns in a single architecture
  - Modular project structuring using packages
  - Clean Object-Oriented system design
  - Git version control and project documentation


# How to Run 
  1) Clone the repository<br>
      &nbsp;&nbsp;&nbsp;&nbsp;-git clone https://github.com/prajapati-meet/SimuOS.git

  2) Open the project in Eclipse IDE
  3) Run:<br>
       &nbsp;&nbsp;&nbsp;&nbsp;-Main.java

#  Author

Meet Prajapati
