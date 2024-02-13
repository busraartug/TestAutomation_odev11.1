package tr.com.busra.artug;

public class Computer {

    private String processor;
    private int memory;
    private int storage;

    public Computer(String processor, int memory, int storage){
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;

    }
    public String toString(){
        return "Computer{" +
                "processor='" + processor + "/" +
                ", memory=" + memory +
                ", storage=" + storage +
                '}';
    }

}
