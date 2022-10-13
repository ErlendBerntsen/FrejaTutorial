package no.hvl.freja;

import no.hvl.annotations.*;

public class HelloWorld {

    @Exercise(id = {1}, transformOption = TransformOption.REPLACE_SOLUTION, replacementId = "1")
    public static void main(String[] args){
        String helloWorldMessage = "Hello World!";
        SolutionStart start;
        System.out.print(helloWorldMessage);
        SolutionEnd end;
    }

    @Remove
    @ReplacementCode(id = "1")
    public void replacement(){
        System.out.print("");
    }

}
