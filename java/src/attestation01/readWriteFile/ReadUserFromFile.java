package attestation01.readWriteFile;
import attestation01.model.User;
import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ReadUserFromFile {
    private static final String path = "resources/userBase.txt";

    public static List<User> getUserFromFile() {
        try {
            BufferedReader UserReader = new BufferedReader(new FileReader(path));
            List<User> newUserBase = new ArrayList<>();
            String lines = UserReader.readLine();
            while (lines != null) {
                String[] line = lines.split("\\|");
                newUserBase.add(new User(line[0], LocalDateTime.parse(line[1]), line[2],
                        line[3], line[4], line[5], line[6], line[7], Integer.parseInt(line[8]),
                        Boolean.valueOf(line[9])));
                lines = UserReader.readLine();

            }
            UserReader.close();
            return newUserBase;

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла ");
        }
        return null;
    }
}


