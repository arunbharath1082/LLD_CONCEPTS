package practice;

public class Flutter {

    public void theme(){
        System.out.println("Theme is changed successfulluy");
    };
    public void function(){
        System.out.println("function is changed succeesfully");
    };

    public UIFFactoryFactory getUi(Platforms platforms){
   return UIFFactory.uifFactoryFactory(platforms);
    }
}
