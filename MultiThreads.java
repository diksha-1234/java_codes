/*Q34.Multithreaded programming:
Write a program MultiThreads that creates two threads-one thread with the
name CSthread and the other thread named ITthread.
Each thread should
display its respective name and execute after a gap of 500 milliseconds. Each
thread should also display a number indicating the number of times it got a
chance to execute.*/

public class MultiThreads {
    public static void main(String[] args) {
        // Create two threads with specified names
        Thread csThread = new Thread(new CustomRunnable("CSthread"), "CSthread");
        Thread itThread = new Thread(new CustomRunnable("ITthread"), "ITthread");

        // Start both threads
        csThread.start();
        itThread.start();
    }
}

class CustomRunnable implements Runnable {
    private final String threadName;
    private int executionCount = 0;

    public CustomRunnable(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        try {
            // Loop to repeatedly execute the thread
            while (executionCount < 8) {
                // Increment the execution count
                executionCount++;
                // Display the thread's name and execution count
                System.out.println(threadName + " executed " + executionCount + " times.");
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.err.println(threadName + " interrupted.");
        }
    }
}