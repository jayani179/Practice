package javaloop_H.W;

public class Even_Odd_While {
    public static void main(String[] args) {
        int cnt=1;
        int num=1;
        System.out.print("10 Even Numbers :");

        while (cnt <= 10){
            if(num%2==0)
            {
                System.out.print(" "+num);
                cnt++;
            }
            num++;
        }

        cnt=1;
        num=1;
        System.out.println();
        System.out.print("10 Odd Numbers :");

        while (cnt <= 10){
            if(num%2!=0)
            {
                System.out.print(" "+num);
                cnt++;
            }
            num++;
        }

    }
}
