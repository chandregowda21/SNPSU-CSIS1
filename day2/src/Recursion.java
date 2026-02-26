/*
public class Recursion {
    static void print(int n){
        if(n==0){
            return;
        }

        print(n-1);
        System.out.println(n);// call stack print from 1 to 5
    }
    public static void main(String[] args){
        int n=5;
        print(n);
    }
}

 */

// 1 2 3 4=10
/*
public class Recursion{
    static int sumofdigit(int n){
        if(n==0){
            return 0;

        }
        return n%10 + sumofdigit(n/10);
    }
    public static void main(String[] args){
        int n=1234;
        System.out.println(sumofdigit(n));
    }
}

 */

//count the digits
/*
public class Recursion{
    static int countdigit(int n){
        if(n==0){
            return 0;

        }
        return 1+countdigit(n/10);
    }
    public static void main(String[] args){
        int n=1234;
        System.out.println(countdigit(n));
    }
}
 */

//reverse the number
/*
public class Recursion{
    static int reverse(int n, int rev){
        if(n==0){
            return rev;

        }
        return reverse(n/10,rev * 10 + n%10);
    }
    public static void main(String[] args){
        int n=1234;
        System.out.println(reverse(n,0));
    }
}
 */


/*
//power of
public class Recursion{
    static int powerOf(int x, int n){
        if(n==0){
            return 1;

        }
        return x*powerOf(x,n-1);
    }
    public static void main(String[] args){
        int n=2;
        System.out.println(powerOf(2,5));
    }
}
 */

/*
//fibonacci
public class Recursion{
    static int fibo(int n){
        if(n<=n){
            return n;

        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args){
        int n=10;
        System.out.println(fibo(n));
    }
}
 */
//joseph problem
public class Recursion{
    static int josh(int n, int k){
        if(n==1){
            return 0;

        }
        return (josh(n-1,k)+k)%n;
    }
    static int findWinnew(int n, int k){
        return josh(n,k)+1;
    }
    public static void main(String[] args){
        int n=5;
        int k=2;
        System.out.println(findWinnew(n,k));
    }
}
