package br.com.java.streams;

public class SalaryCollector {
    private int total = 0;
    private int count = 0;

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public void accept(int salary){
        this.total += salary;
        count++;
    }
    public void combine(SalaryCollector other){
        this.total += other.total;
        this.count += other.count;

    }

}
