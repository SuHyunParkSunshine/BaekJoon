function solution(name, yearning, photo) {
    let answer = [];

    let map = new Map();

    for (let i = 0; i < name.length; i++) {
        map.set(name[i], yearning[i]);
    }

    for (let i = 0; i < photo.length; i++) {
        let value = 0;
        for (const str of photo[i]) {

            let score = map.get(str);
            if (score !== undefined) {
                value += score;
            }
        }
        answer[i] = value;
    }

    return answer;
}