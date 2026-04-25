public class EvenNumbers {
    public static void main(String[] args) {
        //PRINT ALL EVEN NUMBERS FROM 0 TO 1000000
        for (int num=1;num<=1000000;num++){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
