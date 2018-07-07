package Practice_IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Read_file {
    public static void main(String[] args) throws IOException {
        /*Files.copy(Paths.get("nobody.txt"), Paths.get("Test1.txt"));*/
        Files.move(Paths.get("nobody.txt"),Paths.get("nobody.txt"),StandardCopyOption.REPLACE_EXISTING);
    }
}
