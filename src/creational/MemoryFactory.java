package creational;

import java.util.HashMap;
import java.util.Map;
import model.MemoryBlock;

public class MemoryFactory {

    private static Map<Integer, MemoryBlock> memoryPool = new HashMap<>();

    public static MemoryBlock getMemoryBlock(int size) {

        if (!memoryPool.containsKey(size)) {
            memoryPool.put(size, new MemoryBlock(size));
        }

        return memoryPool.get(size);
    }
}