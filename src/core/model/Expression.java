package core.model;

public class Expression {
    private float op1;
    private float op2;


    public Expression(float op1, float op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public Expression() {
    }

    public float getOp1() {
        return op1;
    }

    public void setOp1(float op1) {
        this.op1 = op1;
    }

    public float getOp2() {
        return op2;
    }

    public void setOp2(float op2) {
        this.op2 = op2;
    }

    public float addMethod(){
        return op1+op2;
    }

    public float mulMethod(){
        return op1*op2;
    }

    public float divMethod(){
        return op1/op2;
    }

    public float subsMethod(){
        return op1-op2;
    }
}
