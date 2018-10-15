import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MazeTest {


    String inputFileeWindows = "C:\\Users\\c14456a\\Downloads\\maze\\input.txt";
    String inputFileLinux = "/home/imran/Documents/Gentrak_job/input.txt";


    @Test
    public void testReadMaze() {

        Maze maze = new Maze();

        List<String> mazeInput= maze.read(inputFileLinux);

       // mazeInput.forEach((line -> System.out.println(line));

        System.out.println();
        System.out.println(mazeInput.size());

    }

}
