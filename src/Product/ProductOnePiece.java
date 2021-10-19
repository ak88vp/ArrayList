package Product;

import java.util.ArrayList;

public class ProductOnePiece implements ProductManager<Product> {
    private ArrayList<Product> list;

    public ProductOnePiece(ArrayList<Product> list) {
        this.list = list;
    }

    public ProductOnePiece() {
        this.list=new ArrayList<>();
    }

    @Override
    public void add(Product product) {

        list.add(product);
    }

    @Override
    public void print() {
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("---------End----------");
    }

    @Override
    public int find(int id) {
        int index=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                System.out.println(list.get(i));
                System.out.println("-----------End-------------");
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(int id) {
        list.remove(this.find(id));
    }

    @Override
    public void sort() {
        list.sort((a,b)->b.getMoney()-a.getMoney());
    }

    @Override
    public void set(int id, Product product) {
list.set(find(id),product);
    }
}
