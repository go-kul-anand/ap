open class customer{ var cus_id: Int= O; var name : String="";
var address : String="";} class depositer(): customer(){ var acc_no: Int= O;
var branch: String=""; var balance: Int= O;} class borrower(): customer(){
var loan_id: Int= O; var amt_sanc: Int= O; var amt_released: Int= O;}
fun main(args: Array<String>)
{ val person= depositer();
person.name= "Michael"; println("${person.name} is a depositer");}
 
