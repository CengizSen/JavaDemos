public class main {
    public static void main(String[] args) {

         String[] ogrenciler=new String[3];
         ogrenciler[0]="Cengiz";
         ogrenciler[1]="Naber";
         ogrenciler[2]="Merhaba";

         for(int i=0;i< ogrenciler.length;i++){
             System.out.println(ogrenciler[i]);
         }
         for(String ogrenci:ogrenciler){
             System.out.println(ogrenci);
         }

    }
}

