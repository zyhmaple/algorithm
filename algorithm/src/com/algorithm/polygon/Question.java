package com.algorithm.polygon;

import java.util.ArrayList;
import java.util.List;

public class Question {

	public static void main(String argu[]){
		
		ArrayList<Coordinate> pNode = new ArrayList<Coordinate>();
		pNode.add(new Coordinate(0,0));
		pNode.add(new Coordinate(0,5));
		pNode.add(new Coordinate(5,5));
		pNode.add(new Coordinate(5,10));
		pNode.add(new Coordinate(15,10));
		pNode.add(new Coordinate(15,0));
		
		printKnodeCoor(pNode, 6, 6);
		
	}
	
	
	public static List<Coordinate> printKnodeCoor(ArrayList<Coordinate> P,int n,int k){
		
		List<Coordinate> knodeList = new ArrayList<Coordinate>();
		double circle = 0;//周长
		List<Double> edgeLen = new ArrayList<Double>();
		
		for(int i=0;i<n;i++){
			Coordinate first = P.get(i);
			Coordinate second = i+1==n?P.get(0):P.get(i+1);
			//正数是向上，向左，负数向下，向右
			edgeLen.add(second.getY()-first.getY()+second.getX()-first.getX());
			circle +=Math.abs(second.getY()-first.getY()+second.getX()-first.getX());			
		}
		
		double kLen = circle/(k+1);//k个点间距
		//记录多边形各边长度，以及方向
		double tempLen=0;
		int nk =1;
		for(int j=0;j<n;j++)
		{
			tempLen+=Math.abs(edgeLen.get(j));
			if(tempLen>=kLen*nk)
			{
				Coordinate first = P.get(j);
				Coordinate second = j+1==n?P.get(0):P.get(j+1);
				Coordinate knode = getKnode(first,second,tempLen-kLen*nk);
				System.out.println("K"+nk+"("+knode.getX()+","+knode.getY()+")");
				nk++;
			}
		}
		return knodeList;
	}
	
	public static Coordinate getKnode(Coordinate first,Coordinate second,double diff ){
		Coordinate knode = new Coordinate();
		if(first.getX() == second.getX()){
			knode.setX(first.getX());
			knode.setY(Math.abs(second.getY()-diff));
			
		}else
		{
			knode.setY(first.getY());
			knode.setX(Math.abs(second.getX()-diff));
		}
		return knode;
	};

	
	
}
