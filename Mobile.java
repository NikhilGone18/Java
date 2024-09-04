public class Mobile {
    public static class Module{
        int gsmNo = 0;
        Module(){
            System.out.println("New object created");
        }
    }
    public static void main(String[] args){
        Module module =  new Module();
        System.out.println(module);
    }
}

