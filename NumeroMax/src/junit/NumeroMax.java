
package junit;

public class NumeroMax
{
    public static int max(int[] a) {
        int i, m = 0, x = 0;
        char operador = '>';
        
        if(a == null) {
            return 0;
        }
        
        for (i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                x++;
                if(x == a.length) {
                    operador = '<';
                } else {
                    operador = '>';
                }
            }
        }
            
        for (i = 0; i < a.length; i++) {
            if(operador == '>') {
                if (a[i] > m) 
                    m = a[i];
            } else {
                if (a[i] < m) 
                    m = a[i];
            }
                   
        }
        return m;
    }
}
