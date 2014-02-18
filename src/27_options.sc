def fetchCustomer(id:Long) = {
  if(id==1) Some("Customer") else None
}

fetchCustomer(1L).get
fetchCustomer(0L).get

fetchCustomer(0L).getOrElse("Null Object")

fetchCustomer(0L).isEmpty

val noCustomerLength = fetchCustomer(0L).map(_.length)
val customerLength = fetchCustomer(1L).map(_.length)

def printCustomer: (String) => Unit = {
  (customer) => System.out.print("customer " + customer)
}

fetchCustomer(0L).foreach(printCustomer)
fetchCustomer(1L).foreach(printCustomer)
