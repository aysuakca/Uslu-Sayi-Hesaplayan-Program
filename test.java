import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int n, k;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen Ussu Alinacak Sayiyi Giriniz (n) :");
        n = inp.nextInt();

        System.out.print("Lutfen Us Olacak Sayiyi Giriniz (k) :");
        k = inp.nextInt();

        int total = 1;

        for (int i=1; i <=k ; i++){
            total *= n;
        }
        System.out.print("Cevap : " + total);
    }
}







