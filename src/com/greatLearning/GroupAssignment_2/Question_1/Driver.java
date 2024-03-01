package com.greatLearning.GroupAssignment_2.Question_1;
import java.util.*;

public class Driver {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building :");
		int floor=in.nextInt();

		constructionData cdObject;
		Driver object=new Driver();
		ArchitectAlgo AA=new ArchitectAlgo();

		int floorSize;
		int day=0;
		List<constructionData> Arrangement=new ArrayList<>();

		for(int i=1; i<=floor; i++)
		{
			System.out.println("enter the floor size given on day : "+i);
			floorSize=in.nextInt();
			day++;
			cdObject=new constructionData(floorSize,day);
			Arrangement.add(cdObject);
		}
		Arrangement=object.SelectionAlgo(Arrangement);

		AA.DisplayOrder(Arrangement, floor);
		in.close();

	}

	public List<constructionData> SelectionAlgo(List<constructionData> arrangement)
	{

		constructionData temp;
		for (int i=0; i<arrangement.size()-1; i++)
		{
			int mindex=i;
			for(int j=i+1; j<arrangement.size(); j++)
			{
				if(arrangement.get(j).floorSize>arrangement.get(mindex).floorSize)
					mindex=j;
			}

			temp=arrangement.get(i);
			arrangement.set(i,arrangement.get(mindex));
			arrangement.set(mindex,temp);
		}

		return arrangement;
	}

}
