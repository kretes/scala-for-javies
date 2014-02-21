case class Customer(name:String, isAdmin:Boolean)

val adminPrototype: Customer = new Customer("admin",true)

val newAdmin: Customer = adminPrototype.copy(name = "new admin name")

