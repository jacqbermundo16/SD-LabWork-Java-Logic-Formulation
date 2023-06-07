public class FibonacciSeries {
    public static void main(String[] args) {
    
        int n = 10;
        int t1 = 0, t2 = 1;
        System.out.println("First " + n + " terms:");
    
        for (int i = 1; i <= n; ++i) {
        System.out.print(t1 + ", ");
    
        //create a code that computes the next term
        int nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
        }
    }
}
