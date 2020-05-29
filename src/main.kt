import java.util.*;
val sc=Scanner(System.`in`)
class Time(internal var hours: Int, internal var minutes: Int, internal var seconds: Int)
fun timeDifference(start: Time, stop: Time):Time{
    val diff=Time(0,0,0)
    if(stop.seconds>start.seconds){
        --start.minutes
        start.seconds+=60
    }
    diff.seconds=start.seconds-stop.seconds
    if(stop.minutes>start.minutes){
        --start.hours
        start.minutes+=60
    }
    diff.minutes=start.minutes-stop.minutes
    diff.hours=start.hours-stop.hours
    return diff
}
fun evenodd(){
    println("Enter a number:")
    val num=sc.nextInt()
    if(num%2==0)
        println("$num is even.")
    else
        println("$num is odd.")
}
fun asciifinder(){
    println("Enter a character:")
    val c:Char=sc.next().single()
    val ascii= c?.toInt()
    println("The ASCII value of $c is: $ascii")
}
fun vowelcons(){
    println("Enter an alphabet:")
    val c:Char=sc.next().single()
    if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
        println("$c is vowel.")
    else
        println("$c is consonant")
}
fun leapornot(){
    println("Enter year:")
    val y=sc.nextInt()
    var leap=false
    if(y%4==0){
        if(y%100==0){
            leap= y%400==0
        } else{
            leap = true
        }

    }
    else{
        leap=false
    }
    println(if(leap)"$y is a leap year." else "$y is not a leap year.")
}
fun sumtilln(){
    println("Enter a number:")
    val num=sc.nextInt()
    var sum=0
    for (i in 1..num){
        sum+=i
    }
    println("Sum till $num is $sum")
}
fun factorial(){
    println("Enter a number:")
    val num=sc.nextInt()
    var fact: Long=1
    for(i in 1..num){
        fact*=i.toLong()
    }
    println("Factorial of $num is $fact")
}
fun tableofn(){
    println("Enter a number:")
    val num=sc.nextInt()
    for(i in 1..10){
        val product=num*i
        println("$num * $i = $product")
    }
}
fun fib(){
    println("Enter a number upto which fibonacci series is to be printed:")
    val num=sc.nextInt()
    var t1=0
    var t2=1
    println("The first $num terms are:")
    for(i in 1..num){
        print("$t1 ")
        val sum=t1+t2
        t1=t2
        t2=sum
    }
}
fun gcd(){
    println("Enter first number:")
    val a=sc.nextInt()
    println("Enter second number:")
    val b=sc.nextInt()
    var g=1
    var i=1
    while(i<=a && i<=b){
        if(a%i==0 && b%i==0)
            g=i
        ++i
    }
    println("GCD of $a and $b is $g")
}
fun lcm(){
    println("Enter first number:")
    val a=sc.nextInt()
    println("Enter second number:")
    val b=sc.nextInt()
    var l: Int
    l= if(a>b) a else b
    while(true){
        if(l%a==0 && l%b==0){
            println("The LCM of $a and $b is $l")
            break
        }
        ++l
    }
}
fun nodigits(){
    println("Enter a number:")
    var num=sc.nextInt()
    var count=0
    while(num!=0){
        num/=10
        ++count
    }
    println("The number of digits is $count")
}
fun reverse(){
    println("Enter a number:")
    var num=sc.nextInt()
    var reversed=0
    while(num!=0){
        val digit=num%10
        reversed=reversed*10+digit
        num/=10
    }
    println("Reversed number is $reversed")
}
fun primeornot(){
    println("Enter a number:")
    val num=sc.nextInt()
    var flag=false
    for(i in 2..num/2){
        if(num%i==0){
            flag=true
            break
        }
    }
    if(!flag){
        println("$num is a prime number.")
    }
    else{
        println("$num is not a prime number.")
    }
}
fun palindrome(){
    println("Enter a number:")
    var num=sc.nextInt()
    var reversedInteger=0
    var remainder: Int
    var originalInteger: Int
    originalInteger=num
    while(num!=0){
        remainder=num%10
        reversedInteger=reversedInteger*10+remainder
        num/=10
    }
    if(originalInteger==reversedInteger){
        println("$originalInteger is a palindrome.")
    }
    else{
        println("$originalInteger is not a palindrome.")
    }
}
fun displayprime(){
    println("Enter lower bound integer:")
    var low=sc.nextInt()
    println("Enter upper bound integer:")
    var high=sc.nextInt()
    while(low<high){
        var flag=false
        for(i in 2..low/2){
            if(low%i==0){
                flag=true
                break
            }
        }
        if(!flag)
            print("$low ")
        ++low
    }
}
fun factors(){
    println("Enter a number:")
    val number=sc.nextInt()
    print("Factors of $number are: ")
    for(i in 1..number){
        if(number%i==0){
            print("$i ")
        }
    }
}
fun simplecalc(){
    println("Enter first number:")
    val first=sc.nextDouble()
    println("Enter second number:")
    val second=sc.nextDouble()
    println("Enter an operator (+, -, *, /):")
    val operator=sc.next()[0]
    val result:Double
    when(operator){
        '+'-> result=first+second
        '-'-> result=first-second
        '*'-> result=first*second
        '/'-> result=first/second
        else->{
            System.out.printf("Error! operator is not correct")
            return
        }
    }
    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result)
}
fun checkPrime(num:Int):Boolean{
    var isPrime=true
    for(i in 2..num/2){
        if(num%i==0){
            isPrime=false
            break
        }
    }
    return isPrime
}
fun expresssumprime(){
    println("Enter a number:")
    val num=sc.nextInt()
    var flag=false
    for (i in 2..num/2){
        if(checkPrime(i)){
            if(checkPrime(num-i)){
                System.out.printf("%d = %d + %d\n",num, i, num-i)
                flag=true
            }
        }
    }
    if(!flag){
        println("$num cannot be expressed as the sum of two prime numbers.")
    }
}
fun reversesen(sentence: String):String{
    if(sentence.isEmpty()){
        return sentence
    }
    return reversesen(sentence.substring(1))+sentence[0]
}
fun reverseSentence(){
    println("Type a sentence to be reversed:")
    sc.nextLine()
    val sentence=sc.nextLine()
    val reversed=reversesen(sentence)
    println("The reversed sentence is: $reversed")
}
fun calcAvg(){
    println("Enter number of entries:")
    val n=sc.nextInt()
    var sum=0.0
    println("Enter the numbers one by one:")
    for(i in 1..n){
        val x=sc.nextDouble()
        sum+=x
    }
    val a=sum/n
    println("The average of these numbers is $a")
}
fun maximumNumber(){
    println("Enter number of entries:")
    val n=sc.nextInt()
    println("Enter the numbers one by one:")
    var m=0.0
    for(i in 1..n){
        val x=sc.nextDouble()
        if(x>m){
            m=x
        }
    }
    println("The largest among the given numbers is $m")
}
fun rootsOfQuadraticEquation(){
    println("Enter the coefficients of the quadratic equation of form ax^2+bx+c=0:")
    println("Enter a:")
    val a=sc.nextDouble()
    println("Enter b:")
    val b=sc.nextDouble()
    println("Enter c:")
    val c=sc.nextDouble()
    val root1: Double
    val root2: Double
    val output: String
    val determinant=b*b-4.0*a*c
    if(determinant>0){
        root1=(-b+Math.sqrt(determinant))/(2*a)
        root2=(-b-Math.sqrt(determinant))/(2*a)
        output="root1 = %.2f and root2 = %.2f".format(root1,root2)
    }
    else if(determinant==0.0){
        root2=-b/(2*a)
        root1=root2
        output="root1 = root2 = %.2f".format(root1)
    }
    else{
        val realPart=-b/(2*a)
        val imaginaryPart=Math.sqrt(-determinant)/(2*a)
        output="root1 = %.2f+%.2fi and root2 = %.2f-%.2fi".format(realPart,imaginaryPart,realPart,imaginaryPart)
    }
    println(output)
}
fun freqchar(){
    println("Enter any string:")
    sc.nextLine()
    val str=sc.nextLine()
    println("Enter a character:")
    val ch=sc.next().single()
    var frequency = 0
    for(i in 0..str.length-1){
        if(ch==str[i]){
            ++frequency
        }
    }
    println("Frequency of $ch is $frequency")
}
fun compstr(){
    println("Enter first string:")
    sc.nextLine()
    val str1=sc.nextLine()
    println("Enter second string:")
    val str2=sc.nextLine()
    if(str1==str2){
        println("Equal")
    }
    else{
        println("Not Equal")
    }
}
fun main(){
    println("Welcome to the multipurpose program in kotlin!")
    println("This program allows you to select from a list of activities you want to perform.")
    println("Enter a number from the list:")
    println("1. Find the ASCII value of a character.")
    println("2. Check whether a number is even or odd.")
    println("3. Check whether alphabet is vowel or consonant.")
    println("4. Check whether an year is lep or not.")
    println("5. Calculate sum of natural numbers till n.")
    println("6. Find factorial of a number.")
    println("7. Multiplication table of a number.")
    println("8. Fibonacci series.")
    println("9. Find GCD of two numbers.")
    println("10. Find LCM of two numbers.")
    println("11. Find number of digits in an integer.")
    println("12. Reverse a number.")
    println("13. Check whether a number is prime or not.")
    println("14. Check whether a number is palindrome or not.")
    println("15. Display all prime numbers between two integers.")
    println("16. Display factors of a number.")
    println("17. Simple Calculator for two numbers.")
    println("18. Check whether a number can be expressed as a sum of two prime numbers.")
    println("19. Reverse a sentence.")
    println("20. Calculate average.")
    println("21. Find the maximum among the numbers.")
    println("22. Find roots of Quadratic Equation.")
    println("23. Find frequency of a character in a given string.")
    println("24: Compare two strings.")
    println("25: Calculate difference between two time periods.")
    val opt:Int=sc.nextInt()
    when(opt){
        1->{
            asciifinder()
        }
        2->{
            evenodd()
        }
        3->{
            vowelcons()
        }
        4->{
            leapornot()
        }
        5->{
            sumtilln()
        }
        6->{
            factorial()
        }
        7->{
            tableofn()
        }
        8->{
            fib()
        }
        9->{
            gcd()
        }
        10->{
            lcm()
        }
        11->{
            nodigits()
        }
        12->{
            reverse()
        }
        13->{
            primeornot()
        }
        14->{
            palindrome()
        }
        15->{
            displayprime()
        }
        16->{
            factors()
        }
        17->{
            simplecalc()
        }
        18->{
            expresssumprime()
        }
        19->{
            reverseSentence()
        }
        20->{
            calcAvg()
        }
        21->{
            maximumNumber()
        }
        22->{
            rootsOfQuadraticEquation()
        }
        23->{
            freqchar()
        }
        24->{
            compstr()
        }
        25->{
            println("Enter first time:")
            println("Hour:")
            val sh=sc.nextInt()
            println("Minutes:")
            val sm=sc.nextInt()
            println("Seconds:")
            val ss=sc.nextInt()
            println("Enter second time:")
            println("Hour:")
            val eh=sc.nextInt()
            println("Minutes:")
            val em=sc.nextInt()
            println("Seconds:")
            val es=sc.nextInt()
            val start=Time(sh, sm, ss)
            val stop=Time(eh, em, es)
            val diff:Time
            diff=timeDifference(start, stop)
            print("TIME DIFFERENCE: ${start.hours}:${start.minutes}:${start.seconds} - ")
            print("${stop.hours}:${stop.minutes}:${stop.seconds} ")
            print("= ${diff.hours}:${diff.minutes}:${diff.seconds}")
        }
    }
}