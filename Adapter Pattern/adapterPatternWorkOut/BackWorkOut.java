package adapterPatternWorkOut;

public class BackWorkOut implements UpperBody{


    @Override
    public void FrontworkOut(Integer Height, String WorkOutType) {
    }

    @Override
    public void BackworkOut(Integer Height, String WorkOutType) {
        if(Height == 13){
            System.out.println(Height+"칸으로"+" "+"변경하면"+" "+WorkOutType+"를 할수 있어!");
        }
    }
}
