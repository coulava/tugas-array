import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        
        int[] angka = {1, 2, 3};
        int[] angka2 = new int[5]; //Array ketika belom engetahui data nya
        angka2[0] = 10;
        angka2[3] = 100;

        String[] nama = {"Ana", "Salsa", "Adi"};
        String[] nama2 = new String[10]; //Array ketika belom mengetahui data nya

        //array object
        Scanner s = new Scanner(System.in);
        System.out.println("Mau berapa objek kak?");
        int jumlahObjek = s.nextInt();
        Product[] p = new Product[jumlahObjek]; //untuk membuat array
        for(int i = 0; i < p.length; i++){
            System.out.println("Number: ");
            int number = s.nextInt();
            s.nextLine();
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Quantity: ");
            int quantity = s.nextInt();
            System.out.println("Price: ");
            double price = s.nextDouble();
            p[i] = new Product(number, name, quantity, price);
            p[i].print();
        }
        p[1] = new Product(); //untuk membuat object
        


        Cd[] c = new Cd[5];
        c[4] = new Cd();
    }

}
