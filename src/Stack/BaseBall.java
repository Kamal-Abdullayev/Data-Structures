package Stack;

import java.util.Stack;

public class BaseBall {

    // 682. Baseball Game
    public static void main(String[] args) {
        calPoints(new String[]{"5", "2", "C", "D", "+"});
        calPoints(new String[]{"5","-2","4","C","D","9","+","+"});
        calPoints(new String[]{"1","C"});
    }

//    public static int calPoints(String[] operations) {
//        int score = 0;
//        Stack<Integer> scoreList = new Stack<>();
//
//        for (int i = 0; i < operations.length; i++) {
//            switch (operations[i]) {
//                case "+": {
//                    int prev = scoreList.pop();
//                    int value = prev + scoreList.peek();
//                    scoreList.push(prev);
//                    scoreList.push(value);
//                    score += value;
//                    break;
//                }
//                case "D": {
//                    int value = scoreList.peek() * 2;
//                    scoreList.push(value);
//                    score += value;
//                    break;
//                }
//                case "C": {
//                    score -= scoreList.pop();
//                    break;
//                }
//                default: {
//                    int val = Integer.parseInt(operations[i]);
//                    scoreList.push(val);
//                    score += val;
//                    break;
//                }
//            }
//
//        }
//
//        return score;
//    }

    public static int calPoints(String[] operations) {
        int score = 0;
        Stack<Integer> scoreList = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+": {
                    int prev = scoreList.pop();
                    int value = prev + scoreList.peek();
                    scoreList.push(prev);
                    scoreList.push(value);
                    break;
                }
                case "D": {
                    int value = scoreList.peek() * 2;
                    scoreList.push(value);
                    break;
                }
                case "C": {
                    scoreList.pop();
                    break;
                }
                default: {
                    int val = Integer.parseInt(operations[i]);
                    scoreList.push(val);
                    break;
                }
            }

        }

        for(int s : scoreList) score += s;

        System.out.println(score);
        return score;
    }
}
