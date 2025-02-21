/* Scrivi un programma Java che stampi tutti i numeri pari compresi tra 1 e 50.  e ne riporti la somma 

EXTRA:  Far si che si possa scegliere l'intervallo di numeri stampati e stoppare prima o dopo.  */
public class SommatoriPari{
    public static void main(String[] args) {
        int somma = 0;
        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
                somma+=i;
            }
        }
        System.out.println("somma totale: "+somma);
    }
}