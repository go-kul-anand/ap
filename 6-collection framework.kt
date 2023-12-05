fun main(args: Array<String>)
{
println("List Operations")
val store_items: MutableList<String> = mutableListOf("Banana", "Carrot", "Apple") store_items.add("Orange")
println(store_items) println("Deletion of 'Carrot"') store_items.remove("Carrot") println(store_items)
println("Accessing 2nd element: ${store_items[1]}")
}
