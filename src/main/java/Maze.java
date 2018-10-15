import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Maze {

    public List read (String inputFile){

        ArrayList<Character> maze = new ArrayList<>();

        try{

            Reader reader = new FileReader(inputFile);

            BufferedReader br =
                    new BufferedReader(reader);


            while(br.ready()) {

                br.readLine().chars().forEach(x -> System.out.println((char)x));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return maze;

    }
}
