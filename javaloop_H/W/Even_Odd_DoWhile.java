package javaloop_H.W;

public class Even_Odd_DoWhile {
    public static void main(String[] args) {
        int cnt=1;
        int num=1;

        System.out.print("10 Even numbers are :");
        do {
            if(num%2==0)
            {
                System.out.print(" "+num);
                cnt++;
            }
            num++;

        }while(cnt<=10);

        cnt=1;
        num=1;
        System.out.println();
        System.out.print("10 Odd numbers are :");
        do {
            if(num%2!=0)
            {
                System.out.print(" "+num);
                cnt++;
            }
            num++;

        }while(cnt<=10);

   }

}
