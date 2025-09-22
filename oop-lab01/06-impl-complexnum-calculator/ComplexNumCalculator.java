class ComplexNumCalculator {
    int nOpDone;
    ComplexNum lastRes;

    void build(){
        this.nOpDone = 0;
        this.lastRes = new ComplexNum();
        this.lastRes.build(0,0);
    } 

    ComplexNum add(ComplexNum c1, ComplexNum c2){
        this.lastRes = new ComplexNum();
        lastRes.build(c1.re+c2.re, c1.im+c2.im);
        this.nOpDone++;
        return this.lastRes;
    } 

    ComplexNum sub(ComplexNum c1, ComplexNum c2){
        this.lastRes = new ComplexNum();
        lastRes.build(c1.re-c2.re, c1.im-c2.im);
        this.nOpDone++;
        return this.lastRes;
    }

    ComplexNum mul(ComplexNum c1, ComplexNum c2){
        double a = c1.re;
        double b = c1.im;
        double c = c2.re;
        double d = c2.im;
        this.lastRes = new ComplexNum();
        lastRes.build(a*c - b*d,a*d + b*c);
        this.nOpDone++;
        return this.lastRes;
    }

    ComplexNum div(ComplexNum c1, ComplexNum c2){
        double a = c1.re;
        double b = c1.im;
        double c = c2.re;
        double d = c2.im;
        this.lastRes = new ComplexNum();
        lastRes.build((a*c+b*d)/(c*c+d*d), (b*c-a*d)/(c*c+d*d));
        return this.lastRes;
    }
} 