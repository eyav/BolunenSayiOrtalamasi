import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sayi1, ortalama, sayi2, dongu;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayiyi giriniz::");
        sayi1 =inp.nextDouble();

        ortalama =0;
        dongu =0;
        sayi2=0;

        for(int i = 1; i <= sayi1; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);

                dongu ++;
                sayi2 +=i;
                ortalama = sayi2/dongu;

            }
        }

        System.out.println("3 ve 4'e bölünen sayiların ortalama:" + ortalama);

    }
}
