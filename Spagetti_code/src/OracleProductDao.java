

public class OracleProductDao {
//veri erişim objesi 
    //Bu alan toplamda veri ekleme güncelleme silme gibi işlemler için kullanılan alandır.
private String connectionString ;

    public OracleProductDao(String connectionString) {
        this.connectionString = connectionString;
    }
public void add(Product product){
    System.out.println("veri erişim katmanı devreye girdi");
    System.out.println("veri erişim katmanı çalışıyor");
    System.out.println("Oracle Database " + product.getName()+" eklendi.");
    System.out.println("****************************************************");
}
    
}
