class StackUsingArray(size:Int){ var stackSize = size;
var stackArr = IntArray(stackSize); var top= -1;
fun push(entry: Int) { try{
top+= 1 println("Adding: $entry") this.stackArr[top] = entry
}
catch(e:Exception){ println("Stack is full.")
}}
fun pop(){ try{
var entry= this.stackArr[top--] println("Removed entry: $entry")
}
catch(e:Exception){ println("Stack is empty")
}}
fun size(): Any {
 

return top+l
}
fun peek(): Any { return stackArr[top]}
fun isStackEmpty(): Boolean { return top == -1}
fun isStackFull(): Boolean { return top== stackSize - I
}}
fun main(args: Array<String>) { val stack= StackUsingArray(3) stack.push(1)
stack.push(3) stack.push(909) stack.push(42) stack.push(52) stack.pop()
println("Is stack empty : "+stack.isStackEmpty()) println("size of stack : " +stack.size()) println("peek: "+stack.peek())}
