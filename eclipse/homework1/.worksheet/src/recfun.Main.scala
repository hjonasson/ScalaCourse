package recfun

object Main {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(215); 
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  };System.out.println("""main: (args: Array[String])Unit""");$skip(137); 

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
		if (c == 0) 1 else if (r == 0) 0 else pascal(c-1,r-1) + pascal(c,r-1);System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(14); val res$0 = 
  pascal(2,3);System.out.println("""res0: Int = """ + $show(res$0));$skip(433); 
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
		if (chars.isEmpty) true
		if (chars.head ==')') false
		def counter(c: List[Char],acc: Int): Int =
			if (c isEmpty) acc
			else if (c.head == '(') counter(c.tail,acc+1)
			else if (c.head == ')') counter(c.tail,acc-1)
			else counter (c.tail,acc)
  	counter(chars,0) == 0
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(107);                                                //: (chars: List[Char])Boolean
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
  	if (money == 0) 1;System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(20); val res$1 = 
  	if (money < 0) 0;System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(70); val res$2 = 
  	if (coins isEmpty) 0
  	else/*This is all in the book prescribed*/;System.out.println("""res2: Any = """ + $show(res$2))}
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
}
