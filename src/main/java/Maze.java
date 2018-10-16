import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Maze {

    public List read (String inputFile){

        ArrayList<Integer> maze = new ArrayList<>();

        try{

            Reader reader = new FileReader(inputFile);

            BufferedReader br =
                    new BufferedReader(reader);


            while(br.ready()) {

                br.readLine().chars()
                        .filter(x -> x != ' ')
                        .map(x -> Character.getNumericValue(x))
                        .forEach(x -> maze.add(x));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return maze;

    }
}
