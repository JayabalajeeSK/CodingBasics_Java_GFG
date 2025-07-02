package FilePrograms;

import java.io.IOException;

public class FileProgramsRunner extends FilePrograms
{
    public static void main(String[] args) throws IOException 
    {
        createNewFile("example.txt");

        createTempFile();

        writeToFile("example.txt", "Hello from Java!");

        renameFile("example.txt", "new_example.txt");

        makeFileReadOnly("new_example.txt");

        compareFilePaths("new_example.txt", "new_example.txt");

        copyFile("new_example.txt", "copy_example.txt");

        appendToFile("copy_example.txt", "\nAppended line.");

        printPatternFromFile("copy_example.txt", "\\bJava\\b");

        readAndWrite("copy_example.txt", "final_output.txt");

        readZipFile("new_example_copy.zip"); // make sure sample.zip exists in your project root
    }
    
}
// File created: E:\StudyWithJB\Complete_Java\Java1\CodingBasics_Java_GFG\example.txt

// Temporary file created at: C:\Users\tharu\AppData\Local\Temp\tempFile17813524851218736588.tmp

// Written to file.
// Hello from Java!

// Renamed to: new_example.txt

// File is now read-only.

// Paths are same

// File copied.

// Match: Java

// Content copied to new file.

// Found file: new_example_copy.txt