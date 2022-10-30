/**
 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
 */

int solution(int n) {
    if(n == 1)
        return 1;
    int area = 1;
    for(int i=1; i < (n - 1) ; i++) {
        area += (i * 2) + 1;
    }
    area *= 2;
    area += (n * 2) - 1;
    // for(int i=n; i > 0 ; i--) {
    //     area += (i * 2) + 1;
    // }
    
    return area;
}
