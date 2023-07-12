import java.util.List;



public class Main {
 private static List<Integer>list=List.of(15, 5, 20, 10, 35);
    public static void main(String[] args) {
        boolean b = multiSet(list);
        System.out.println(b);
    }
    private static boolean multiSet(List<Integer>integers){
        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        return sum % 2 == 0;
    }
}