public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] elements = new boolean[n + 1];
        int i = 2;

        while(i < n+1){
            elements[i] = true;
            i++;
        }
        int j = 2;

        while (j*j <= n){
            if(elements[j] == true){
                int k = j * j;
                while (k <= n){
                    elements[k] = false; 
                    k += j;
                }

            }
                j++;

         }

        int count = 0;
        int p = 2;

        while(p<=n){
        if(elements[p] == true){
        System.out.println(p);
            count++;
        }
        p++;
        }
        System.out.println("There are " + count + " primes between 2 and " + n + ". (" + (int) (((double) count/( n)) * 100) + "% are primes)");

    }


}