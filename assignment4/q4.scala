object MyApp extends App{
	
	val acc1= new Account("Navod",20,3600)
	val acc2= new Account("Shehan",2000,3000)

	var bank:List[Account]=List(acc1,acc2)
	

	val find=(n:String,b:List[Account])=>b.filter(x=>x.nic.equals(n))


	val overdraft=(b:List[Account])=> b.filter(x=>x.balance < 0)

	val balance=(b:List[Account])=> b.map( x => (x,x.balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

	val interest=(b:List[Account])=>b.map( x => {
        x.balance match {
            case a if a >= 0 => x deposit x.balance * 0.05
            case _ => x withdraw Math.abs(x.balance) * 0.01

        }
        x
    })

     println("bank " + bank )
    println()
    println("find " + find("Shehan", bank) )
    println()
    println("overdraft " + overdraft( bank ) )
    println()
    println("balance " + balance( bank )._2 )
    println()

    bank = interest( bank )

    println("bank " + bank )
    println()
    println("balance " + balance( bank )._2 )
    println()

class Account(id:String,n: Int, b: Double) {
	val nic:String=id
	val acnumber:Int = n
	var balance: Double = b

	def withdraw( amount : Double ) = this.balance -= amount

    def deposit ( amount : Double ) = this.balance += amount

    def transfer( amount : Double , that : Account ): Unit = {
        this.balance =  this.balance - amount
        that.balance = that.balance + amount
    }

	override def toString ="["+nic+":"+acnumber +":"+ balance+"]"
}
	
}
