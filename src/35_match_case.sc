//advanced matching is allowed only for case classes
case class Customer(name:String,id:Long)

def matchCustomer(customer:Customer) = customer match {
  case Customer(_,1) => "special customer with id 1"
  case Customer("admin",_) => "admin customer"
  case Customer("normal",_) => "normal customer"
  case Customer(customerName,_) => "customer with name = " + customerName
}



matchCustomer(Customer("admin",2))
matchCustomer(Customer("normal",3))
matchCustomer(Customer("",1))
matchCustomer(Customer("K001",4))

