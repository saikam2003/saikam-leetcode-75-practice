import java.lang.Math;
public class Problem11 {
    public int maxArea(int[] height) {
        int i = 0;
        int n = height.length;
        int j = n - 1;
        int maxArea = 0;
        
        while (i < n / 2 && j >= n / 2) {
            if (height[i] > height[j]) {
                j--;
                if (calculateArea(Math.min(height[i], height[j]), i, j) > maxArea) {
                    maxArea = calculateArea(Math.min(height[i], height[j]), i, j);
                }
                
            } else if (height[j] > height[i]) {
                i++;
                if (calculateArea(Math.min(height[i], height[j]), j, i) > maxArea) {
                    maxArea = calculateArea(Math.min(height[i], height[j]), j, i);
                }
            }
        }

        return maxArea;
    }

    public int calculateArea(int a, int pos_a, int pos_b) {
        return a * (pos_a * pos_b);
    }
    
    
    //main boilerplate
    public static void main(String[] args) {
        Problem11 problem = new Problem11();
        System.out.println(problem.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
