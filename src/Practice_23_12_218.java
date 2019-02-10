import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//Adding comments
public class Practice_23_12_218 {
	//Method to print values in ascending order
	public static void printValues(Map<String,Integer> map){
		//Write your code here
		int[] arr = new int[map.size()];
		int i=0;
		for(Entry<String, Integer> m:map.entrySet())
		{
			arr[i] = m.getValue();
			i++;
		}
		
		arr = sort(arr);
		
		for(int j:arr)
		{
			System.out.print(" "+j);
		}
		
		
	}
	
    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    swap(j - 1, j, numbers);
                }
            }
        }
        return numbers; // returning the final sorted array
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
	public static void main(String[] x){
		Map<String,Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String key;
		int value;
		for(int i = 1; i <= num; i++){
			key = sc.next();
			value = sc.nextInt();
			map.put(key,value);
		}
		printValues(map);
	}
}
