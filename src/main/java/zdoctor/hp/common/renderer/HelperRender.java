package zdoctor.hp.common.renderer;

public class HelperRender {
    public static double partialTicks;
    public static double calcRenderPos(double pos, double prevPos) {
        return prevPos+((pos-prevPos)*HelperRender.partialTicks);
    }
}
