let answer = 0;
function solution(numbers, target) {
    dfs(numbers, 0, target, 0);
    return answer;
}

function dfs(numbers, depth, target, result) {
    if(depth === numbers.length) {
        if(result === target) {
            answer++;
        }
        return;
    }

    let plus = result + numbers[depth];
    let minus = result - numbers[depth];

    dfs(numbers, depth+1, target, plus);
    dfs(numbers, depth+1, target, minus);
}