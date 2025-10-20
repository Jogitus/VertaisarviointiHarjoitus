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

        System.out.println("Annoit seuraavat tiedot: " + etunimi + " " + sukunimi + " " + verkkotunnus + " " + " Jos tiedot ovat Oikein kirjoita O, Väärin kirjoita V.");
            tarkistus = in.nextLine();

    if (!tarkistus.equalsIgnoreCase("O")){
        System.out.println("Error: <Please Try Again>");
        }
    GenerateEmail(etunimi, sukunimi, verkkotunnus);
    }
public static void GenerateEmail(String etunimi, String sukunimi, String verkkotunnus)
{

    String sposti = (etunimi + "." + sukunimi + "@" + verkkotunnus).toLowerCase();
    System.out.println(sposti);
}
}

// GenerateEmail-metodi
//     Metodin kutsuminen: 1 piste 
//     Metodin parametrit: 1 piste 
//     Sähköpostiosoitteen muodostaminen: 1 piste 
//     Merkkien muuttaminen pieniksi kirjaimiksi: 1 piste 

// GenerateUsername-metodi
//     Etunimestä 4 ensimmäistä merkkiä: 2 pistettä 
//     Sukunimestä 4 viimeistä merkkiä: 2 pistettä 

// Ohjelmointityyli 
//     Koodissa on 2 tai useampia kommentteja ja kommentit ovat merkityksellisiä: 1 piste 
//     Koodi on “kauniisti” ja systemaattisesti sisennetty: 1 piste 
//     Muuttujien ja metodien nimet ovat kuvaavia: 1 piste 

