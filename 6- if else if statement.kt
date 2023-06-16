fun main()
{
    

    var b =readLine()!!.toInt()
    
    if(b>18)
    {
        println("You are an adult")
    }
    else if (b<=18 && b>=14)
    {
        println("you are teenager")
    }
    else if(b<=14 && b>=7)
    {
        println("you are a child")
    }
    else if(b<7 && b>=1)
    {
        println("you are an infant")
    }
    
    else(b<=0)
    {
        println("enter a valid age")
    }
    
   
}
