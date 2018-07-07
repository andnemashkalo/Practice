package Practice_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deleting {
    public static void main(String[] args) throws IOException {
        Path pathSource= Paths.get("Test.txt");
        Files.delete(pathSource);
    }
}
