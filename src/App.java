// import lower.assignment1.PostfixEvaluation;
// import lower.lesson12.NumberStack;

// public class App {
//     public static void main(String[] args) throws Exception {
//         NumberStack numberStack = new NumberStack();
//         numberStack.push(1);
//         numberStack.push(2);

//         PostfixEvaluation p = new PostfixEvaluation();

//         p.expression = "239*+5/";

//         System.out.println(numberStack.pop());
//         // System.out.println(numberStack.pop());
//         System.out.println(numberStack.isEmpty());
//         int result = p.evaluate();

//         System.out.println(result);
//     }
// }

import lower.lesson16.CoffeeMachine;

public class App {
    public static void main(String[] args) throws Exception{

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setIsOn(true);
        coffeeMachine.getIsOn();
    }
}