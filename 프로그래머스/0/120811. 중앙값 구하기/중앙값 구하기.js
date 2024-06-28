function solution(array) {
    var temp = 0;
    for(var i = 1; i < array.length; i++){
        for(var j = 0; j < i; j++){
            if(array[j] > array[i]){
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
    }
    
    var answer = array[parseInt(array.length/2)];
    return answer;
}