package MultiThreadingPrograms;

public class MultiThreadingPrograms 
{
    // 1. Check thread status
    static class StatusThread extends Thread 
    {
        public void run() 
        {
            System.out.println("Thread is running...");
        }
    }

    public static void checkThreadStatus() 
    {
        StatusThread t1 = new StatusThread();
        System.out.println("Before start: " + t1.getState());
        t1.start();
        try 
        {
            Thread.sleep(100);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("After start: " + t1.getState());
    }
// 1. Check Thread Status:
// Before start: NEW
// Thread is running...
// After start: TERMINATED

    // 2. Simulate suspend/resume manually
    static class SuspendableThread extends Thread 
    {
        private volatile boolean suspended = false;

        public void suspendThread() 
        {
            suspended = true;
        }

        public void resumeThread() 
        {
            suspended = false;
        }

        public void run() 
        {
            for (int i = 1; i <= 5; i++) 
            {
                if (suspended) 
                {
                    System.out.println("Thread is suspended at i = " + i);
                    while (suspended) 
                    {
                        try 
                        { 
                            Thread.sleep(100); 
                        } 
                        catch (Exception e) 
                        {

                        }
                    }
                    System.out.println("Thread resumed.");
                }
                System.out.println("Running i = " + i);
                try 
                { 
                    Thread.sleep(500); 
                } 
                catch (Exception e) 
                {

                }
            }
        }
    }

    public static void simulateSuspendResume() 
    {
        SuspendableThread t2 = new SuspendableThread();
        t2.start();
        try 
        {
            Thread.sleep(1000);
            t2.suspendThread();
            Thread.sleep(2000);
            t2.resumeThread();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
// 2. Simulate Suspend/Resume:
// Running i = 1
// Running i = 2
// Thread is suspended at i = 3

    // 3. Join Threads
    static class JoinThread extends Thread 
    {
        private String name;
        public JoinThread(String name) 
        {
            this.name = name;
        }
        public void run() 
        {
            for (int i = 0; i < 3; i++) 
            {
                System.out.println(name + " - Count: " + i);
                try 
                { 
                    Thread.sleep(500); 
                } 
                catch (Exception e) 
                {

                }
            }
        }
    }

    public static void joinThreads() 
    {
        JoinThread t1 = new JoinThread("Thread-A");
        JoinThread t2 = new JoinThread("Thread-B");
        t1.start();
        try 
        { 
            t1.join(); 
        } 
        catch (Exception e) 
        {

        }
        t2.start();
    }
// 3. Join Threads:
// Thread-A - Count: 0
// Thread resumed.
// Running i = 3
// Thread-A - Count: 1
// Running i = 4
// Thread-A - Count: 2
// Running i = 5

    // 4. Daemon Thread
    static class DaemonExample extends Thread 
    {
        public void run() 
        {
            while (true) 
            {
                System.out.println("Daemon thread running...");
                try 
                { 
                    Thread.sleep(500); 
                } 
                catch (Exception e) 
                {

                }
            }
        }
    }

    public static void showDaemonThread() 
    {
        DaemonExample daemon = new DaemonExample();
        daemon.setDaemon(true);
        daemon.start();

        try 
        {
            Thread.sleep(2000); // Let daemon run for a while
        } 
        catch (Exception e) 
        {

        }

        System.out.println("Main thread ending, daemon will stop automatically.");
    }
// 4. Daemon Thread:
// Thread-B - Count: 0
// Daemon thread running...
// Daemon thread running...
// Thread-B - Count: 1
// Daemon thread running...
// Thread-B - Count: 2
// Daemon thread running...
// Main thread ending, daemon will stop automatically.
}
