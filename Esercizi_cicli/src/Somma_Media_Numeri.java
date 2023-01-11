import java.util.Scanner;

public class Somma_Media_Numeri
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
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
}
