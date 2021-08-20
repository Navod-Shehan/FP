object MyApp extends App{
	var bank:List[Account]=List()
	val acc= new Account("Navod",20,3000)
	println (acc)
}

class Account(id:String,n: Int, b: Double) {
	val nic:String=id
	val acnumber: Int = n
	var balance: Double = b

	def withdraw( amount : Double ) = this.balance -= amount

    def deposit ( amount : Double ) = this.balance += amount

    def transfer( amount : Double , that : Account ): Unit = {
        this.balance =  this.balance - amount
        that.balance = that.balance + amount
    }

	override def toString ="["+nic+":"+acnumber +":"+ balance+"]"
}
