fun main(args: Array<String>){ println("Enter Number: ")
var num: Int= Integer.valueOf(readLine()) var temp= 0
var cube_num = num*num*num while (num!=0){ if(num%10 != cube_num%10)
{ temp=l; break;}
num/=10 cube_num/=10} if (temp==0){
println("It's a Trimorphic number.")} else {
println("It's not a Trimorphic number.")
}}
