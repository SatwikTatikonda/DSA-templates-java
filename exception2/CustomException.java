package exception2;

import java.util.*;

class MyException extends Exception{
    
    public MyException(String msg){
        super(msg);
    }
}
public class CustomException
{
	public static void main(String[] args) {
	
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Number enter chran baabu!!");
	    int num=sc.nextInt();
	    try{
	        
	        System.out.println("number entered "+num);
	        if(num%5==0){
	            throw new MyException(" sorry number cant be multiple of 5");
	        }
	        System.out.println("format of number entered is correct ");
	    }
	    catch(MyException me){
	        System.out.println(me);
	    }
	    
	}
}

