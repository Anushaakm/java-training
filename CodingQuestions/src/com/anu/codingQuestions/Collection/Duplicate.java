package com.anu.codingQuestions.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
	  public boolean containsDuplicates(Integer[] nums) { // eff = 1 + n + 1 + 1 = 3 + n = n

	        Set<Integer> set = new HashSet<>(Arrays.asList(nums)); // 1
	        return set.size() != nums.length; // 1
	  }
}
