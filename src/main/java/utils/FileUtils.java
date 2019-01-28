package utils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Maciej Polansky on 2019-01-28.
 **/

public class FileUtils {

    public static void createNewFile(String fileName) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
    }
}
