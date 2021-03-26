fun main() {
    var n = 327;
    var result = count(n);
    println(result);
}

fun count(n : Int) :Int {
    var number = n;
    var sum = 0;
    var multiply = 1;
    while(number > 0) {
        var reminder = number % 10;
        sum += reminder;
        multiply *= reminder
        number /= 10;
    }
    var answer = multiply - sum;
    return answer;
}
