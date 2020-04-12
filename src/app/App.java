package app;
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.InetAddress;

public class App {
    public static void main(String[] args) throws Exception {
        String ipAddress = "";  //stores IP Address
        try{
            //link to findmyip bot
            URL link = new URL("http://bot.whatismyipaddress.com");
            //allows us to read from the link
            BufferedReader sc = new BufferedReader(new InputStreamReader(link.openStream()));
            
            //read the system IP address
            ipAddress = sc.readLine().trim();
        } catch(Exception ex){
            ipAddress = "ERROR! ERROR! ERROR!";
        }
        //print everything out
        System.out.println("Your public IP address is: " + ipAddress);
    }
}