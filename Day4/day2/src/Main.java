// reverse integer
/*
class Main{
    public static void main(String[] args){
        int n = 123;
        int rev=0;
        int sum=0;
        while(n>0){
            sum=n%10;
            rev = rev*10+sum;
            n=n/10;
        }
        System.out.println(rev);
    }
}

 */

//Bakers problem
/*
public class Main {
    static int maxpiece(int n) {
        int mlines = n * (n + 1) / 2 + 1;
        return mlines;
    }
    // max region using st line
    static int maxregion(int n){
        int maclines = n * (n+1)/2 +1;
        return maclines;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(maxpiece(n));
        System.out.println(maxregion(n));
    }
}
*/


//reverse array
/*
public class Main {
    static void rsbfind(int [] arr){
        int n1 = 0,n2 = 0;
        int xorall = 0;
        for(int i=0;i<arr.length;i++){
            xorall = xorall ^ arr[i];
        }
        int rsb = xorall & -xorall;
        for(int i=0;i< arr.length;i++){
            if((arr[i] & rsb)!=0){
                n1^=arr[i];
            }
            else{
                n2^=arr[i];
            }
        }
        System.out.println("n1="+n1+",n2="+n2);
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,1,2};
        rsbfind(arr);
    }
}
*/


// reverse two numbers using objects
/*
class Number {
    int value;
}
public class Main {
    static void reverse(Number n1,Number n2){
        int temp=n1.value;
        n1.value=n2.value;
        n2.value=temp;
    }
    public static void main(String[] args){
        Number a = new Number();
        Number b = new Number() ;
        a.value = 10;
        b.value = 20;
        reverse(a,b);
        System.out.println("a="+a.value+",b="+b.value);

    }
}
*/

//swap using arrays
/*
public class Main {
    static void swap(int[] arr){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }
    public static void main(String[] args){
        int  x=10,y=20;
        int[] arr = {x,y};
        swap(arr);
        x=arr[0];
        y=arr[1];
        System.out.println("x="+x + ",y="+y);
    }
}
*/


//interview swapping
/*
public class Main {
    static void change(int x){
        x=100;
    }
    static void increment(int[] arr){
        arr[0]++;
    }
    public static void main(String[] args){
        int a =10;
        change(a);
        System.out.println(a);
        int[] arr={5};
        increment(arr);
        System.out.println(arr[0]);//it increment the value so it will be 6
    }
}
 */

public class Main {
    public static void main(String[] args){
        char[][] names = {{'d','e','e','p','t','i'},
                {'s','u','r','y','a'}};
        for(char[] ch:names){
            for(char c:ch){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}