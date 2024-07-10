package com.example.testneat

class MyClass(var curr:Int){


var money_memory= mutableListOf("")

    fun draft(money:Int){

        curr+=money
        print("the curr balance is $curr")
        money_memory.add("the curr balance is $curr")


    }
    fun withdraw(money:Int){

       if(money>curr){
           print("insufficient balance")
       }
        else{
            curr-=money
           print("the curr balance is $curr")
           money_memory.add("the curr balance is $curr")

       }


    }

fun prints(){

    print(money_memory)
}




}


fun main(){
    var curr=1000
    var money:MyClass=MyClass(curr)

    money.draft(100)
    money.withdraw(50)
    money.prints()



}
