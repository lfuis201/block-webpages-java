package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Modelo {

    public void blockSite(String url) throws IOException {

        String OS = System.getProperty("os.name").toLowerCase();

        String hostsFile = "";
        if ((OS.indexOf("win") >= 0)) {

            hostsFile = "C:/Windows/System32/drivers/etc/hosts";
        } 
        else {

            System.err.println("Sorry");
            System.exit(0);
        }

        // Actually block site

        Files.write(Paths.get(hostsFile), ("\n"+ "127.0.0.1 " + url ).getBytes(), StandardOpenOption.APPEND);
    }

        public void blockSite2(String url) throws IOException {

        String OS = System.getProperty("os.name").toLowerCase();

        String hostsFile = "";
        if ((OS.indexOf("win") >= 0)) {

            hostsFile = "C:/Windows/System32/drivers/etc/hosts";
        } 
        else {

            System.err.println("Sorry");
            System.exit(0);
        }

        // Actually block site

        Files.write(Paths.get(hostsFile), ("\n"+ url ).getBytes(), StandardOpenOption.APPEND);
    }
    
    
}
