//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       try{
           int[] numbers = new int[3];
           int x = 29;

           if(x>=30){
               throw new Exception("Число x должно быть меньше 30");
           }
           numbers[1] = x;
           numbers[4]=45;
           System.out.println(numbers[1]);
       } catch (ArrayIndexOutOfBoundsException ex){
           System.out.println("Ошибкааааа");
       } catch (Exception e) {
           System.out.println(e.getMessage());
           e.printStackTrace();
       } finally {
           System.out.println();
       }

        try{
            int result = Factorial.getFactorial(-1);
            System.out.println(result);
        } catch (FactorialException ex){
            System.out.println(ex.getNumber());
            System.out.println(ex.getMessage());
        }

    }

}

class Factorial{
    public static int getFactorial(int num) throws FactorialException{

        int result=1;
        if(num<1) throw new FactorialException("The number is less than 1", num);
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}

class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}

    public FactorialException(String message, int num){

        super(message);
        number=num;
    }
}