import java.io.*;

import java.util.*;

public class que1

{

	public static void main(String[] x)

	{

		File f = new File("abc.txt");

		System.out.println();

		try

		{

			FileInputStream fi = new FileInputStream(f);

			

			int i = fi.read();

			int lineCount=1;

			System.out.print("Path " + lineCount + ": ");

			while(i != -1)

			{

				if((char)i == '\n')

				{

					System.out.println();

					lineCount++;

					System.out.print("Path " + lineCount + ": ");

				}

				else

					System.out.print((char)i);

				i = fi.read();

			}

			fi.close();

		}

		catch(IOException e)

		{

			System.out.println(e);

		}

		System.out.println("\n");

	}

}