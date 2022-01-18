import java.util.Scanner;

class Test{
    int a1[],a2[];
    int l1,l2;

    Test() {
        Scanner s = new Scanner(System.in);
        l1 = s.nextInt();
        l2 = s.nextInt();
        a1 = new int[l1];
        a2 = new int[l2];
        for (int i = 0; i < l1; i++) {
            a1[i] = s.nextInt();
        }
        for (int i = 0; i < l1; i++) {
            a2[i] = s.nextInt();
        }
    }

        public void result()
        {
            for(int i:a1)
            {
                int c=0;
                for(int j:a2)
                {
                    if(i<=j)
                    {
                        c=c+1;
                    }
                }
                System.out.print(c + " ");
            }
        }


}
public class Demo {
    public static void main(String[] args) {
        Test obj=new Test();
        obj.result();
    }
}
