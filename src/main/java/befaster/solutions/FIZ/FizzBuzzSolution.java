package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {
//
//    - If the number is a multiple of three then you should write "fizz"
//            - If the number is a multiple of five then you should write "buzz"
//            - If the number is a multiple of both three and five then you should write "fizz buzz"
//            - If the number is not a multiple of five or three then write the number, example 1

    public String fizzBuzz(Integer number)
    {

        StringBuilder result = new StringBuilder();
        if(number%3==0||number.toString().contains("3")){
            result.append("fizz ");
        }
        if(number%5==0||number.toString().contains("5")){
            result.append("buzz");
        }
        if(result.length()==0){
            result.append(number);
        }



        return result.toString().trim();
    }

}
