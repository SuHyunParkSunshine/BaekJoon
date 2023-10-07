function solution(players, callings) {

    let playersMap = new Map();

    // players를 Map으로 재생성
    for(let i = 0; i < players.length; i++) {
        playersMap.set(players[i], i);        
    }

    for(let str of callings) {
        let index = playersMap.get(str);

        // players 배열 갱신
        let front = players[index - 1] 
        let back = players[index]

        players[index - 1] = back;
        players[index] = front;

        // playersMap 갱신
        playersMap.set(back, index - 1);
        playersMap.set(front, index);
    }
    return players;
}