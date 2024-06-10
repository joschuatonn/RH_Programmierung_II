package Aufgaben.Entwurfsmuster.decorator.file_input_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) {
        readFile("src/Aufgaben/Entwurfsmuster/decorator/file_input_stream/test.txt");
        readZipFolder("src/Aufgaben/Entwurfsmuster/decorator/file_input_stream/test.zip");

        ZipFile zipFile;
        try {
            zipFile = new ZipFile("src/Aufgaben/Entwurfsmuster/decorator/file_input_stream/test.zip");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Number of entries: " + zipFile.size());
        System.out.println("Name of the Zip-File: " + zipFile.getName());
    }

    public static void readFile(String filePath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

    public static void readZipFolder(String folderPath) {
        System.out.println();
        try(ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(folderPath)))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println("Name: " + entry.getName() + ", Size: " + entry.getSize() + " bytes");
                zis.closeEntry();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
