package com.algorithm.linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class PlusList {
	
	public static void main(String[] args){
		
		LinkedList<Integer> first = new LinkedList<Integer>();
		LinkedList<Integer> second = new LinkedList<Integer>();
		first.add(1);
		first.add(1);
		first.add(7);
		first.add(6);
		second.add(0);
		second.add(0);
		second.add(8);
		second.add(7);
		
		Collections.reverse(first);
		Collections.reverse(second);
		
		LinkedList<Integer> result = plus(first,second);
		printLinked(result);
		Collections.reverse(result);
		System.out.println();
		printLinked(result);

		
		
		Linkedplus();
		//System.exit(0);
	}
	
	public static LinkedList<Integer> printLinked(LinkedList<Integer> lk){
		
		for(int i=0;i<lk.size();i++)
		System.out.print(lk.get(i)+",");

		
		return null;
		
	}
	
	public static LinkedList<Integer> plus(LinkedList<Integer> a,LinkedList<Integer> b)
	{
		int n = a.size()>=b.size()?a.size():b.size();
		LinkedList<Integer> result = new LinkedList<Integer>();
		int jinwei =0;
		for(int i=0;i<n;i++)
		{
			int sum = a.get(i)+b.get(i);
			result.add(sum%10+jinwei);
			jinwei = sum/10;
		}
		return result;
	}
	
	public static void Linkedplus(){
		
		Linked<Integer> first = new Linked<Integer>();
		Linked<Integer> second = new Linked<Integer>();
		first.linkLast(1);
		first.linkLast(1);
		first.linkLast(7);
		first.linkLast(6);
		second.linkLast(0);
		second.linkLast(0);
		second.linkLast(8);
		second.linkLast(7);
		System.out.println();
		for(int i=0;i<first.size();i++)
		System.out.print(first.get(i)+",");
		
		first.reverse();
		second.reverse();
		int n = first.size()>=second.size()?first.size():second.size();
		Linked<Integer> result = new Linked<Integer>();
		int jinwei =0;
		for(int i=0;i<n;i++)
		{
			int sum = first.get(i)+second.get(i);
			result.linkFirst(sum%10+jinwei);
			jinwei = sum/10;
		}
		System.out.println();
		//result.reverse();
		for(int i=0;i<result.size();i++)
		System.out.print(result.get(i)+",");

	}
	
	

}
