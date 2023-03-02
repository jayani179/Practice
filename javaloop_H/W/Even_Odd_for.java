package javaloop_H.W;

public class Even_Odd_for {
    public static void main(String[] args) {
        int num=1,cnt;

        //Even numbers

        System.out.print("10 Even Numbers :");
        for(cnt=1;cnt<=10;num++)
        {
            if (num % 2 == 0)
            {
                System.out.print(" " + num);
                cnt++;
            }//if closed
        }//for closed
        System.out.println();

        //Odd numbers

        System.out.print("10 Odd Numbers :");
        num=1;
        for(cnt=1;cnt<=10;num++)
        {
            if (num % 2 != 0)
            {
                System.out.print(" " + num);
                cnt++;
            }//if closed
        }//for closed
    }
}
