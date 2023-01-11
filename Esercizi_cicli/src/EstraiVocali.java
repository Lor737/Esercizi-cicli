import java.util.Scanner;
public class EstraiVocali
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] vocali = {"a", "e", "i", "o", "u"};
        String Solo_Vocali = "";
        System.out.println("Inserisci una parola o una frase");
        String Parola = input.nextLine();
        //questo ciclo for serve per prendere ogni singolo carattere dalla stringa inserita dall'utente
        //e confrontarla con tutte le vocali, eseguendo l'uguaglianza tra la lettera e la vocale,
        //se si verifica la condizione, allora
        //la lettera viene memorizzata su una stringa Solo_Vocali
        for(int i=0; i<Parola.length(); i++)
        {
            //substring(i,(i+1)) va a prendere la sottostringa, che inizia dal carattere i e finisce
            //con il carattere i+1, quindi all'inizio mi prenderà (0,1)
            String lettera = Parola.substring(i,(i+1));
            for(int j=0;j< vocali.length;j++)
            {
                if (lettera.equals(vocali[j]))
                {
                    Solo_Vocali = Solo_Vocali + lettera;
                }
            }

        }
        System.out.println("Le vocali sono: " + Solo_Vocali);
    }
}
/*
   for(int j=0;j< vocali.length;j++)
   {
      if (lettera.equals(vocali[j]))
      {
          Solo_Vocali = Solo_Vocali + lettera;
       }
   }

    for (String s : vocali)
    {
        if (lettera.equals(s))
        {
           Solo_Vocali = Solo_Vocali + lettera;
        }
    }
*/

