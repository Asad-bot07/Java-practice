/*
 * Experimenting with constructor call via inheritance
 * when we have a parameterized constructor in the parent/base class we need to first pass the value of the constructor when the objec t
 * of the child class is called and then in the child class constructor we use "super" keyword to send the values of the base class constructor 
 * its like a ladder with n number of men passing water to the top most man and then the rest
 *  */
class ConstructorPlayGround{
    ConstructorPlayGround()//constructor A
    {
        System.out.println("Hi, from constructor A");
    }
}
class ConstructorPlayGroundB extends ConstructorPlayGround{
    ConstructorPlayGroundB(){
        System.out.println("Hi, from constructor B");
    }
    public static void main(String[] args){
        ConstructorPlayGroundB ob=new ConstructorPlayGroundB();
    }
}
/*
 * Hi, from constructor A
 * Hi, from constructor B
 */