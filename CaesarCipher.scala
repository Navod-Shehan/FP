object CaesarCipher{

	def main(args : Array[String]){	
	
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
	
		val D=(c:Char,key:Int,a:String)=>if ((a.indexOf(c.toUpper)-key)<0) (a((a.indexOf(c.toUpper)-key+a.size)%a.size)) else (a((a.indexOf(c.toUpper)-key)%a.size))
		
		val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

		val s="FUNCTIONALPROGRAMMING"

		val ct=cipher(E,s,3,alphabet)
		println(ct)
	
		val pt=cipher(D,ct,3,alphabet)
		println(pt)
	}
}
