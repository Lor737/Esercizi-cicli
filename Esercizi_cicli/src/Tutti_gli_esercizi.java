import java.util.Scanner;

public class Tutti_gli_esercizi
{
    public static void main(String[] args)
    {
        System.out.println("Scegli l'esercizio da vedere premendo i seguenti numeri:");
        System.out.println("1 - Estrai le Vocali");
        System.out.println("2 - Lunghezze");
        System.out.println("3 - Somma Pari e Dispari");
        System.out.println("4 - Secondo Array");
        System.out.println("5 - Somma e media di numeri");
        System.out.println("6 - Somma elementi di posizione pari");
        System.out.println("7 - Estrai consonanti");
        Scanner input = new Scanner(System.in);
        int NumeroEsercizio = input.nextInt();
        input.nextLine();
        if (NumeroEsercizio == 1)
        {
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
        if (NumeroEsercizio == 2)
        {
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
        if (NumeroEsercizio == 3)
        {
            int[] Numeri = {3, 7, 8, 2, 67, 43, 0, 78, 9, 5};
            int Somma_numeri_pari = 0;
            int Somma_numeri_dispari = 0;
            for (int i=0; i< (Numeri.length/2);i++)
            {
                Somma_numeri_pari = Somma_numeri_pari + Numeri[i*2];
                Somma_numeri_dispari = Somma_numeri_dispari + Numeri[(i*2)+1];
            }
            if (Somma_numeri_pari == Somma_numeri_dispari)
            {
                System.out.println("La somma dei numeri con indice pari è uguale alla somma dei numeri con indice dispari");
                System.out.println("Pari e Dispari Uguali");
            }
            if (Somma_numeri_pari != Somma_numeri_dispari)
            {
                System.out.println("La somma dei numeri con indice pari è diverso dalla somma dei numeri con indice dispari");
                System.out.println("Pari e Dispari Diversi");
            }
        }
        if (NumeroEsercizio == 4)
        {
            System.out.println("Inserisci i 10 numeri");
            int[] numeri = new int[10];
            for(int i=0;i<10;i++)
            {
                System.out.println("Numero " + (i+1));
                numeri[i] = input.nextInt();
            }

            int max_numeri_positivi = 0;

            for(int j=0;j< 10;j++)
            {
                if (numeri[j] >= 0)
                {
                    max_numeri_positivi += 1;
                }
            }
            int[] numeri_positivi = new int [max_numeri_positivi];

            for(int j = 0, i=0; i<max_numeri_positivi && j < 10;j++)
            {
                if (numeri[j] >= 0)
                {
                    numeri_positivi[i] = numeri[j];
                    i++;
                }
            }
            System.out.println("I numeri maggiori o uguali a 0 sono:");
            for(int i=0;i<max_numeri_positivi;i++)
            {
                System.out.println(numeri_positivi[(max_numeri_positivi-1)-i]);
            }
        }
        if (NumeroEsercizio == 5)
        {
            System.out.println("Dimmi, quanti numeri vuoi inserire?");
            int max_numeri = input.nextInt();
            int[] numero = new int[max_numeri];
            double somma = 0;
            double media = 0;

            for(int i = 0;i<max_numeri;i++)
            {
                System.out.println("Numero " + (i+1));
                numero[i] = input.nextInt();
                somma = somma + numero[i];
            }
            media = somma/max_numeri;
            System.out.println("La somma dei numeri è: " + somma);
            System.out.println("La media dei numeri è: " + media);
        }
        if (NumeroEsercizio == 6)
        {
            System.out.println("Dimmi, quanti numeri vuoi inserire?");
            int max_numeri = input.nextInt();
            int[] numero = new int[max_numeri];
            int somma = 0;

            for(int i = 0;i<max_numeri;i++)
            {
                System.out.println("Numero " + (i+1));
                numero[i] = input.nextInt();
                if (i%2== 0)
                {
                    somma = somma + numero[i];
                }
            }
            System.out.println("La somma dei numeri con indice pari è: " + somma);
        }
        if (NumeroEsercizio == 7)
        {
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
}
