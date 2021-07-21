package br.eti.arthurgregorio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingNIO2 {

    private static final String MY_FILE = "f:" + File.separator + "file-using-nio2.txt";

    public UsingNIO2() {

        try {
            writeFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("------------------------------------");

        try {
            readFile();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void writeFile() throws IOException {

        final Path path = Paths.get(MY_FILE);
        Files.writeString(path, "Ola Mundo NIO2");

        System.out.println("Arquivo gravado com sucesso!");
    }

    private void readFile() throws IOException {

        final Path path = Paths.get(MY_FILE);

        Files.readAllLines(path)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new UsingNIO2();
    }
}
