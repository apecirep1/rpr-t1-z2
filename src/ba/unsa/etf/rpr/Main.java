package ba.unsa.etf.rpr;

import java.util.Scanner;
public class Main {

    static int sumaCifara(int b){
        int suma = 0;
        while(b != 0){

            suma += b%10;
            b = b / 10;

        }
        return suma;
    }

    public static void main(String[] args) {
	    Scanner ulaz = new Scanner(System.in);
	    System.out.println("Unesite broj n: ");
	    int n;
	    n = ulaz.nextInt();
	    //int djel;
	    for(int i = 1; i <= n; i++ ){
            //djel = sumaCifara(i);
            if(i%sumaCifara(i) == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
