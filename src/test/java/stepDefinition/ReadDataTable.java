package stepDefinition;

import java.util.List;

import io.cucumber.java.en.When;

public class ReadDataTable {
	@When("read the data from the below table")
	public void read_the_data_from_the_below_table(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> data =dataTable.asLists();
		String empId= data.get(0).get(1);
		System.out.println(empId);
	}
}
