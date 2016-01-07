/**
 * Created by Bolesław on 2016-01-07.
 */

class ExcTest{
    //generuje wyjatek
    static void genException(){
        int nums[] = new int[4];

        System.out.println("Przed wygenerowaniem wyjatku.");

        //generuje wyjatek zwiazany z przekroczeniem zakresu tablicy

        nums[7] = 10;
        System.out.println("Komunikat nie zostanie wygenerowany");
    }
}

public class ExcDemo2 {
    public static void main(String[] args) {
        try{
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc){
            //przechwytuje wyjatek
            System.out.println("Indeks spoza zakresu.");
        }
        System.out.println("Za klauzula catch");
    }
}
