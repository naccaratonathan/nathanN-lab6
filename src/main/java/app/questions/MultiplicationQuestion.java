package app.questions;

import java.util.Random;

public class MultiplicationQuestion extends ArithmeticQuestion{

    public MultiplicationQuestion(Random rand) {
        this.operand1 = rand.nextInt(0, 12);
        this.operand2 = rand.nextInt(0, 12);
        operatorSymbol = 'x';
    }
    @Override
    public double calculateAnswer(){
        return operand1 * operand2;
    }
}