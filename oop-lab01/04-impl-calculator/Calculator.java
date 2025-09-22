class Calculator {
    int nOpDone;
    double lastRes;
    
    void build(){
        nOpDone = 0;
        lastRes = 0;
    } 

    double add(double a, double b){
        lastRes = a + b;
        nOpDone++;
        return lastRes;
    }

    double sub(double a, double b){
        lastRes = a - b;
        nOpDone++;
        return lastRes;
    }

    double mul(double a, double b) {
        lastRes = a * b;
        nOpDone++;
        return lastRes;   
    }
    
    double div(double a, double b) {
        // if (b == 0)
        //     throw new Error("Non puoi dividere per zero");
        lastRes = a / b;
        nOpDone++;
        return lastRes;
    }
} 