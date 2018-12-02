package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;


public class Day1 {
	public static void main(String[] args) {		
		try {
			File file= new File("Day1Input.txt");
			FileReader fr=new FileReader(file);
			BufferedReader bf=new BufferedReader(fr);
			String str="";
			double result=0;
			ArrayList<Double> array=new ArrayList<>();
			HashSet<Double> hset=new HashSet<>();
			while((str=bf.readLine())!=null) {	
					double aux=Double.parseDouble(str);
					array.add(aux);
					result=result + aux;
					hset.add(result);
					//System.out.println(result);
			}
			System.out.println("First result: "+result);
			
			int i=0;
			do {
				//System.out.println(array.get(i));
				result=result+array.get(i);
				//System.out.println(result);
				i=(i+1)%array.size();
			}while((hset.add(result))==true);
			System.out.println("Second result: "+result);
			
			bf.close();
			
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}
