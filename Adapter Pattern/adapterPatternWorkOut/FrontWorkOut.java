package adapterPatternWorkOut;

public class FrontWorkOut implements UpperBody{


    @Override
    public void FrontworkOut(Integer Height, String WorkOutType) {
        if(Height == 10){
            System.out.println(Height+"칸으로"+" "+"변경하면"+" "+WorkOutType+"를 할수 있어!");
        }
    }

    @Override
    public void BackworkOut(Integer Height, String WorkOutType) {
    }
}
