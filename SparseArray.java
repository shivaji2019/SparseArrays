


/*sparse array
 *There is a collection of input strings and a collection of query strings.
 *For each query string, determine how many times it occurs in the list of input strings. 
 */




import java.util.*;

public class SparseArray {

    // Complete the matchingStrings function below.
   static int[] matchingStrings(String[] strings, String[] queries) {
           int c=strings.length;
           int q=queries.length;
           int a[]=new int[q];
           int count=0;
           for(int i=0;i<q;i++)
           {
               for(int j=0;j<c;j++)
               {
                   if(queries[i].equals(strings[j]))
                   {
                       count++;
                   }
               }
               a[i]=count;
                     count=0;
               
           }
            return a;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
