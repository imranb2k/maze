import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MazeTest {


    String inputFileeWindows = "C:\\Users\\c14456a\\Downloads\\maze\\input.txt";
    String inputFileLinux = "/home/imran/Documents/Gentrak_job/input.txt";


    @Test
    public void testReadMaze() {

        //Given
        List<Integer> expectedMazeInput = Arrays.asList(5,5,1,1,3,3,1,1,1,1,1,1,0,1,0,1,1,0,1,0,1,1,0,0,0,1,1,1,1,1,1);

        //When
        Maze maze = new Maze();
        List<Integer> mazeInput= maze.read(inputFileeWindows);

        //Then
        assertThat(mazeInput, is(expectedMazeInput));


    }

}
