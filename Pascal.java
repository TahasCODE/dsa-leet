
import java.util.*;



class Pascal{
    public static void main(String [] args){
        List<List<Integer>> list3 = pivotTriange(6);
          for(int i = 0; i < list3.size(); i++){
            System.out.println(list3.get(i));
        }
    }

    public static List<List<Integer>> pivotTriange(int numRows){
    List<List<Integer>> result = new ArrayList<List<Integer>>();
      result.add(new ArrayList<Integer>());
      result.get(0).add(1);
      for(int row = 1; row < numRows; row++){
        List<Integer> numRow = new ArrayList<>();
        numRow.add(1);

        List<Integer> prevRow = result.get(row - 1);
        for(int i = 1; i < row; i++){
            numRow.add(prevRow.get(i) + prevRow.get(i - 1));
        }
        numRow.add(1);
        result.add(numRow);
      }
      return result;
    }
}