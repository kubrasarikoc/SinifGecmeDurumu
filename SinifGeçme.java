import java.util.Scanner;

public class SinifGeçme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat<0 || mat>100){
            mat = 0;
        }

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        if (fizik<0 || fizik>100){
            fizik = 0;
        }
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        if (turkce<0 || turkce>100){
            turkce= 0;
        }
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (kimya<0 || kimya>100){
            kimya = 0;
        }
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        if (muzik<0 || muzik>100){
            muzik = 0;
        }

        double ort = (mat+fizik+turkce+kimya+muzik)/5;
        System.out.println("Ortalamanız : "+ort);

        if (ort >= 55) {
            System.out.println("Sınıfı Geçtiniz !");
        } else {
            System.out.println("Sınıfta Kaldınız !");
        }
    }
}
