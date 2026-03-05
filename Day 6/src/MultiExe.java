public class MultiExe {
    static void checkValues(int num,String text)throws ArithmeticException,NullPointerException{
        if(num<0){
            throw new ArithmeticException("Number can't Negative");
        }
        if (text == null){
            throw new NullPointerException("Text can't be null");
        }
        System.out.println(num +" "+text);
    }
    public static void main(String[] args){
        try{
            checkValues(-5,null);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException n){
            System.out.println(n.getMessage());
        }
    }
}
