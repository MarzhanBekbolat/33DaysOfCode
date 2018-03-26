import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AreaOfParallelogram{
static int B;
static int H;
static boolean flag=true;


static{
    try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));             
    B=Integer.parseInt(br.readLine());
    H=Integer.parseInt(br.readLine());
    if(B<=0||H<=0)
        throw new Exception("Breadth and height must be positive");
    }
    catch(Exception e)
    {
        System.out.print(e);
        flag=false;;
    }

 }
 public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
