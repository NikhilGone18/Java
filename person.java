public class person {
    private String name;
    private int age;
    private String gender;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age= age;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender= gender;
    }
    public person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender=gender;
        
  }
  public static void main(String args[]){
    person obj1 = new person("Nikhil",19,"Male");
    System.out.println(" name  : "+obj1.getName());
    System.out.println(" age   : "+obj1.getAge());
    System.out.println("gender : "+obj1.getGender());
     obj1.setName("Prabhakar");
     obj1.setAge(44);
     obj1.setGender("Male");
     System.out.println(" name   : "+obj1.getName());
     System.out.println(" age    : "+obj1.getAge());
     System.out.println(" gender : "+obj1.getGender());
}
}
