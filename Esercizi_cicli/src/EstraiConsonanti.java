import java.util.Scanner;

public class EstraiConsonanti
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] consonanti = {"b","c","d","f","g","h","l","m","n","p","q","r","s","t","v","w","x","y","z"};
        String Solo_Consonanti = "";
        System.out.println("Inserisci una parola o una frase");
        String Parola = input.nextLine();
        for(int i=0; i<Parola.length(); i++)
        {
            String lettera = Parola.substring(i,(i+1));
            for(int j=0;j< consonanti.length;j++)
            {
                if (lettera.equals(consonanti[j]))
                {
                    Solo_Consonanti = Solo_Consonanti + lettera;
                }
            }
        }
        System.out.println("Le consonanti sono: " + Solo_Consonanti);
    }
}
