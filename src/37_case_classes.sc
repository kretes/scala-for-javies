//now thats' an easy way to create a value object class
case class Customer(name:String, isAdmin:Boolean)
val nfon1: Customer = new Customer("NFON",true)
val nfon2: Customer = new Customer("NFON",true)
val adminCustomer: Customer = new Customer("admin",true)


nfon1.equals(nfon2)
nfon1.equals(adminCustomer)


nfon1 == nfon2
nfon1 == adminCustomer

nfon1.toString
adminCustomer.toString

nfon1.hashCode == nfon2.hashCode
nfon1.hashCode == adminCustomer.hashCode
