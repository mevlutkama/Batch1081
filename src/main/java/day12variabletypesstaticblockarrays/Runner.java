package day12variabletypesstaticblockarrays;

public class Runner {
    public static void main(String[] args) {
        //To access a non-static variable you have to create object
        VariableTypes01 obj=new VariableTypes01();
        System.out.println(obj.name);

        //Actually you can access to static class members by using objects,
        //It is not recommended
        System.out.println(obj.age);//13

        //To access a static variable no need to create object,just class name is enough
        System.out.println(VariableTypes01.age);//13

        System.out.println(obj.add(3,5));//8

        System.out.println(obj.mul(3,5));

    }
}
