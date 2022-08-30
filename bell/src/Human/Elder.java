package bell.src.Human;

import bell.src.Child.Child;

public class Elder {
    public static void main(String[] args) {

        Child akash = new Child();
        Child child = akash;
        child.setAge(24);
        child.setName("Rubin");

        System.out.println(child.getAge() +" "+child.getName());
    }
}
