package grayBox;

import java.io.File;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import sort.BubbleSort;
import sort.ISort;
import sort.QuickSort;

public class GrayBox {
	public static void main(String[] args) throws Exception {
		ISort iSort;
		
		
		Configuration configuration;

		Serializer serializer = new Persister();
		Scanner sc = new Scanner(System.in);

		System.out.println("Input size of data to sort(int): ");
		int sizeOfData = sc.nextInt();

		if (sizeOfData > 100) 
		{
			configuration = new Configuration("QuickSort");
		} 
		
		else 
		{
			configuration = new Configuration("BubbleSort");
		}

		File result = new File("Configuration.xml");
		serializer.write(configuration, result);
		
		if (configuration.getMethod().equals("QuickSort")) 
		{
			iSort = new QuickSort();
		}
		
		else
		{
			iSort = new BubbleSort();
		}
		iSort.Sorting();
	}
}
