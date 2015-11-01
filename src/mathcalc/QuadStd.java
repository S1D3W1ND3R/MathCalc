package mathcalc;

/**
 * This calculator will ask you what form a quadratic equation is in, and based
 * on that, ask you for the constants. It will always give you the vertex and
 * y-intercept, and the x-intercepts if applicable.
 *
 * @author Alex Jordan
 */
public class QuadStd {

    final private double stdA;
    final private double stdB;
    final private double stdC;

    private double vtxA;
    private double vtxH;
    private double vtxK;

    private double yIntercept;
    private double xInt1;
    private double xInt2;

    /**
     *
     * @param stdA
     * @param stdB
     * @param stdC
     */
    public QuadStd(double stdA, double stdB, double stdC) {
        this.stdA = stdA;
        this.stdB = stdB;
        this.stdC = stdC;
        figurer();
    }
    
    /**
     *
     */
    final public void figurer(){
        
        vtxA = stdA;
        vtxH = (-1 * stdB) / (2 * stdA);
        vtxK = (stdA * Math.pow(vtxH, 2) + (stdB * vtxH) + stdC);

        yIntercept = stdC;

        xInt1 = quadFormulaPos(stdA, stdB, stdC);
        xInt2 = quadFormulaNeg(stdA, stdB, stdC);
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double quadFormulaPos(double a, double b, double c) {
        double x;
        x = ((b * -1) + Math.sqrt((Math.pow(b, 2.0) - 4 * a * c))) / (2 * a);
        return x;
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static double quadFormulaNeg(double a, double b, double c) {
        double x;
        x = ((b * -1) - Math.sqrt((Math.pow(b, 2.0) - 4 * a * c))) / (2 * a);
        return x;
    }

    /**
     *
     * @return
     */
    public double getVtxH() {
        return vtxH;
    }

    /**
     *
     * @return
     */
    public double getVtxK() {
        return vtxK;
    }

    /**
     *
     * @return
     */
    public double getyIntercept() {
        return yIntercept;
    }

    /**
     *
     * @return
     */
    public double getxInt1() {
        return xInt1;
    }

    /**
     *
     * @return
     */
    public double getxInt2() {
        return xInt2;
    }

}
