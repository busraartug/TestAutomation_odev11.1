package tr.com.busra.artug;

public interface ComputerBuilder {
    void setProcessor(String processor);
    void setMemory(int memory);
    void setStorage(int Storage);
    Computer build();
}
