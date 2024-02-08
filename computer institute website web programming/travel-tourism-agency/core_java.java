public class core_java
{
       public static void main(String[] args)
       {
           order o=new order(1,"pen",100,10,2,"lamp",1002,6);
           System.out.println(o.oid);
           
       }
}

class product
{
    int id;
    String name;
    int price;
    int quantity;
    public product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
}
 class order extends product
{
   
        int oid;
        String oname;
        int oprice;
        int oquantity;
        public order(int oid, String oname, int oprice, int oquantity,int id,String name,int price,int quantity) {
            super(id,name,price,quantity);
            this.oid = oid;
            this.oname = oname;
            this.oprice = oprice;
            this.oquantity = oquantity;
        }
    
}
