function solution(age) {
    const ageStr = age +'';
    var answer = '';
    for(let i = 0; i < ageStr.length; i++) {
        const num = Number(ageStr[i]) + 97;
        answer += String.fromCharCode(num);
    }
    return answer;
}