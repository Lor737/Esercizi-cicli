import java.util.Scanner;

public class Lunghezze
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci almeno una parola che inizia con la lettera maiuscola");
        String Parole = input.nextLine();
        String lettera = "";

        int numero_parole = 0;
        int max_numero_parole = 0;

        //ciclo for per ottenere il numero di parole
        for(int i=0; i<Parole.length(); i++)
        {
            lettera = Parole.substring(i,(i+1));
            if (lettera.equals(" "))
            {
                numero_parole += 1;
            }
        }
        max_numero_parole = numero_parole + 1;
        String[] Parola = new String[max_numero_parole]; //questo non è l'index, è il numero di elementi dell'array

        //ciclo for per sostituire il contenuto delle parole con nessun carattere
        //poichè al momento il contenuto è null in tutte le parole dell'array Parola
        for(int j=0; j < max_numero_parole; j++)
        {
            Parola[j] = "";
        }

        //ciclo for per memorizzare le parole nell'array Parola
        for(int i=0; i<Parole.length(); i++)
        {
            lettera = Parole.substring(i,(i+1));
            if (i==0)
            {
                numero_parole = 0;
            }
            if (!lettera.equals(" "))
            {
                Parola[numero_parole] = Parola[numero_parole] + lettera;
            }
            if (lettera.equals(" "))
            {
                numero_parole = numero_parole + 1;
            }
        }

        String [] tutto_minuscolo = new String[max_numero_parole];
        int [] lunghezza_parole = new int[max_numero_parole];
        int lunghezza = 0;

        //ciclo for per portare le parole con la lettera maiuscola in parola con tutte minuscole
        //dopodichè fa la il confronto, se la parola originaria con tutte minuscole è diversa
        // dalla parola originaria, vuol dire che quella parola inizia con una maiuscola.
        //Quindi se questa condizione è verificata allora mi prendi la lunghezza della parola,
        //la memorizzi in un'altra array e alla fine mi sommi ad ogni j la lunghezza nella variabile lunghezza
        for(int j=0; j < max_numero_parole; j++)
        {
            tutto_minuscolo[j] = Parola[j].toLowerCase();
            if (!Parola[j].equals(tutto_minuscolo[j]))
            {
                lunghezza_parole[j] = Parola[j].length();
            }
            lunghezza = lunghezza + lunghezza_parole[j];
        }
        System.out.println("La somma delle lunghezze delle stringhe con la 1°lettera maisucola è: " + lunghezza);
    }
}
