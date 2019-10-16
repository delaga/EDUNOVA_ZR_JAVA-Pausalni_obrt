/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zavrsnirad.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author mirza
 */
public class Utils {
    public static String getFormatDatumaIVremena(){
        return "dd. MMMM. YYYY. HH:mm:ss";
    }
    
    
    public static boolean isDev(){
        return true;
    }
    public static String ucitajURL(String adresa){
        try {
            URL url = new URL(adresa);
            InputStreamReader isr = new InputStreamReader(url.openStream(), "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            StringBuilder sb = new StringBuilder();
            //lošije
           // String rez="";
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                //lošije
                //rez+=line+"\n";
            }
            return sb.toString();
            //lošije
            //System.out.println(rez);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
