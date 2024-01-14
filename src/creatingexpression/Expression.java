package creatingexpression;

import calculation.Steoenvariable;

public class Expression {
    public String variableone;
    private int degree;
   public String variabletwo;
    private float nomberone;
    private float nombertwo;
    public String znak;

    public String getVariableone() {
        return variableone;
    }

    public void setVariableone(String variableone) {
        this.variableone = variableone;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public void setVariabletwo(String variabletwo) {
        this.variabletwo = variabletwo;
    }

    public String getVariabletwo() {
        return variabletwo;
    }

    public void setNomberone(float nomberone) {
        this.nomberone = nomberone;
    }

    public float getNomberone() {
        return nomberone;
    }

    public float getNombertwo() {
        return nombertwo;
    }

    public void setNombertwo(float nombertwo) {
        this.nombertwo = nombertwo;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }

    public String getZnak() {
        return znak;
    }
}
