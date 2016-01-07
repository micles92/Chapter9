/**
 * Created by Bolesław on 2016-01-07.
 */
public class ExcDemo3 {
    public static void main(String[] args) {
        int numer[] = {4, 8, 17, 32, 64, 128};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i<numer.length;i++){
            try{
                System.out.println(numer[i] + " / " + denom[i] + " rowna sie " + numer[i]/denom[i] );
            } catch (ArithmeticException exc){
                System.out.println("Nie mozna  dzielic przez zero.");
            }
        }
    }
}
