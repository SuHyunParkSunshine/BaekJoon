function solution(s) {

    let eWords = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine'];
   
    for(var i=0; i < eWords.length; i++) {
        s = s.replace(new RegExp(eWords[i], 'g'), i);
    }
    let answer = Number(s);
    return answer;
}