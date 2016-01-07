/**
 * Created by Bolesław on 2016-01-07.
 */
public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[] = new int[4];

        try{
            System.out.println("Przed wygenerowaniem wyjatku");
            //generuje wyjatek zwiazany z przekroczeniem zakresu tablicy

            nums[7] = 10;  // proba uzyca indexu spoza zakresu tablicy
            System.out.println("Ten komunikat nie zostanie wyswietlony");
        } catch (ArrayIndexOutOfBoundsException exc){
            //przechwytuje wyjatek
            System.out.println("Indeks spoza zakresu");
        }
        System.out.println("Za klauzula catch.");
    }
}
