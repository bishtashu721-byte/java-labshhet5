interface Printer {
    void print();
}
interface Scanner {
    void scan();
}
class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;
    public MultiFunctionMachine(String name, int id) { machineName = name; machineId = id; }
    public String getMachineName() { return machineName; }
    public int getMachineId() { return machineId; }
    public void setMachineName(String name) { machineName = name; }
    public void setMachineId(int id) { machineId = id; }
    @Override
    public void print() { System.out.println("Printing document."); }
    @Override
    public void scan() { System.out.println("Scanning document."); }
}
public class Q17_MultiFunctionMachine {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine("Office Machine", 101);
        System.out.println("Machine: " + m.getMachineName());
        System.out.println("ID: " + m.getMachineId());
        m.print(); m.scan();
    }
}
