package exercises.technology;

public class Computer {

    private int processorCount;

    private int gigabytesRAM;

    private int gigabytesStorage;

    public int getProcessorCount() {
        return processorCount;
    }

    public void setProcessorCount(int processorCount) {
        this.processorCount = processorCount;
    }

    public int getGigabytesRAM() {
        return gigabytesRAM;
    }

    public void setGigabytesRAM(int gigabytesRAM) {
        this.gigabytesRAM = gigabytesRAM;
    }

    public int getGigabytesStorage() {
        return gigabytesStorage;
    }

    public void setGigabytesStorage(int gigabytesStorage) {
        this.gigabytesStorage = gigabytesStorage;
    }

    public void flushRAM(){
        double freeRAM = this.gigabytesRAM * 0.42;
        System.out.println("Freed " + freeRAM + "GB RAM");
    }

    public void defragStorage() {

    }

}
