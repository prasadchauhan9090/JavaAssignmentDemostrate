package Demo.com;

public class LoopsConcepts {


    public static void main(String args[])
    {

        int count=0;
        for(int i=200;i>25;i--)
        {

            if(i%2!=0) {

                count=count+1;
                System.out.println(i);
            }

        }

        System.out.println("count of odd number ares: "+count);


    }
}
