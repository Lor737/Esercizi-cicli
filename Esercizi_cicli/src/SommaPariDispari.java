public class SommaPariDispari
{
    public static void main(String[] args)
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
}