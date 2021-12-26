package adapterPatternWorkOut;

public class UpperBodyAdapter implements WorkOut{
    UpperBody upperbody;

    public UpperBodyAdapter(Integer Height){
        if(Height == 10){
            upperbody = new FrontWorkOut();
        }else if(Height == 13){
            upperbody = new BackWorkOut();
        }
    }

    @Override
    public void workOut(Integer Height, String WorkOutType) {
        if(Height == 10){
            upperbody.FrontworkOut(Height, WorkOutType);
        }else if(Height == 13){
            upperbody.BackworkOut(Height, WorkOutType);
        }
    }
}
