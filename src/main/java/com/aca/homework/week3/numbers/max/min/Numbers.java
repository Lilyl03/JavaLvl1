package com.aca.homework.week3.numbers.max.min;

public class Numbers {
    private long number1;
    private long number2;
    private long number3;

public Numbers(int num1,int num2, int num3){
    this.number1 = num1;
    this.number2 = num2;
    this.number3 = num3;
}
public long max(){
    if(this.number1 >= this.number2 && this.number1 >= this.number3){
        return this.number1;
    }else if(this.number2 >= this.number1 && this.number2 >= this.number3){
        return this.number2;
    }else{
        return this.number3;
    }
}
    public long min(){
        if(this.number1 <= this.number2 && this.number1 <= this.number3){
            return this.number1;
        }else if(this.number2 <= this.number1 && this.number2 <= this.number3){
            return this.number2;
        }else{
            return this.number3;
        }
    }

}
