/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Lenovo
 */
public class tugasNo3 {

    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("Localhost: "+localhost);
        byte[] ip = localhost.getAddress();
        
        for (int i = 0; i < 254; i++) {
            ip[3] = (byte) i;  // krn yg diubah baris ke 4
            InetAddress address = InetAddress.getByAddress(ip);
            if (address.isReachable(1000)){
                System.out.println(address.getHostAddress() + " - Active");
            } else if(!address.getHostAddress().equals(address.getHostName())){
                System.out.println(address.getHostAddress() + " - DNS lookup known");
            } else{
                System.out.println(address.getHostAddress() + " - Not active");
            }

        }

    }

}
