import org.junit.Test;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class PcaTest {
    Instances data;
    {
        try {
            data= ConverterUtils.DataSource.read("src/main/resources/cpu.arff");
            data.setClassIndex(data.numAttributes()-1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testCpu() throws Exception {
        data=ConverterUtils.DataSource.read("src/main/resources/cpu.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data);
    }

    @Test
    public void testTitanic() throws Exception {
        data=ConverterUtils.DataSource.read("src/main/resources/titanic.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data);
    }

    @Test
    public void testDiabetes() throws Exception{
        data=ConverterUtils.DataSource.read("src/main/resources/diabetes.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data);
    }
}
