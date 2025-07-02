package MultiThreadingPrograms;

public class MultiThreadingProgramsRunner extends MultiThreadingPrograms
{
    public static void main(String[] args) 
    {
        System.out.println("\n1. Check Thread Status:");
        checkThreadStatus();

        System.out.println("\n2. Simulate Suspend/Resume:");
        simulateSuspendResume();

        System.out.println("\n3. Join Threads:");
        joinThreads();

        System.out.println("\n4. Daemon Thread:");
        showDaemonThread();
    }
    
}
// 1. Check Thread Status:
// Before start: NEW
// Thread is running...
// After start: TERMINATED

// 2. Simulate Suspend/Resume:
// Running i = 1
// Running i = 2
// Thread is suspended at i = 3

// 3. Join Threads:
// Thread-A - Count: 0
// Thread resumed.
// Running i = 3
// Thread-A - Count: 1
// Running i = 4
// Thread-A - Count: 2
// Running i = 5

// 4. Daemon Thread:
// Thread-B - Count: 0
// Daemon thread running...
// Daemon thread running...
// Thread-B - Count: 1
// Daemon thread running...
// Thread-B - Count: 2
// Daemon thread running...
// Main thread ending, daemon will stop automatically.