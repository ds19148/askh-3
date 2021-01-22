import java.lang.String;
import java.util.Scanner;
public class HomeAppliancesStore{
    public static String onomaeterias;
    public static String dieuthinsi;
    public static int ergates;
    public static void main(String[]args){
        try{
            Scanner Obj1=new Scanner(System.in);
            System.out.println("bale onoma eterias:");
            String onometerias=Obj1.nextLine();
            if(onometerias==(" ")){
                System.out.println("lathos");
            }


            {
                Scanner Obj2=new Scanner(System.in);
                System.out.println("bale thn dieuthinsi:");
                String dieutheterias=Obj2.nextLine();
                if(dieutheterias==(" ")){
                    System.out.println("lathos");
                }
            }

            {
                Scanner Obj3=new Scanner(System.in);
                System.out.println("bale ergates:");
                int ergateseterias=Integer.parseInt(Obj3.nextLine());
                if (ergateseterias==0||ergateseterias<0)
                {
                    System.out.println("lathos");

                }
            }
        }
        catch(Exception e)
        {
            System.out.println(onomaeterias);
            System.out.println(dieuthinsi);
            System.out.println(ergates);

        }
    }
}
