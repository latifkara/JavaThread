package odev;

import java.util.ArrayList;
import java.util.List;

public class ThreadEvenOddRace implements Runnable {

    private static List<Integer> arr = new ArrayList<Integer>();
    private List<Integer> odd = new ArrayList<Integer>();
    private List<Integer> even = new ArrayList<Integer>();
    private int size;
    private boolean isControl;


    static {
        for (int i = 1; i <= 10000; i++) {
            arr.add(i);
        }
    }
    public ThreadEvenOddRace(int size, boolean isControl){
        this.size = size;
        this.isControl = isControl;
    }
    public void calculate(){
        System.out.println(this.getSize());
       for (int i= 0; i < this.getSize(); i++){
           if (arr.get(i) % 2 != 0 && isControl == true){
               odd.add(arr.get(i));
           } else if(arr.get(i) % 2 == 0 && isControl == false) {
               even.add(arr.get(i));
           }
       }

    }

    @Override
    public void run() {
        calculate();
    }

    public void prinEven(){
        for (Integer item: this.getEven()) {
            System.out.println("Even Thread : "+item);
        }
    }
    public void printOdd(){
        for (Integer item: this.getOdd()) {
            System.out.println("Odd Thread : "+item);
        }
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Integer> getOdd() {
        return odd;
    }

    public void setOdd(List<Integer> odd) {
        this.odd = odd;
    }

    public List<Integer> getEven() {
        return even;
    }

    public void setEven(List<Integer> even) {
        this.even = even;
    }
}
