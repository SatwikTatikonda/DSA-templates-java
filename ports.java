import java.io.*; 
import java.lang.*; 
import java.net.*; 
import java.util.*; 
public class ports 
{ 
 public static void main(String args[]) throws Exception 
 { 
 int p[]={7,9,13,20,21,22,23,25,80,110}; 
 String s1[]={"Echo","Discard","Daytime","Ftpdata","Ftp","ssh","Telnet","SMTP","HTTP","POP"}; 
 for(int i=0;i<10;i++) 
 try 
 { 
 Socket s=new Socket("192.168.1.6",p[i]); 
 System.out.println("port\t"+p[i]+""+s1[i]+"\t is active"); 
 } 
 catch(Exception e) 
 { 
 System.out.println("port\t"+p[i]+""+s1[i]+"\t is not active");
 System.out.println(e) ;
 } 
 } 
}