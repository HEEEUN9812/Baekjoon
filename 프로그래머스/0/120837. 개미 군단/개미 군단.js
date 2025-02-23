function solution(hp) {
    
    let first = Math.floor(hp / 5);
    hp -= first * 5;
    
    let second = Math.floor(hp / 3);
    hp -= second * 3;
    
    let final = Math.floor(hp / 1);
    
    return first + second + final;
}