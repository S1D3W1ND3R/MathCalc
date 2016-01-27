package mathcalc;

/**
 * This calculator will ask you what form a quadratic equation is in, and based
 * on that, ask you for the constants. It will always give you the vertex and
 * y-intercept, and the x-intercepts if applicable.
 *
 * @author Alex Jordan
 */
public class QuadVtx {

    final private double vtxA;
    final private double vtxH;
    final private double vtxK;
    
    private double stdA;
    private double stdB;
    private double stdC;

    private double yIntercept;
    private double xInt1;
    private double xInt2;

    /**
     *
     * @param vtxA
     * @param vtxH
     * @param vtxK
     */
    public QuadVtx(double vtxA, double vtxH, double vtxK) {
        this.vtxA = vtxA;
        this.vtxH = vtxH;
        this.vtxK = vtxK;
        figurer();
    }

    /**
     *
     */
    final public void figurer() {

        stdA = vtxA;
        stdB = vtxA * -2 * vtxH;
        stdC = Math.pow(vtxA + vtxH, 2) + vtxK;

        //y-intercept
        yIntercept = vtxA * Math.pow(vtxH, 2) + vtxK;

        //x-intercepts
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

    public double getStdA() {
        return stdA;
    }

    public double getStdB() {
        return stdB;
    }

    public double getStdC() {
        return stdC;
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
