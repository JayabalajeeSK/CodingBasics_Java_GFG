package DirectoryPrograms;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class DirectoryPrograms 
{
    public static void traverseDirectory(String path) 
    {
        File dir = new File(path);
        if (dir.exists() && dir.isDirectory()) 
        {
            System.out.println("Contents of directory: " + path);
            for (File file : dir.listFiles()) 
            {
                System.out.println(file.getName());
            }
        } 
        else System.out.println("Invalid directory.");
    
    }

    // 2. Get the Size of a Directory (including subdirectories)
    public static long getDirectorySize(File dir) 
    {
        long size = 0;
        if (dir.exists() && dir.isDirectory()) 
        {
            for (File file : dir.listFiles()) 
            {
                size += file.isDirectory() ? getDirectorySize(file) : file.length();
            }
        }
        return size;
    }

    // 3. Delete a Directory (including files inside)
    public static void deleteDirectory(File dir) 
    {
        if (dir.exists()) 
        {
            for (File file : dir.listFiles()) 
            {
                if (file.isDirectory()) deleteDirectory(file);
                else file.delete();
            }
            if (dir.delete()) System.out.println("Directory deleted: " + dir.getPath());
            else System.out.println("Failed to delete: " + dir.getPath());
        }
    }

    // 4. Create Directories Recursively
    public static void createDirectories(String path) 
    {
        File dirs = new File(path);
        if (dirs.mkdirs()) System.out.println("Directories created at: " + path);
        else System.out.println("Failed or already exists.");
    }

    // 5. Search for a File in a Directory
    public static boolean searchFile(File dir, String fileName) 
    {
        if (dir.exists() && dir.isDirectory()) 
        {
            for (File file : dir.listFiles()) 
            {
                if (file.isDirectory()) 
                {
                    if (searchFile(file, fileName)) return true;
                } 
                else if (file.getName().equals(fileName)) 
                {
                    System.out.println("File found: " + file.getAbsolutePath());
                    return true;
                }
            }
        }
        return false;
    }

    // 6. Find the Current Working Directory
    public static void currentWorkingDirectory() 
    {
        System.out.println("Current Working Directory: " + Paths.get("").toAbsolutePath());
    }

    // 7. Display all Directories (not files) inside a Directory
    public static void listOnlyDirectories(String path) 
    {
        File dir = new File(path);
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("Subdirectories in: " + path);
            for (File file : dir.listFiles()) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Invalid directory.");
        }
    }

    public static void main(String[] args) throws IOException {
        //String testPath = "TestDir";
        String nestedPath = "TestDir/SubDir1/SubDir2";

        System.out.println("\n1. Traverse in a Directory:");
        traverseDirectory(".");

        System.out.println("\n2. Get Size of a Directory:");
        System.out.println("Size: " + getDirectorySize(new File(".")) + " bytes");

        System.out.println("\n3. Create Directories Recursively:");
        createDirectories(nestedPath);

        System.out.println("\n4. Search for a File:");
        searchFile(new File("."), "JavaDirectoryPrograms.java");

        System.out.println("\n5. Current Working Directory:");
        currentWorkingDirectory();

        System.out.println("\n6. Display All Directories in a Directory:");
        listOnlyDirectories(".");

        System.out.println("\n7. Delete a Directory:");
        deleteDirectory(new File("TestDir"));  // Warning: This deletes TestDir and all contents!
    }
}
// 1. Traverse in a Directory:
// Contents of directory: .
// .classpath
// .project
// JavaDirectoryPrograms.java
// bin
// src

// 2. Get Size of a Directory:
// Size: 4572 bytes

// 3. Create Directories Recursively:
// Directories created at: TestDir/SubDir1/SubDir2

// 4. Search for a File:
// File found: /your/path/to/project/JavaDirectoryPrograms.java

// 5. Current Working Directory:
// Current Working Directory: /your/path/to/project

// 6. Display All Directories in a Directory:
// Subdirectories in: .
// bin
// src
// TestDir

// 7. Delete a Directory:
// Directory deleted: TestDir/SubDir1/SubDir2
// Directory deleted: TestDir/SubDir1
// Directory deleted: TestDir