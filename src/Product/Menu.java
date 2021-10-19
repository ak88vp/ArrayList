package Product;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductOnePiece onePiece = new ProductOnePiece();
        int selection;
        do {
            System.out.println("---------------------Menu-------------------");
            System.out.println(" 1 : thêm nhân vật ");
            System.out.println(" 2 : xóa nhân vật ");
            System.out.println(" 3 : sửa nhân vật ");
            System.out.println(" 4 : tìm kiếm nhân vật ");
            System.out.println(" 5 : sắp xếp  nhân vật ");
            System.out.println(" 6  : Hiển thị  nhân vật ");
            System.out.println(" 0 : kết thúc ");
            selection= scanner.nextInt();
            switch (selection){
                case 1:
                    System.out.println("nhập tên nhân vật : ");
                    scanner.nextLine();
                    String name=scanner.nextLine();
                    System.out.println("nhập id cho nhân vật : ");
                    int id=scanner.nextInt();
                    System.out.println("nhập số tiền truy nã của nhân vật :");
                    int money=scanner.nextInt();
                    onePiece.add(new Product(name, id, money));
                    break;
                case 6 :
                    onePiece.print();
                    break;
            }

        }while (selection!=0);

    }
}
