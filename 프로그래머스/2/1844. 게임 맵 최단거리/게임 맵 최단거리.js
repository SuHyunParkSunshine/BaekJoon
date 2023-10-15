function solution(maps) {

    let answer = 0;
    const visited = Array.from({ length: maps.length }, () => Array.from({ length: maps[0].length }, () => 0));

    bfs(maps, visited)
    answer = visited[maps.length - 1][maps[0].length - 1]

    if(answer == 0) return -1;    

    return answer;

    function bfs(maps, visited) {

        const dx = [1, -1, 0, 0]; // 동서남북
        const dy = [0, 0, 1, -1];

        const x = 0;
        const y = 0;
        visited[x][y] = 1;
        let queue = [[x, y]];

        while (queue.length > 0) {
            const current = queue.shift();
            let cX = current[0];
            let cY = current[1];

            for (let i = 0; i < 4; i++) {
                let nX = cX + dx[i];
                let nY = cY + dy[i];

                if (nX < 0 || nX > maps.length - 1 || nY < 0 || nY > maps[0].length - 1)
                    continue;

                if(visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.push([nX, nY]);
                }
            }
        }

    }
}