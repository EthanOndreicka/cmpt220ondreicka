// Ethan Ondreicka // Professor Arias // April 5, 2022 //
import java.util.Scanner;
public class Project3 {

public static void print(char[][] maze) {

for (int i = 0; i < maze.length; i++)
	System.out.println(new String(maze[i]));
}

public static char[][] findExit(char[][] maze) {
	
	int direction = 0;
	int r = 0;
	int c = 0;

	outer: for (int i = 0; i < maze.length; i++)
		for (int j = 0; j < maze[0].length; j++)
			if (maze[i][j] == '*')
				{
				r = i;
				c = j;
				break outer;
				}

	if (r == 0)
		direction = 1;
	if (r == maze.length - 1)
		direction = 2;
	if (c == 0)
		direction = 3;
	if (c == maze[0].length - 1)
		direction = 4;
	
    // down 1 | up 2 | right 3 | left 4
    // while loop to find the exit (&)
	while (maze[r][c] != 'x')
		{
		if (maze[r][c] == '.' || maze[r][c] == '*')
			{
			if (direction == 1)
				r++;
			else if (direction == 2)
				r--;
			else if (direction == 3)
				c++;
			else if (direction == 4)
				c--;
			}

		else if (maze[r][c] == '/')
			{
			if (direction == 1)
				{c--; direction = 4;}
			else if (direction == 2)
				{c++; direction = 3;}
			else if (direction == 3)
				{r--; direction = 2;}
			else if (direction == 4)
				{r++; direction = 1;}
			}

		else if (maze[r][c] == '\\')
			{
			if (direction == 1)
				{c++; direction = 3;}
			else if (direction == 2)
				{c--; direction = 4;}
			else if (direction == 3)
				{r++; direction = 1;}
			else if (direction == 4)
				{r--; direction = 2;}
			}
		}

		maze[r][c] = '&';
		return maze;
}

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int house = 0;

while (true)
	{
	house++;
    // reads in number of columns and rows
    System.out.print("Enter number of colummns and Rows: ");
	int cols = scan.nextInt();
	int rows = scan.nextInt();

    // if both inputs are 0, break
	if (cols == 0 && rows == 0)
		break;

	char[][] maze = new char[rows][cols];

    // for loop to read in the house
    System.out.println("Enter the House Diagram: ");
	for (int r = 0; r < rows; r++)
		{
		String row = scan.next();

		for (int c = 0; c < cols; c++)
			maze[r][c] = row.charAt(c);
		}
    // print out which house num and house WITH exit
	System.out.println("HOUSE " + house);
	print(findExit(maze));
	}

scan.close();
	}
}
