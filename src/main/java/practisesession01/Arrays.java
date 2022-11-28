package practisesession01;

public class Arrays {
    public static void main(String[] args) {
        String str[]={"Ellie", "Susan", "Michael", "George", "Tom"};
        String name="George";
        int counter=0;
        for (String w: str){
            if (w.equals("George")){
                counter++;
            }
        }
        String res=counter>0 ? name+" exists" : name + " does not exist";
        System.out.println(res);





    }
}
