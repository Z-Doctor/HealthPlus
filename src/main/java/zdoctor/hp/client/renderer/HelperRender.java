package zdoctor.hp.client.renderer;

public class HelperRender {
  public static double partialTicks = 0;
  
  public static double calcRenderPos(double pos, double prevPos) {
    return (double) (prevPos + (pos - prevPos) * HelperRender.partialTicks);
  }
}
