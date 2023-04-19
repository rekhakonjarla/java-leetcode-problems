29.Letter Combinations of a Phone Number

SOLUTION:-

class Solution {

	public List<String> letterCombinations(String digits) {



		ArrayList<String> ans = new ArrayList<>();

		if(digits.length() == 0) return ans;

		String[] mapping = {"" , "" , "abc" ,"def" ,"ghi" ,"jkl", "mno" ,"pqrs" ,"tuv" ,"wxyz"};

		int index = 0;

		StringBuilder  output  = new StringBuilder();

		helper(digits , output , index , ans , mapping);

		return ans;

	}

	static void helper(String digits , StringBuilder output , int index , ArrayList<String> ans , String[] mapping){


		// base case 

		if(index  >= digits.length()){

			String base = output.toString();
			ans.add(base);

			return;
		}

		int ch = digits.charAt(index) - '0';

		String val = mapping[ch];

		for(int i = 0 ; i < val.length() ; i++){

			output.append(val.charAt(i));

			helper(digits,output , index + 1  , ans , mapping);

			output.deleteCharAt(output.length() - 1);

		}

	}
}