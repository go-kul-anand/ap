
interface Employeein { var id: Int
var e_name : String var e_dept : String
fun displaydet() : String
}
class Employee : Employeein { override var id : Int =O
override var e_name : String = "" override var e_dept : String = "" override
fun displaydet() : String{
return "Employee ID: ${id} \n Employee Name: ${e_name}\n Department:
${e_dept}"}}
fun main (args: Array<String>){ var e1 = Employee()
el.id= 21
el .e name= "John"
 

el.e_dept = "sales" println(e1.displaydet())
}

