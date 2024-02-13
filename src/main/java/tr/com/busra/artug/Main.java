package tr.com.busra.artug;
public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new DesktopComputerBuilder();
        builder.setProcessor("i7");
        builder.setMemory(8);
        builder.setStorage(256);

        Computer computer = builder.build();
        System.out.println("computer : " + computer);

        }
    }
