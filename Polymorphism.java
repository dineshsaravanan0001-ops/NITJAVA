class calculator{
    int add(int num1,int num2)
    {
        return num1+num2;
    }
    int add(int num1,int num2,int num3)
    {
        return num1+num2+num3;
    }
    double add(double num1,double num2){
        return num1+num2;
    }
}
class Animal{
    void sound(){
        System.out.println("Animal sound");
    }

}
class cat extends Animal
{
    @Override
    void sound(){
        System.out.println("cat sound");
    }
}
 class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog parks");
    }
 }
 class PolymorphismEx{
    public static void main(String[]args){
        Animal[] arr={new Animal(),new cat(),new Dog()};
        for(Animal a:arr);
    }
    
    }
