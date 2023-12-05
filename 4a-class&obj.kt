class Doctor(){ var d_id: Int= O;
var d_name: String=""; var yoe: Int= O; var dept: String="";
fun getUserid(id: Int, name: String)
{ d_id = id
d name =name
println("User Id ofDr.${name} is ${id.toString()+name.subSequence(0,3)}.")}} fun main(args: Array<String>) {
var doctor = Doctor() doctor.yoe = 5
doctor.dept= "Radiology" doctor.getUserld (21, "Rami") println("Department: ${doctor.dept}") println("Experience: ${doctor.yoe} ")}
 
