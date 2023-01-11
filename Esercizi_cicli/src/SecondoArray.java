import java.util.Scanner;
public class SecondoArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
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
}