import java.util.Scanner;

public class login {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner (System.in);
        String sukunimi = "";
        String etunimi = "";
        String tarkistus = "";
        String verkkotunnus = "";
        
        System.out.println("etunimi? ");
            etunimi = in.nextLine();

        System.out.println("sukunimi? ");
            sukunimi = in.nextLine();

        System.out.println("Yrityksen verkkotunnus? ");
            verkkotunnus = (in.nextLine());

    if (etunimi.isEmpty()) {
        System.out.println( "Virhe. Aloita operaatio alusta.");
        in.close();
        return;
    }
    if (sukunimi.isEmpty()) {
        System.out.println( "Virhe. Aloita operaatio alusta.");
        in.close();
        return;
    }
    if (verkkotunnus.isEmpty()) {
        System.out.println( "Virhe. Aloita operaatio alusta.");
        in.close();
        return;
    }


    GenerateEmail(etunimi, sukunimi, verkkotunnus);
    GenerateUsername(etunimi, sukunimi);
    }
public static void GenerateEmail(String etunimi, String sukunimi, String verkkotunnus)
{

    String sposti = (etunimi + "." + sukunimi + "@" + verkkotunnus).toLowerCase();
    System.out.println(sposti);
}
public static void GenerateUsername(String etunimi, String sukunimi)
{
    String etun = etunimi.substring(0, 4);
    String suku = sukunimi.substring(sukunimi.length() - 4);
    String tunnus = (etun + suku).toLowerCase();
    System.out.println(tunnus);
}
}

// Ohjelmointityyli 
//     Koodissa on 2 tai useampia kommentteja ja kommentit ovat merkityksellisiä: 1 piste 
//     Koodi on “kauniisti” ja systemaattisesti sisennetty: 1 piste 
//     Muuttujien ja metodien nimet ovat kuvaavia: 1 piste 

