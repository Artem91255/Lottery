import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkingWithFile
{
    public static void addInFile(ArrayList id, ArrayList name, ArrayList number, ArrayList pr, ArrayList type) throws IOException

    {
        BufferedWriter bf = new BufferedWriter(new FileWriter(("notes2.txt")));
        for(int i = 0; i<id.size(); i++)
        {
            bf.write( id.get(i) + ", \t" + name.get(i) + ", \t" + number.get(i) + ", \t" + pr.get(i) + ", \t" + type.get(i));
            bf.write("\n");
        }
        bf.close();

    }

    public static void readFromFile() throws IOException {
        FileReader fr = new FileReader("notes2.txt");
        Scanner scan = new Scanner(fr);

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }

        fr.close();
    }
}
