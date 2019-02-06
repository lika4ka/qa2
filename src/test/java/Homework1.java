import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanRepaymentAmount {

    @Test
    public void LoanRepaymentAmount(){
    int a = 10;
    int b = 8;
    int c = 6;
    int y = 24;

    int x ="sumDigits" 10,8,6;
    System.out.println("Sum is: " + x);
    System.out.println(y!=x);

    Assertions.assertEquals(23,x, "Sum is not correct");
    Assertions.assertEquals(y!= x ,"Sum is correct");
     }

    private int SumDigits (int a, int b, int c) {
        return a + b + c;
    }
}
