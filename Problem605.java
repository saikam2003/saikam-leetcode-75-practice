class Problem605 {
    
    public static void main(String[] args) {
        // Your code here
        boolean result = canPlaceFlowers(new int[]{1,0,0,0,1}, 2);
        System.out.println(result);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int possiblePlaces = 0;
        int prevIndex = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed.length == 1 && flowerbed[i] == 0) {
                possiblePlaces++;
                flowerbed[i]= 1;
            } else if (i == 0) {
                if (flowerbed[i + 1] != 1 && flowerbed[i] != 1) {
                    prevIndex = i;
                    possiblePlaces++;
                    flowerbed[i]= 1;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] != 1 && flowerbed[i] != 1) {
                    prevIndex = i;
                    possiblePlaces++;
                    flowerbed[i]= 1;
                }
            } else if ((i > 0 && i < flowerbed.length - 1) && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0
                    && flowerbed[i] == 0 && prevIndex != i - 1) {
                prevIndex = i;
                possiblePlaces++;
                flowerbed[i]= 1;
            }
        }
        if (possiblePlaces >= n)
            return true;
        
        return false;
    }
}