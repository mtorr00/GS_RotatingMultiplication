import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4,5,6,7,8};
        int[] test2 = {2,2,2,2,2};
        int[] test3 = {4,5,6,3,4,7,6};

        productOutput(product(test1));
        productOutput(product(test2));
        productOutput(product(test3));

//        System.out.print("{");
//        for (int i:
//             answer1) {
//            System.out.print(i + ", ");
//        }
//        System.out.print("}\n{");
//        for (int i:
//                answer2) {
//            System.out.print(i + ", ");
//        }
//        System.out.print("}\n{");
//        for (int i:
//                answer3) {
//            System.out.print(i + ", ");
//        }


    }

    public static int[] product(int[] nums){
        List<Integer> numsList = new ArrayList<>();
        for (int i:nums) {
            numsList.add(i);
        }
        List<Integer> answerList = new ArrayList<>();
        for (int i: numsList) {
            List<Integer> tempList = new ArrayList<>(numsList);
            tempList.remove(tempList.indexOf(i));
            int tempValue = 1;
            for (int x:tempList) {
                tempValue *= x;
            }
            answerList.add(tempValue);
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void productOutput(int[] answer){
        System.out.print("{");
        for (int i = 0; i < answer.length - 1;i++){
            System.out.print(answer[i] + ", ");
        }
        System.out.println(answer[answer.length-1] + "}");
    }

}
