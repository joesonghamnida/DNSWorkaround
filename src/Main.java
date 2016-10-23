import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by joe on 10/23/16.
 */
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws MalformedURLException, UnknownHostException {

        System.out.println("Please enter the website name: ");
        String urlString = scanner.nextLine();

        InetAddress address = InetAddress.getByName(new URL(urlString).getHost());

        System.out.println(address);
    }
}
