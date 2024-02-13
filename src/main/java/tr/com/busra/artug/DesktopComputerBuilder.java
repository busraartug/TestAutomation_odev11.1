package tr.com.busra.artug;

public class DesktopComputerBuilder implements ComputerBuilder{
    private String processor;
    private int memory;
    private int storage;
    @Override
    public void setProcessor(String processor) {
        this.processor = processor;

    }

    @Override
    public void setMemory(int memory) {
        this.memory = memory;

    }

    @Override
    public void setStorage(int Storage) {
        this.storage = storage;

    }

    @Override
    public Computer build() {
        return new Computer(processor, memory, storage);
    }
}
