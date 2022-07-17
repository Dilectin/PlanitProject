import java.util.*;
//import java.lang.String;


public class stringOccurance {

    public static void main(String[] args) {

        String str = "aaabbccdddddddaabbc";
        str = str.toUpperCase();

        ArrayList<Character> arrlst = new ArrayList<Character>();
        ArrayList<Integer> arrlstCount = new ArrayList<Integer>();
        int postoAdd = 0;

        for (int i = 0; i < str.length(); i++) {

            if (arrlst.contains(str.charAt(i))) {
                int pos = arrlst.indexOf(str.charAt(i));
                int count = arrlstCount.get(pos);
                arrlstCount.remove(pos);
                arrlstCount.add(pos, ++count);

            } else {
                arrlst.add(postoAdd, str.charAt(i));
                arrlstCount.add(postoAdd, 1);
                postoAdd++;
            }

         }

        System.out.println(arrlst);
        System.out.println(arrlstCount);

        System.out.println( Collections.max(arrlstCount));
        int maxval = Collections.max(arrlstCount);
        System.out.println(maxIndex(arrlstCount));
        int maxind = maxIndex(arrlstCount);
        System.out.println((arrlst.get(maxind)));
    }

    public static int maxIndex(List<Integer> list) {
        Integer i=0, maxIndex=-1, max=null;
        for (Integer x : list) {
            if ((x!=null) && ((max==null) || (x>max))) {
                max = x;
                maxIndex = i;
            }
            i++;
        }
        return maxIndex;
    }
}



