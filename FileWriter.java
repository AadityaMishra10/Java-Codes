import java.io.IOException;
public class FileWriter {
    public FileWriter(String string) {
    }

    public static void main(String[] args) throws IOException {
            FileWriter fw = new FileWriter("C:\\Users\\Astropoint\\Desktop\\test.txt");
            fw.write("Is there is output ?");
            fw.close();
            System.out.println("Done");
    }

    private void close() {
    }

    private void write(String string) {
    }
}
// H.W:- write in the file after the predefined line in file.
// Print those sentences which are staring with A.
