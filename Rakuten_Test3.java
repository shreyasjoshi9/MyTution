// you're working as a tester in a factory. your goal is to implement a ProductionLineTester.test() method which accepts a Stream<Product> as an argument and returns a {roductLineTestReport:

// class ProductLineTestReport {
// 	long correctCounter; //number of correct products
// 	long checkedExcCounter; // number of products which threw a checked exception during verification
// 	long uncheckedExcCounter; // number of products which threw an uncheked exception during verification
// 	long otherExcCounter; // number of products which threw an error during verification

// productLineTestReport(long correctCounter, long checkedExcCounter, long uncheckedExcCounters, long otherExcCounter){
// 	this. correctCounter = correctCounter;
// 	this.checkedCounter = checkedCounter;
// 	this.uncheckedExcCounter = uncheckedExcCounter;
// 	this.otherExcCounter = otherExcCounter;
// 	}
// }

// To test a Stream<product> (order is important) you must:
// 	1. filter out null values
// 	2. filter out all product instances whose status field of type String is equal to "invalid" (the comparison should be case insensitive and Product follows JavaBeans conventions);
// 	3. ignore the first 10 products;
// 	4. restrict processing to 20 products;
// 	5. call ProductVerifier.verify(Product) for each product.

// unfortunately, ProductVerifier.verify(Product) is marked as void, and if the product is invalid it throws a checked exception or an unchecked exception. or even an Error. The ProductVerifier interface is defined as follows:

// interface ProductVerifier {
// 	void verify(Product product) throws Exception;
// }

// your goal is to count how many:

// 1. checked exceptions were thrown.
// 2. unchekced exceptions were thrown.
// 3. Errors were thrown.
// 4. correct products were in the line.

// and return an instance of ProductTestReport.

// Also, whatever argumnent you get as input to ProductionLineTester.test(), you must not return null - return an empty report in such a case. An empty report is a report with all *Counter values set to zero (0).

// import java.util.stream.Stream;

// class ProductionLineTester{
// 	private final ProductVerifier verifier;
// 	ProductionLineTester(Productverifier verifier){
// 	this.verifier = verifier;
// 	}
// 	ProductLineTestReport test(Stream<Product> products){
// 	return null;
// 	}
// }
public class Rakuten_Test3 {

}
