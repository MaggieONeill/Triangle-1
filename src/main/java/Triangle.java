


public class Triangle {
  private int mSide_1;
  private int mSide_2;
  private int mSide_3;

    public Triangle (int side_1, int side_2, int side_3){
      mSide_1 = side_1;
      mSide_2 = side_2;
      mSide_3 = side_3;
    }

    public Triangle (Integer side_1, Integer side_2, Integer side_3){
      mSide_1 = side_1;
      mSide_2 = side_2;
      mSide_3 = side_3;
    }

    public int getSide_1(){
      return mSide_1;
    }

    public int getSide_2(){
      return mSide_2;
    }

    public int getSide_3(){
      return mSide_3;
    }

    public boolean isNotTriangle(){
      return (mSide_1 + mSide_2 < mSide_3) || (mSide_2 + mSide_3 < mSide_1) || (mSide_1 + mSide_3 < mSide_2);
      // return System.out.println("Is not a triangle");
    }

    public String isTriangle(){
      if  (mSide_1 == mSide_2 && mSide_2 == mSide_3) {
        return "Triangle is an Equilateral";
      } else if (mSide_1 == mSide_2 || mSide_1 == mSide_3 || mSide_2 == mSide_3){
        return "Triangle is an Isosceles!";
      } else {
        return "Triangle is a Scalene!";
      }
    }
  }
