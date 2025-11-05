package com.demo.coolcoder.string.handler;

public class DynamicQueryBuilder {
	
	public static void main(String[] args) {
		SearchCriteria searchCriteria1 = new SearchCriteria(1, null,null,null);
		String queryResult1 = buildQuery(searchCriteria1);
		System.out.println(queryResult1);
		
		SearchCriteria searchCriteria2 = new SearchCriteria(1,"chandu",null,null);
		String queryResult2 = buildQuery(searchCriteria2);
		
		System.out.println(queryResult2);
		
		
		SearchCriteria searchCriteria3 = new SearchCriteria(1,"chandu","male",null);
		String queryResult3 = buildQuery(searchCriteria3);
		
		System.out.println(queryResult3);
		
		
		SearchCriteria searchCriteria4 = new SearchCriteria(1,"chandu","male","chandu@gmail.com");
		String queryResult4 = buildQuery(searchCriteria4);
		
		System.out.println(queryResult4);
	}

	private static String buildQuery(SearchCriteria searchCriteria) {
		
		//String baseQuery = "select * from employee";
		StringBuilder baseQuery = new StringBuilder("select * from employee");
		int count = 0;
		
		if (searchCriteria.getEmpId() != 0) {
			baseQuery.append(" where id ="+searchCriteria.getEmpId());
			count++;
		}
		
		if (searchCriteria.getEmpName() != null && !searchCriteria.getEmpName().equals("")) {
			if (count == 0) {
				baseQuery.append(" where");
			}
			else {
				baseQuery.append(" and");
			}
			baseQuery.append(" name ="+searchCriteria.getEmpName());
			count++;
		}
		
		
		if (searchCriteria.getGender() != null && !searchCriteria.getGender().equals("")) {
			if (count == 0) {
				baseQuery.append(" where");
			}
			else {
				baseQuery.append(" and");
			}
			baseQuery.append(" gender ="+searchCriteria.getGender());
			count++;
		}
		
		if (searchCriteria.getEmail() != null && !searchCriteria.getEmail().equals("")) {
			if (count == 0) {
				baseQuery.append(" where");
			}
			else {
				baseQuery.append(" and");
			}
			baseQuery.append(" email ="+searchCriteria.getEmail());
			count++;
		}
		return baseQuery.toString();
		
	}
	


}
