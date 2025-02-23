function solution(cipher, code) {
    var answer = '';
    for(let i = 1; i < 10000; i++) {
        if(cipher.charAt(i * code - 1) === '') {
            break;
        }
        answer += cipher.charAt(i * code -1);
    }
    return answer;
}