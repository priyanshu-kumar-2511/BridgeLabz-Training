package com.collections.insurancepolicymanagementsystem;

import java.time.*;
import java.util.*;

public class InsurancePolicyManager {
	private Set<Policy> hashSet = new HashSet<>(); 
	private Set<Policy> linkedHashSet = new LinkedHashSet<>();
	private Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate).thenComparing(Policy::getPolicyNumber));
	
	public void addPolicy(Policy policy) {
		hashSet.add(policy);
		linkedHashSet.add(policy);
		treeSet.add(policy);
	}
	
	public void displayAll(Set<Policy> set) { 
		for(Policy p : set) {
			System.out.println(p);
		}
	}
	
	public void showExpiringSoon() {
		LocalDate today = LocalDate.now();
		LocalDate limit = today.plusDays(30);
		
		for(Policy p : hashSet) {
			if(!p.getExpiryDate().isAfter(limit)) {
				
			}
		}
	}
	
	public void filterByCoverage(String type) {
		for(Policy p : hashSet) {
			if(p.getCoverageType().equalsIgnoreCase(type)) {
				System.out.println(p);
			}
		}
	}
	
	public void performanceTest() {
		List<Policy> sample = new ArrayList<>(hashSet);
		long start, end;
		
		// HashSet Time
		start = System.nanoTime();
		for(Policy p : sample)
			hashSet.contains(p);
		end = System.nanoTime();
		System.out.println("HashSet search time: " + (end - start));
		
		// LinkedHashSet
		start = System.nanoTime();
		for(Policy p : sample)
			linkedHashSet.contains(p);
		end = System.nanoTime();
		System.out.println("LinkedHashSet search time: "+ (end - start));
		
		// TreeSet
		start = System.nanoTime();
		for(Policy p : sample)
			treeSet.contains(p);
		end = System.nanoTime();
		System.out.println("TreeSet search time: "+ (end - start));
	}
	
	public Set<Policy> getHashSet() { return hashSet; }
    public Set<Policy> getLinkedHashSet() { return linkedHashSet; }
    public Set<Policy> getTreeSet() { return treeSet; }
}
