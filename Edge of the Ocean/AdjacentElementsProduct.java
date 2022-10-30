/**
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 */

int solution(int[] inputArray) {
    if(inputArray.length < 2)
        return 0;
    
    int largestProduct = Integer.MIN_VALUE;
    
    for(int i=0; i<inputArray.length; i++) {
        if(i <= inputArray.length - 2) {
            int product = inputArray[i] * inputArray[i + 1];
            if(product > largestProduct) {
                largestProduct = product;
            }
        }
    }
    
    return largestProduct;
}
