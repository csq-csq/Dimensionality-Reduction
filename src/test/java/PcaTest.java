import org.junit.Test;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

public class PcaTest {
    Instances data;

    @Test
    public void testCpuPca() throws Exception {
        data=ConverterUtils.DataSource.read("src/main/resources/cpu.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data,3,2);
    }

    @Test
    public void testCpuResult() throws Exception{
        data=ConverterUtils.DataSource.read("src/main/resources/cpu.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data,3,1);
    }

    @Test
    public void testTitanicPca() throws Exception {
        data=ConverterUtils.DataSource.read("src/main/resources/titanic.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data,4,2);
    }

    @Test
    public void testTitanicResult() throws Exception {
        data=ConverterUtils.DataSource.read("src/main/resources/titanic.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data,4,1);
    }

    @Test
    public void testDiabetesPca() throws Exception{
        data=ConverterUtils.DataSource.read("src/main/resources/diabetes.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data,4,2);
    }

    @Test
    public void testDiabetesResult() throws Exception{
        data=ConverterUtils.DataSource.read("src/main/resources/diabetes.arff");
        data.setClassIndex(data.numAttributes()-1);
        new Pca().out(data,4,1);
    }
}
