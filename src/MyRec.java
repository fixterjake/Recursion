/**
 * Implementation of RecursionADT
 * 
 * @author Jacob Boyles
 * @version 1.0
 */
public class MyRec implements RecursionADT {

    /*
     * (non-Javadoc)
     * 
     * @see RecursionADT#fact(java.lang.Integer)
     */
    @Override
    public Integer fact(Integer n) throws IllegalArgumentException {
        if (n == 0) {
            return 1;
        }
        else if (n < 0) {
            throw new IllegalArgumentException();
        }
        else {
            return n * fact(n - 1);
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see RecursionADT#isPal(java.lang.String)
     */
    @Override
    public Boolean isPal(String s) {
        if (s.length() < 2) {
            return true;
        }
        else {
            char front = s.charAt(0);
            char rear = s.charAt(s.length() - 1);
            return (front == rear) && isPal(s.substring(1, s.length() - 1));
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see RecursionADT#isInt(java.lang.String)
     */
    @Override
    public Boolean isInt(String s) {
        // TODO Auto-generated method stub
        return null;
    }

}
