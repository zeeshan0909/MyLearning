package leetcode;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int countZero = 0;
        int countOne = 0;

        for (int i : students) {
            if (i == 0)
                countZero++;
            else
                countOne++;
        }

        for (int j : sandwiches) {
            if (j == 0) {
                if (countZero == 0)
                    break; 
                countZero--;
            } else {
                if (countOne == 0)
                    break; 
                countOne--;
            }
        }

        return countZero + countOne;
    }
}

public class Eat_Lunch {
    public static void main(String[] args) {
        Solution ref = new Solution();
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        int ans = ref.countStudents(students, sandwiches);
        System.out.println(ans);
    }
}
