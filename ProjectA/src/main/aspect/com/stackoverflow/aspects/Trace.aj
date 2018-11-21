package com.stackoverflow.aspects;

public aspect Trace {
    pointcut publicMethodExecuted(): execution(public * *(..));

    after(): publicMethodExecuted() {
        System.out.printf("----------Retorna o método: %s. \n\n", thisJoinPoint.getSignature());
    }

    before(): publicMethodExecuted() {
        System.out.printf("----------Entrada no método: %s. \n", thisJoinPoint.getSignature());

        Object[] arguments = thisJoinPoint.getArgs();
        for (int i =0; i < arguments.length; i++){
            Object argument = arguments[i];
            if (argument != null){
                System.out.printf("------------------------Com o argumento do tipo %s e de valor: %s. \n", argument.getClass().toString(), argument);
            }
        }
//        System.out.printf("Retorna o método: %s. \n", thisJoinPoint.getSignature());
    }
}
