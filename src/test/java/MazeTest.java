import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MazeTest {


    @Test
    public void testReadMaze() {

        Maze maze = new Maze();

        List<String> mazeInput= maze.read("C:\\Users\\c14456a\\Downloads\\maze\\input.txt");

       /* mazeInput.forEach(line -> System.out.println(line));

        System.out.println();
        System.out.println(mazeInput.get(0));*/

    }

}
