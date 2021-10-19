package Product;

public class Main {
    public static void main(String[] args) {
        ProductOnePiece onePiece = new ProductOnePiece();
        onePiece.add(new Product("Shanks", 111, 4048));
        onePiece.add(new Product("BigMon", 222, 4388));
        onePiece.add(new Product("KaiDo", 333, 4611));
        onePiece.print();
        onePiece.delete(222);

        onePiece.print();
        onePiece.set(111, new Product("ChoPer", 444, 100));
        onePiece.print();
        onePiece.sort();
        onePiece.print();
    }
}
