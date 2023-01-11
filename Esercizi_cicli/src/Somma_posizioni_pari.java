import java.util.Scanner;

public class Somma_posizioni_pari
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
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
}
