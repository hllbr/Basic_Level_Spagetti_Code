
public class Product_Manager {
    //iş katmanı class is here 
    //iş Katmanı
    public void add(Product product,int databaseType){
        if(databaseType == 1){
            //Mysql
            MysqlProductDao mysqlProductDao =new  MysqlProductDao("Mysql String");
            mysqlProductDao.add(product);
        }else if(databaseType == 2){
            //Oracle
        OracleProductDao oracleProductDao = new  OracleProductDao("ORACLE String");
        oracleProductDao.add(product);
    

        
        }
        System.out.println("Ürün iş katmanı devreye girdi");
        System.out.println("Ürün iş katmanı devrede");
        System.out.println("Ürün iş katmanı işlemleri");
        System.out.println("Ürün ismi : " +product.getName());
        System.out.println("Ürün fiyatyı : " +product.getPrice());
        
        
//bir birinin alternatifi olan işleri yazılımcılar genel olarak type şeklinde genelde çözüme kavuştururlar


    }
    
}
