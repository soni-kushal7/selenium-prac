package Action_Class;
class NumberPrinter {

    int number = 1;
    int limit = 10;

    public synchronized void printOdd() {

        while (number <= limit) {

            if (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (number <= limit) {
                System.out.println("Odd Thread: " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {

        while (number <= limit) {

            if (number % 2 == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (number <= limit) {
                System.out.println("Even Thread: " + number);
                number++;
                notify();
            }
        }
    }
}

public class OddEvenThread {

    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        Thread t1 = new Thread(() -> printer.printOdd());
        Thread t2 = new Thread(() -> printer.printEven());

        t1.start();
        t2.start();
    }
}