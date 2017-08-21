package sort;

import java.io.BufferedReader;
import java.io.FileReader;

public class NewSort {
	public static String filereader()
    {String asd="";
     try{    
            BufferedReader br = new BufferedReader(new FileReader("/Users/cairo.gulati/Desktop/testout3.txt"));    
             asd=br.readLine();  
             br.close();
            return asd;    
  
            
          }catch(Exception e){System.out.println(e);}  
    
    return asd;}
	public static void main(String[] args) {
		String as=filereader();
		String[] array=as.split(",");
		int[] arr=new int [array.length];
		for (int i =0; i<array.length;i++){
			arr[i]=Integer.parseInt(array[i]);
		}
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
		
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
