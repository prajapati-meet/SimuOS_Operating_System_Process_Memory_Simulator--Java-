package model;

public class MemoryBlock {

    private int size; // intrinsic state

    public MemoryBlock(int size) {
        this.size = size;
    }

    public void allocate(String processName) {
        System.out.println("[Memory] Allocating " + size + "MB to " + processName);
    }

    public int getSize() {
        return size;
    }
}