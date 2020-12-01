
public class MysqlProductDao {
    
    private String connectionString ;
    
    
    public MysqlProductDao(String connectionString) {
        this.connectionString = connectionString;
    }
public void add(Product product){
    System.out.println("Mysql product ile işlem başlatıldı ve devm ediyor.");
    System.out.println("veri erişim katmanı devreye girdi");
    System.out.println("veri erişim katmanı çalışıyor");
    System.out.println("Mysql Database " + product.getName()+" eklendi.");
    System.out.println("****************************************************");
}
    
}
