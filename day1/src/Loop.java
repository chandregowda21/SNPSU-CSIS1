public class Loop {
    public static void main(String[] args){
        int a=10;
        while(a<20){
            System.out.println(a);
            a++;
        }

        int b=100;
        do{
            System.out.println(b);
            b++;
        }while (b<20);

        //for loop unique values
        int [] arr = {4,2,1,5,2,4,1};
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result = result ^ arr[i];
        }
        System.out.println("the unique element is:"+result);
    }
}