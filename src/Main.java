import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1,number2,select;
        System.out.println("Lütfen 1.Sayıyı Giriniz.");
        number1=scanner.nextInt();
        System.out.println("Lütfen 2.Sayıyı Giriniz.");
        number2=scanner.nextInt();
        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select=scanner.nextInt();
        switch (select){
            case 1:
                System.out.println(number1+number2);
            case 2:
                System.out.println(number1-number2);
            case 3:
                System.out.println(number1*number2);
            case 4:
                System.out.println(number1/number2);
                break;
        }
    }
}