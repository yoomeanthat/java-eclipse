package day16.prac.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		
		try(BufferedReader bf = new BufferedReader(new FileReader("res.acorns.txt")))
		
		{
			BufferedReader bf1 = new BufferedReader( new FileReader("res/acorns.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //FileReader("res/acorns.txt");
	}

}
