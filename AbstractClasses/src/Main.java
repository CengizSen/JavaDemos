public class Main {
    public static void main(String[] args) {
       GameCalculator[] gameCalculators=new GameCalculator[]{
               new ChildrenGameCalculator(),
               new WomanGameCalculator(),
               new ManGaemeCalculator()
       };
       for(GameCalculator  gameCalculator:gameCalculators){
           gameCalculator.hesapla();
       }
    }
}