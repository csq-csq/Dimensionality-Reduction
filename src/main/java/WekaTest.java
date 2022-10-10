import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.attributeSelection.PrincipalComponents;

public class WekaTest {
    public static void main(String[] args) throws Exception {
        Instances data1;
        {
            try {
                data1 = DataSource.read("src/main/resources/cpu.arff");
                data1.setClassIndex(data1.numAttributes()-1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Pca p=new Pca();
        p.out(data1);


        
    }


}
