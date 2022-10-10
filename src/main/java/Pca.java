import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.Ranker;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.attributeSelection.PrincipalComponents;
import weka.filters.Filter;

public class Pca {
    public void out(Instances data,int number) throws Exception {
        Ranker ranker = new Ranker();
        ranker.setNumToSelect(number);

        PrincipalComponents pca=new PrincipalComponents();
        pca.buildEvaluator(data);

//        pca.setCenterData(true);

        AttributeSelection as = new AttributeSelection();
        as.setEvaluator(pca);
        as.setSearch(ranker);
        as.SelectAttributes(data);
        Instances instances = as.reduceDimensionality(data);
//        System.out.println(instances.toString());
        System.out.println(pca);
    }


}
