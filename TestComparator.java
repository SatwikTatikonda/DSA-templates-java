import java.util.*;

class valcomparator implements Comparator<Integer> {

    
    public int getFact(int n) {
        int i = 1;
        int cnt = 0;
        while (i * i <= n) {
            if (n % i == 0) {
                if (i == n / i) {
                    cnt += 1;
                } else {
                    cnt += 2;
                }
            }
            i += 1;
        }
        return cnt;
    }

    public int compare(Integer n1, Integer n2) {
        int cnt1 = getFact(n1);
        int cnt2 = getFact(n2);
        System.out.println(cnt1);
        if (cnt1 < cnt2) {
            return -1;
        } else if (cnt1 > cnt2) {
            return 1;
        } else {
            if (n1 < n2) {
                return -1;
            } else {
                return 1;
            }
        }
    }

}

public class TestComparator {

    public static void main(String[] args) {
        valcomparator vc = new valcomparator();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(6);
        nums.add(8);
        Collections.sort(nums, vc);
        System.out.println(nums);

    }

}
