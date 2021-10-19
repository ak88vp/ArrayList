package Product;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            selection = scanner.nextInt();
            if (selection > 0 && selection < 7) {
                switch (selection) {
                    case 1:
                        System.out.println("nhập tên nhân vật : ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("nhập id cho nhân vật : ");
                        int id = scanner.nextInt();
                        System.out.println("nhập số tiền truy nã của nhân vật :");
                        int money = scanner.nextInt();
                        onePiece.add(new Product(name, id, money));
                        break;
                    case 2:
                        System.out.println("nhập vào id nhân vật mà bạn muốn xóa : ");
                        int delete_id = scanner.nextInt();
                        onePiece.delete(delete_id);
                        break;
                    case 3:
                        System.out.println("nhập id nhân vật mà bạn muốn sửa");
                        int id_want_to_fix = scanner.nextInt();
                        if (onePiece.find(id_want_to_fix) > -1) {
                            System.out.println("nhập tên nhân vật : ");
                            scanner.nextLine();
                            String setName = scanner.nextLine();
                            System.out.println("nhập id cho nhân vật : ");
                            int setId = scanner.nextInt();
                            System.out.println("nhập số tiền truy nã của nhân vật :");
                            int setMoney = scanner.nextInt();
                            Product product = new Product(setName, setId, setMoney);
                            onePiece.set(id_want_to_fix, product);
                        }
                        break;


                    case 4:
                        System.out.println("nhập id mà bạn muốn tìm");
                        int id_want_to_find = scanner.nextInt();
                        onePiece.find(id_want_to_find);
                        break;
                    case 5:
                        onePiece.sort();
                        break;
                    case 6:
                        onePiece.print();
                        break;
                }

            }
            else if(selection<0||selection>6){
                System.out.println("chúng tôi chưa phát triển chức năng này ! ");
            }else {
                System.out.println("đã tắt chương trình");
            }


        } while (selection != 0);

    }
}
