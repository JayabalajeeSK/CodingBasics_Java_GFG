package FilePrograms;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FilePrograms 
{

    public static void createNewFile(String fileName) throws IOException 
    {
        File file = new File(fileName);
        if (file.createNewFile()) System.out.println("File created: " + file.getAbsolutePath());
        else System.out.println("File already exists.");
    }

    public static void createTempFile() throws IOException 
    {
        File temp = File.createTempFile("tempFile", ".tmp");
        System.out.println("Temporary file created at: " + temp.getAbsolutePath());
    }

    public static void writeToFile(String fileName, String content) throws IOException 
    {
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
        System.out.println("Written to file.");
    }

    public static void renameFile(String oldName, String newName) 
    {
        File oldFile = new File(oldName);
        File newFile = new File(newName);
        if (oldFile.renameTo(newFile)) System.out.println("Renamed to: " + newName);
        else System.out.println("Rename failed.");
    }

    public static void makeFileReadOnly(String fileName) 
    {
        File file = new File(fileName);
        if (file.setReadable(true) && file.setWritable(false)) System.out.println("File is now read-only.");
        else System.out.println("Failed to make read-only.");
    }

    public static void compareFilePaths(String path1, String path2) throws IOException 
    {
        Path p1 = Paths.get(path1).toRealPath();
        Path p2 = Paths.get(path2).toRealPath();
        System.out.println(p1.equals(p2) ? "Paths are same" : "Paths are different");
    }

    public static void copyFile(String source, String destination) throws IOException 
    {
        Files.copy(Paths.get(source), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied.");
    }

    public static void printPatternFromFile(String fileName, String regex) throws IOException 
    {
        Scanner sc = new Scanner(new File(fileName));
        Pattern pattern = Pattern.compile(regex);
        while (sc.hasNextLine()) 
        {
            Matcher matcher = pattern.matcher(sc.nextLine());
            while (matcher.find()) 
            {
                System.out.println("Match: " + matcher.group());
            }
        }
        sc.close();
    }

    public static void appendToFile(String fileName, String content) throws IOException 
    {
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.APPEND);
        System.out.println("Content appended.");
    }

    public static void readAndWrite(String source, String dest) throws IOException 
    {
        String content = new String(Files.readAllBytes(Paths.get(source)));
        Files.write(Paths.get(dest), content.getBytes(), StandardOpenOption.CREATE);
        System.out.println("Content copied to new file.");
    }

    public static void readZipFile(String zipFilePath) throws IOException 
    {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath));
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) 
        {
            System.out.println("Found file: " + entry.getName());
        }
        zis.close();
    }
}