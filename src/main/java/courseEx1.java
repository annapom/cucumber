import sun.nio.cs.StandardCharsets;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by annapo on 7/5/2019.
 */
public class courseEx1 {
    public static void main(String[] args) {
        File file = new File("C://Automation/TestExample/strings.csv");
        List<String> lines = null;

        Charset charset = Charset.forName("UTF-8");
        try {
            lines = Files.readAllLines(file.toPath(), charset);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String value:lines){
            System.out.println(String.format("list valu=%s",value));
        }

    }
}