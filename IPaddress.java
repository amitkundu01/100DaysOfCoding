import java.io.*;
import java.net.*;
public class ip {
public static void main(String[] args) {
    try{
       InetAddress ip=InetAddress.getByName("www.facebook.com");
    System.out.println("Host name "+ip.getHostName());
    System.out.println("ip address "+ip.getHostAddress());
}
    catch(Exception e){System.out.println(e);}
}
}
