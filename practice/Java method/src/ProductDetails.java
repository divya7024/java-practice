import java.util.Scanner;
public class ProductDetails {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
		        Product p=new Product();
		        System.out.println("Enter the Product Id");
		        long Id=Integer.parseInt(sc.nextLine());
		        p.setId(Id);
		        
		        System.out.println("Enter product name");
		        p.setProductName(sc.nextLine());
		        
		        System.out.println("Enter supplier name");
		        p.setSupplierName(sc.nextLine());
		      
		        System.out.println("Product Id is " +p.getId());
		        System.out.println("Product Name is " +p.getProductName());
		        System.out.println("Supplier Name is " +p.getSupplierName());
		        
		        
	}

}
