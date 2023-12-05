fun main(args: Array<String>) { var temp:Int
val arr=arrayOf(l,6,2,4,8,9,3) for (i in 0 until arr.size) {
for (j in i + 1 until arr.size) { if (arr[i] > arr[j]) { temp = arr[i]
arr[i] = arr[j] arr[j] = temp
}}}
println("Minimum:"+arr[0]) println("Maximum"+arr[5])
}
 
