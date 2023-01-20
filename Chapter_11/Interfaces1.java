// interface Relation {
//   public boolean isGreater(Object a, Object b);

//   public boolean isLess(Object a, Object b);

//   public boolean isEqual(Object a, Object b);
// };

// public class Interfaces1 implements Relation {
//   private double x1;
//   private double x2;
//   private double y1;
//   private double y2;

//   public Line(double x1, double x2, double y1, double y2) {
//     this.x1 = x1;
//     this.x2 = x2;
//     this.y1 = y1;
//     this.y2 = y2;
//   }

//   public double getLength() {
//     double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//     return length;
//   }

//   public boolean isGreater() {
//     double aLen = ((Line)a).getLength();
//     double bLen = ((Linb)b).getLength();
//     return (aLen > bLen);
//   }

//   public boolean isLess() {
//     double aLen = ((Line) a).getLength();
//     double bLen = ((Linb) b).getLength();
//     return (aLen < bLen);
//   }

//   public boolean isEqual() {
//     double aLen = ((Line) a).getLength();
//     double bLen = ((Linb) b).getLength();
//     return (aLen == bLen);
//   }

//   @Overrideo
//   public boolean isGreater(Object a, Object b) {
//     // TODO Auto-generated method stub
//     return false;
//   }

//   @Override
//   public boolean isLess(Object a, Object b) {
//     // TODO Auto-generated method stub
//     return false;
//   }

//   @Override
//   public boolean isEqual(Object a, Object b) {
//     // TODO Auto-generated method stub
//     return false;
//   }
// }
