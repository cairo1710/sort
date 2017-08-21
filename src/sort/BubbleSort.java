package sort;
import java.io.*;
public class BubbleSort {
	public static String filereader()
    {String asd="";
     try{    
            BufferedReader br = new BufferedReader(new FileReader("/Users/cairo.gulati/Desktop/testout3.txt"));    
             asd=br.readLine();  
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
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length-1;j++){
				if (arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
for (int i=0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
}
	}

}
