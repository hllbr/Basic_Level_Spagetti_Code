
public class Main2 {
    public static void main(String[] args) {
        Product_Manager product_Manager = new Product_Manager();
        product_Manager.add(new Product(1, "SU", 2),2);
        //yeni bir özellik geldiğinde hiçbir oynama yapmamk gerekiyor bu kodelar spagetti kod oldukları için bir çok iş yükü ve zaman kaybettirir.
        //yaptığın işlemden productManager etkilenmemesi gerekiyor.
        //Sadece configiration dosyalarınızın değişmesi gerekiyor.
    }
    
}
