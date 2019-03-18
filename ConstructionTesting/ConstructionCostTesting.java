import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import construction.ConstructionCost;

class ConstructionCostTesting {
	ConstructionCost test=new ConstructionCost();

	@Test
	public void testCostOfConstruction() {
		//These are test cases for standard material
		assertEquals("please check the costOfConstruction function",1080000,test.costOfConstruction(1,900),0.0);
		assertEquals("please check the costOfConstruction function",1185451.2,test.costOfConstruction(1,987.876),0.0);
		assertEquals("please check the costOfConstruction function",1076385.1848,test.costOfConstruction(1,896.987654),0.0);
		//These are the test Cases for Above Standard Materials.
		assertEquals("please check the costOfConstruction function",2250000,test.costOfConstruction(2,1500),0.0);
		assertEquals("please check the costOfConstruction function",1481814,test.costOfConstruction(2,987.876),0.0);
		assertEquals("please check the costOfConstruction function",1345481.4810000001,test.costOfConstruction(2,896.987654),0.0);
		//These are the test Cases for High Standard Material.
		assertEquals("please check the costOfConstruction function",1620000,test.costOfConstruction(3,900),0.0);
		assertEquals("please check the costOfConstruction function",1778176.8,test.costOfConstruction(3,987.876),0.0);
		assertEquals("please check the costOfConstruction function",1614577.7772000001,test.costOfConstruction(3,896.987654),0.0);
		// These are the test Cases for Highly Standard Materials with Fully Automated Home.
		assertEquals("please check the costOfConstruction function",2250000,test.costOfConstruction(4,900),0.0);
		assertEquals("please check the costOfConstruction function",2469690,test.costOfConstruction(4,987.876),0.0);
		assertEquals("please check the costOfConstruction function",2242469.1350000002,test.costOfConstruction(4,896.987654),0.0);
		
	}

}
