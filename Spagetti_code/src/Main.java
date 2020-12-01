/*
opp  konsepti polmorphism , inheratance vb yapıları öylesine yazmıyorum bunları yazıyor ve kullanıyor olmamızın sebebi....
Gerçek hayatta sürdürülebilir yazılımlar oluşturmak için kullanıyoruz.
*******
Sürdürülebilir yazılım nedir ? 

Değişime direnc göstermeyen yazılımlara denir.

*/
public class Main {
    public static void main(String[] args) {
        Product_Manager product_Manager = new Product_Manager();
        product_Manager.add(new Product(1, "SU", 2),1);
       
    }
    
}
