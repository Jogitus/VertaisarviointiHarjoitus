import java.util.Scanner;

public class login {
    public static void main(String[] args) throws Exception { // Main alkaa
        
        Scanner in = new Scanner (System.in);
        String sukunimi = "";
        String etunimi = "";
        String tarkistus = "";
        String verkkotunnus = "";
// Seuraavat kolme kysyvät käyttäjältä tietoja.
        System.out.println("etunimi? ");
            etunimi = in.nextLine();

        System.out.println("sukunimi? ");
            sukunimi = in.nextLine();

        System.out.println("Yrityksen verkkotunnus? ");
            verkkotunnus = in.nextLine();

// Seuraavat kolme tarkistavat onhan kaikkiin kohtiin vastattu. Eli ei tule "  " tyhjiä palautuksia.
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

// Nämä kaksi methdoin kutsumista tulostavat annetuilla tiedoilla sähköpostin ja käyttäjänimen.
    GenerateEmail(etunimi, sukunimi, verkkotunnus);
    GenerateUsername(etunimi, sukunimi);
    } // Main Loppuu

public static void GenerateEmail(String etunimi, String sukunimi, String verkkotunnus)
{

    String sposti = (etunimi + "." + sukunimi + "@" + verkkotunnus).toLowerCase(); // Muotoilee sähköposti osoitteen ja laittaa kaiken lower case kirjoitus tyyliin.
    System.out.println(sposti); // Tulostaa sähköposti osoitteen kokonaisuudessaan.
} //Sähköpostin generointi methodi loppuu.


public static void GenerateUsername(String etunimi, String sukunimi)
{
    String etunimen4 = etunimi.substring(0, 4); // Ottaa etunimestä merkit väliltä 0-4. eli nimen neljä ensimmäistä merkkiä.
    String sukunimen4 = sukunimi.substring(sukunimi.length() - 4); // Ottaa sukunimen pituuden (esimerkiksi pihajoki on 8 merkkiä) ja vähentää siitä halutun 4. Tämä vähennettävä luku on siis se joka tästä tulostuu.
    String tunnus = (etunimen4 + sukunimen4).toLowerCase(); //  Yhdistetään vähennetyt nimet ja muutetaan kaikki lowercase.
    System.out.println(tunnus); // Tulostaa käyttäjätunnuksen kokonaisuudessaan.
}// Käyttäjänimen generointi methodi loppuu.
}


