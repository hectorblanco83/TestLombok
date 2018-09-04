package hb.lombok;

public class Main {
	
	
	public static void main(String[] args) {
		
		// Test @AllArgsConstructor, that isn't defined
		PojoTest pojo = new PojoTest("One attribute", "Another attribute");
		
		// Test @Getter and @Setter, that isn't defined
		System.out.println("An attribute: " + pojo.getAtt());
		
		pojo.setAnotherAtt("Manually set Another Attribute");
		System.out.println("Another attribute: " + pojo.getAnotherAtt());
		
	}
	
}
