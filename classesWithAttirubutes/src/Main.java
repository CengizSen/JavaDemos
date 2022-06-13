public class Main {
    public static void main (String[] args){
      Product product=new Product();
      product.getId();
      product.setName("Hesap Makinesi");
      /*product.description="Çok Fonksiyonlu Hesap Makinesi";
      product.price=25;
       System.out.println("İncelediginiz Urun: "+product.name +" "+  product.description +" Ürün Fiyatı:  "+product.price+" TL'DİR.");
*/
       ProductManager productManager=new ProductManager();
       productManager.Add(product);

    }

}
