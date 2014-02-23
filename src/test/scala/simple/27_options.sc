//Option is a class used to explicitly say that value may not be there
def fetchCustomer(id:Long): Option[String] = {
  if(id==1) Some("Customer") else None
}

//you can force and get the object
fetchCustomer(1L).get
//fetchCustomer(0L).get //or get an excpetion if there is no when you try
//you can specify a fallback value
fetchCustomer(0L).getOrElse("Null Object")

//you can check
fetchCustomer(0L).isEmpty

//finally you can treat option as a collection !!
val noCustomerLength = fetchCustomer(0L).map(_.length)
val customerLength = fetchCustomer(1L).map(_.length)

def printCustomer: (String) => Unit = {
  (customer) => System.out.print("customer " + customer)
}

fetchCustomer(0L).foreach(printCustomer)
fetchCustomer(1L).foreach(printCustomer)
