package epam.com.clean_code;

/**
 * Hello world!
 *
 */
public class House 
{
	public static double FullyHomeCost(String Mat_Standard,double areaofhouse)
	{
		double cost=0;
		if(Mat_Standard.equals("StandardMaterials"))
		{
			cost=1200*(areaofhouse);
		}
		else if(Mat_Standard.equals("above StandardMaterials "))
			
		{
			cost=1500*(areaofhouse);
		}
		else if(Mat_Standard.equals("HighStandardMaterials"))
		{
			cost=1800*(areaofhouse);
		}
		else if(Mat_Standard.equals("HighStandardMaterialAndFullyAutomatedHome"))
		{
			cost=2500*(areaofhouse);
		}
		return cost;
	}
}
