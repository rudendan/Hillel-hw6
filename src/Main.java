import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};

        System.out.println(containsDuplicate(numbers));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));

        int[] result = twoSum(new int[]{2,5,5,11}, 10);
        System.out.println(result[0] + " " + result[1]);
    }

    private static boolean isPalindrome(String palindrome) {

        List<String> alphaNumeric = new ArrayList<>(Arrays.asList(palindrome.replaceAll("[^a-zA-Z0-9]",
                "").toLowerCase().split("")));
        List<String> temp = new ArrayList<>(alphaNumeric);
        Collections.reverse(alphaNumeric);
        return temp.equals(alphaNumeric);
    }
    private static boolean containsDuplicate(int[] nums) {

        Set<Integer> numbers = new HashSet<>();

        for (int number: nums)
            numbers.add(number);

        return numbers.size() < nums.length;
    }

        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> numbers = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (numbers.containsKey(target - nums[i])) {
                    return new int[] {numbers.get(target - nums[i]), i};
                }
                numbers.put(nums[i], i);
            }
            return new int[] {};
        }
    }

