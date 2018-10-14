import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class maze {

    public List read (String inputFile){

        ArrayList maze = new ArrayList();

        try{

            Reader reader = new FileReader(inputFile);

            BufferedReader br =
                    new BufferedReader(reader);


            while(br.ready()) {

                maze.add(br.readLine());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return maze;

    }
}
