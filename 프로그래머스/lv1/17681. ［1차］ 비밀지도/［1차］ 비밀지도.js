function solution(n, arr1, arr2) {
    
    var answer = [];

    for (var i = 0; i < n; i++) {
        let binary_result = (arr1[i] | arr2[i]).toString(2);
        binary_result = binary_result.replace(/1/g, "#").replace(/0/g, " ");
        
        while(binary_result.length < n) {
            binary_result = ' ' + binary_result;
        }
        
       answer[i] = binary_result;
    }

    return answer;
}