public class Wraper {
    public static void main(String args[]){
        
         Horse h1 = new Horse();
      
    }
    public static class Animal{
        int legs = 4;
        public Animal(int legs){
            System.out.println("Legs -> "+legs);
        }
    }
    static class Horse extends Animal{
        public Horse(6){
            System.out.println("it had four legs");
        }
      
        
    }
}
